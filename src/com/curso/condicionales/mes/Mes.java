package com.curso.condicionales.mes;

public class Mes {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Mes(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Mes{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

}
