package com.fernandomarino.nuevopetagram.pojo;

public class Mascotas {
    private int foto;
    private String nombre;
    private String visitas;

    public Mascotas(int foto, String nombre, String visitas) {
        this.foto = foto;
        this.nombre = nombre;
        this.visitas = visitas;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVisitas() {
        return visitas;
    }

    public void setVisitas(String visitas) {
        this.visitas = visitas;
    }
}