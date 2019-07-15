package com.curso.herencia.pagoTarjeta;
import java.net.InetAddress;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        String ip="";

        try {
           ip = InetAddress.getLocalHost().getHostAddress();
        }

        catch(Exception e) {
            e.printStackTrace();
        }
        IvrClient ivr = new IvrClient("1","Carlos","Gar",ldt);
        ivr.pagarTC();
        ClienteAccion us = new UssdClient("2","Pedro","Gonzales",ip);
        us.pagarTC();


       getMensaje(ivr);

    }
    public static void getMensaje(ClienteAccion clienteAccion){
       clienteAccion.pagarTC();
   }
}
