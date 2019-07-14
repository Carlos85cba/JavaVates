package com.curso.banco.banco;

public class Cliente {
private String nombre;
private int nroCliente;
private Cuenta nroCuenta;

    public Cliente(String nombre, int nroCliente, Cuenta nroCuenta) {
        this.nombre = nombre;
        this.nroCliente = nroCliente;
        this.nroCuenta = nroCuenta;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public Cuenta getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(Cuenta nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    @Override
    public String toString() {
        return "Cliente [nroCliente=" + nroCliente + ", nombre=" + nombre + ", Cuenta=" + nroCuenta + "]";

    }
    }