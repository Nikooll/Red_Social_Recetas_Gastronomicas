package com.red_social.rest.controller.Dao.servicies;

import com.red_social.rest.controller.tda.list.LinkedList;
import models.Persona;
import com.red_social.rest.controller.Dao.PersonaDao;

public class PersonaServicies {
    private PersonaDao obj;
    public PersonaServicies(){
        obj = new PersonaDao();
    }
    public Boolean save() throws Exception{
        return obj.save();    }

    public LinkedList listAll(){
        return obj.getlistAll();

    }

    public Persona getPersona(){
        return obj.getPersona();
    }

    public void setPersona( Persona persona){
        obj.setPersona(persona);
    }
    
}
