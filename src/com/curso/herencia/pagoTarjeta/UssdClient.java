package com.curso.herencia.pagoTarjeta;

public class UssdClient extends ClienteAccion {
    public UssdClient(String nroCliente, String nombre, String apellido) {
        super(nroCliente, nombre, apellido);
    }

    public void pagarTC(){
        System.out.println("Se llama desde USSD" + super.toString());
    }

}
