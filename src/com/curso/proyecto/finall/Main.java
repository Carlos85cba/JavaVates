package com.curso.proyecto.finall;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //limplementa comparable

    public static void main(String[] args) throws MyExcepcion {

        Scanner myScan = new Scanner(System.in);
        System.out.println("Ingrese numero para que se listen todos los numeros");
        String number = myScan.next();
//3513936390
        Api api = new Api();
        ArrayList matchApi = api.getCellularInfo(number);
        BaseDeDatos db = new BaseDeDatos();
        ArrayList matchDB = db.getCellularInfo(number);
        if (matchApi.equals(matchDB)) {
            System.out.println("Coincide");
        } else
            System.out.println("No Coincide");

        System.out.println(matchApi);
        System.out.println(matchDB);

        Cellular capi = api.getCellularInfo2(number);
        Cellular cdb = db.getCellularInfo2(number);

        if (capi.getCellularNumber().equals(cdb.getCellularNumber())){
            System.out.println("Los numeros coinciden");
        }


      //  for(Cellular match1 : matchApi) {
         //   for(Cellular match2 : matchDB) {
           //     if(match1.getCellularNumber().equals(match2.getCellularNumber())) {
            //        System.out.println("Coincide Cellular");

                 //   }
               // }
           // }
        }

    }



