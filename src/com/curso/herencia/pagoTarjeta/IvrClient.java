package com.curso.herencia.pagoTarjeta;

import java.util.Date;
import java.time.LocalDateTime;


public class IvrClient extends ClienteAccion{

    private LocalDateTime ldt;

    public LocalDateTime getLdt() {
        return ldt;
    }

    public void setLdt(LocalDateTime ldt) {
        this.ldt = ldt;
    }

    public IvrClient(String nroCliente, String nombre, String apellido, LocalDateTime ldt ) {
        super(nroCliente, nombre, apellido);
        this.ldt=ldt;

    }

    public void pagarTC(){
        System.out.println("Se llama desde IVR " + "a la hora "+ getLdt() + toString() + super.toString());
    }

    @Override
    public String toString() {
        return "IvrClient{" +
                "ldt=" + ldt +
                '}';
    }
}