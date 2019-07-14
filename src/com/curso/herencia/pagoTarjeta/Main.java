package com.curso.herencia.pagoTarjeta;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        IvrClient ivr = new IvrClient("1","Carlos","Gar",ldt);
        ivr.pagarTC();
        ClienteAccion us = new UssdClient("2","Pedro","Gonzales");
        us.pagarTC();


      //  getMensaje(ivr);

    }
    //public static void getMensaje(ClienteAccion ClienteAccion){
   //     ClienteAccion.pagarTC();
  //  }
}
