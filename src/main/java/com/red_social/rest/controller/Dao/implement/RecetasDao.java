package com.red_social.rest.controller.Dao.implement;

import com.red_social.rest.controller.tda.list.LinkedList;
import com.red_social.rest.controller.tda.list.ListEmptyException;

import models.Recetas;

public class RecetasDao {
    
    private LinkedList<Recetas> recetas = new LinkedList<>(); //<recetas>

    public RecetasDao() {
        this.recetas = new LinkedList<>();
    }


    public LinkedList<Recetas> getRecetas() {
        return recetas;
    }

    public void addReceta(Recetas receta) {
        recetas.add(receta);
    }

    public void getReceta(int id) throws ListEmptyException {
        try {
            recetas.get(id);
        } catch (ListEmptyException e) {
            e.printStackTrace();
        }
    }

    public void guardarReceta() {
    }
    
    public void cargarReceta() {

    }

}
