package models;

public class Categoria {
    private int id_categoria;
    private String tipo;
    private boolean estado;

    public Categoria(int id_categoria, String tipo, boolean estado) {
        this.id_categoria = id_categoria;
        this.tipo = tipo;
        this.estado = estado;
    }

    public int getIdCategoria() {
        return id_categoria;
    }

    public void setIdCategoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}

