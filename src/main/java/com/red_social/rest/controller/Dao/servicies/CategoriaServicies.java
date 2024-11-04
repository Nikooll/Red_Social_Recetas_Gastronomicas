package com.red_social.rest.controller.Dao.servicies;

import models.Categoria;
import com.red_social.rest.controller.Dao.CategoriaDao;
import com.red_social.rest.controller.tda.list.LinkedList;

public class CategoriaServicies {
    private CategoriaDao obj;

    public CategoriaServicies() {
        obj = new CategoriaDao(); // Inicializa el objeto CategoriaDao
    }

    // Método para guardar una categoría
    public Boolean save() throws Exception {
        return obj.save(); 
    }

    // Método para listar todas las categorías
    public LinkedList<Categoria> listAll() {
        return obj.getListAll(); 
    }

    
    public Categoria getCategoria() {
        return obj.getCategoria(); 
    }

    public void setCategoria(Categoria categoria) {
        obj.setCategoria(categoria); 
    }

    public void editCategoria(Categoria categoria) throws Exception {
        obj.edit(categoria); 
    }

    public void deleteCategoria(int id_categoria) throws Exception {
        obj.delete(id_categoria); 
    }
}
