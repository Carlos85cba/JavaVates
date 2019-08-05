package com.curso.proyecto.finall;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //limplementa comparable

    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        System.out.println("Ingrese numero para que se listen todos los numeros");
        String number = myScan.next();

       Api api= new Api();
       ArrayList matchApi = api.getCellularInfo(number);
       BaseDeDatos db = new BaseDeDatos();
       ArrayList matchDB = db.getCellularInfo(number);
       if (matchApi.equals(matchDB)){System.out.println("Coincide");}
       else
           System.out.println("No Coincide");

       System.out.println(matchApi);
        System.out.println(matchDB);


    }



}
