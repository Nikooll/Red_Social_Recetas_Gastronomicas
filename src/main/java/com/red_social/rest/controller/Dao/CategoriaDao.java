package com.red_social.rest.controller.Dao;

import models.Categoria;
import com.red_social.rest.controller.Dao.implement.AdapterDao;
import com.red_social.rest.controller.tda.list.LinkedList;
import com.red_social.rest.controller.tda.list.ListEmptyException;
import com.red_social.rest.controller.tda.list.LinkedList;

public class CategoriaDao extends AdapterDao<Categoria> {
    private Categoria categoria = new Categoria(0, "", true); 
    private LinkedList<Categoria> listAll; 

    public CategoriaDao() {
        super(Categoria.class);
        this.listAll = new LinkedList<>(); 
    }

    public Categoria getCategoria() {
        if (categoria == null) {
            categoria = new Categoria(0, "", true); 
        }
        return this.categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public LinkedList<Categoria>    getListAll() {
        if (listAll == null) {
            this.listAll = new LinkedList<>(); // Inicializamos listAll si está nulo
        }
        return listAll;
    }

    public Boolean save() throws Exception {
        Integer id = getListAll().getSize() + 1; 
        categoria.setIdCategoria(id);
        this.persist(this.categoria); 
        this.listAll.add(categoria); // Agregamos la categoría a la lista
        return true;
    }

    public Boolean edit(Categoria categoria) throws Exception {
        Categoria existente = findCategoriaById(categoria.getIdCategoria());
        if (existente != null) {
            existente.setTipo(categoria.getTipo());
            existente.setEstado(categoria.isEstado());
            return true;
        } else {
            throw new Exception("Categoría no encontrada");
        }
    }

    public Boolean delete(int id_categoria) throws Exception {
        Categoria existente = findCategoriaById(id_categoria);
        if (existente != null) {
            getListAll().remove(existente); 
            return true;
        } else {
            throw new Exception("Categoría no encontrada");
        }
    }

    private Categoria findCategoriaById(int id_categoria) {
    try {
        for (int i = 0; i < getListAll().getSize(); i++) {
            Categoria cat = getListAll().get(i); // Captura la excepción si ocurre
            if (cat.getIdCategoria() == id_categoria) {
                return cat;
            }
        }
    } catch (ListEmptyException e) {
        System.out.println("Error: La lista está vacía o el índice está fuera de rango.");
        
    }
    return null; 
}

}
