package com.curso.proyecto.finall;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //limplementa comparable

    public static void main(String[] args) throws MyExcepcion {
        //3513936390
        Scanner myScan = new Scanner(System.in);
        System.out.println("Ingrese numero para que se listen todos los numeros");
        String number = myScan.next();

        /*ArrayList matchApi = api.getCellularInfo(number);
        ArrayList matchDB = db.getCellularInfo(number);
        if (matchApi.equals(matchDB)) {
            System.out.println("Coincide");
        } else
            System.out.println("No Coincide");

        System.out.println(matchApi);
        System.out.println(matchDB);*/


        Api api = new Api();
        BaseDeDatos db = new BaseDeDatos();
        Cellular capi = api.getCellularInfo2(number);
        Cellular cdb = db.getCellularInfo2(number);

        if (capi.getCellularNumber().equals(cdb.getCellularNumber())) {
            System.out.println("Los numeros de cellular SI coinciden");
        } else {
            System.out.println("Los numeros de cellular NO coinciden");
        }

        //PLANES
        if (capi.getPlanId().getPlanID().equals(cdb.getPlanId().getPlanID()))
            System.out.println("Los planes SI coinciden");
        else
            System.out.println("Los planes NO coinciden");

        if (capi.getPlanId().getPrice().equals(cdb.getPlanId().getPrice()))
            System.out.println("Los precios de planes SI coinciden");
        else
            System.out.println("Los precios de planes NO coinciden");

        //PAQUETES
        int size = capi.getPackages().size();
        int sizedb = cdb.getPackages().size();
        String packNotFound = "";
        try {
            for (int i = 0; i < size; i++) {
                boolean flag = false;
                for (int j = 0; j < sizedb; j++)

                    if (capi.getPackages().get(i).getPackageId().equals(cdb.getPackages().get(j).getPackageId())) {
                        flag = true;
                        if (capi.getPackages().get(i).getPrice().equals(cdb.getPackages().get(j).getPrice())) {
                            System.out.println("Los precios del paquete " + capi.getPackages().get(i).getPackageId() + " SI Coinciden");
                            packNotFound = String.valueOf(capi.getPackages().get(i).getPackageId());

                        } else {
                            System.out.println("Los precios del paquete " + capi.getPackages().get(i).getPackageId() + " NO Coinciden");
                            packNotFound = String.valueOf(capi.getPackages().get(i).getPackageId());

                        }
                    } else {

                        if (flag == false && j == (sizedb-1)) {
                            System.out.println("No se encontro el paquete " + capi.getPackages().get(i).getPackageId());
                    }

                }
            }
        } catch (java.lang.IndexOutOfBoundsException ex) {
            System.out.println("No se encontro el paquete " + packNotFound);
        }


    }
}
//  for(Cellular match1 : matchApi) {
//   for(Cellular match2 : matchDB) {
//     if(match1.getCellularNumber().equals(match2.getCellularNumber())) {
//        System.out.println("Coincide Cellular");

//   }
// }
// }






