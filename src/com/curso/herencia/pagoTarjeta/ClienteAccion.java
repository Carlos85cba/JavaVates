package com.curso.herencia.pagoTarjeta;


abstract class ClienteAccion {
    protected String nroCliente;
    protected String nombre;
    protected String apellido;

    public  ClienteAccion(String nroCliente, String nombre, String apellido) {
        this.nroCliente = nroCliente;
        this.nombre = nombre;
        this.apellido = apellido;
    }



    public String getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(String nroCliente) {
        this.nroCliente = nroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public abstract  void pagarTC();

    @Override
    public String toString() {
        return " ClienteAccion{" +
                " nroCliente='" + nroCliente + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
