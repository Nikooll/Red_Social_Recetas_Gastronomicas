package models;

import java.util.Date;

public class Recetas {
    private int idReceta;
    private String nombre;
    private Date fechaPublicacion;
    private int porciones;
    private boolean favoritos;

    private Persona persona; //relacion
    

    public Recetas( int idReceta, String nombre, Date fechaPublicacion, int porciones, boolean favoritos) {
        this.idReceta = idReceta;
        this.nombre = nombre;
        this.fechaPublicacion = fechaPublicacion;
        this.porciones = porciones;
        this.favoritos = favoritos;
    }

    //getters and setters
    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getPorciones() {
        return porciones;
    }

    public void setPorciones(int porciones) {
        this.porciones = porciones;
    }

    public boolean isFavoritos() {
        return favoritos;
    }

    public void setFavoritos(boolean favoritos) {
        this.favoritos = favoritos;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

}
