package com.curso.herencia.pagoTarjeta;

public class UssdClient extends ClienteAccion {

    private String ipAddress;


    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public UssdClient(String nroCliente, String nombre, String apellido, String ipAddress) {

        super(nroCliente, nombre, apellido);
        this.ipAddress = ipAddress;
    }

    public void pagarTC(){
        System.out.println("Se llama desde USSD " + getIpAddress() + " " + super.toString());
    }

}
