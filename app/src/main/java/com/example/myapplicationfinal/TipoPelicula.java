package com.example.myapplicationfinal;

public class TipoPelicula {
    private String id;
    private String Tipo;
    private String tipoCustom;
    public TipoPelicula(String id, String tipo) {
        this.id = id;
        Tipo = tipo;
    }

    public TipoPelicula() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }
    @Override
    public String toString(){
        this.tipoCustom=this.tipoCustom=id+""+Tipo;
        return tipoCustom;
    }
}
