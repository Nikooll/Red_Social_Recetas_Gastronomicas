package com.red_social.rest.controller.Dao.implement;

import com.red_social.rest.controller.tda.list.LinkedList;
import com.red_social.rest.controller.tda.list.ListEmptyException;

import models.Ingredientes;

public class IngredientesDao {
    
    private LinkedList<Ingredientes> ingredientes;

    public IngredientesDao() {
        this.ingredientes = new LinkedList<>();
    }

    public void addIgredientes(Ingredientes ingrediente) {
        ingredientes.add(ingrediente);
    }

    public Ingredientes getIngredientes(int id) throws ListEmptyException {
        return ingredientes.get(id);
    }

    public LinkedList<Ingredientes> getAllIngredientes() {
        return ingredientes;
    }

    
}
