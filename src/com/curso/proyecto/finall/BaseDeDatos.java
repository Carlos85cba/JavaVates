package com.curso.proyecto.finall;

import java.util.ArrayList;

public class BaseDeDatos {

    ArrayList<Cellular> cellular2 = new ArrayList<Cellular>();


    public BaseDeDatos() {
    }

    public BaseDeDatos(Cellular cel) {

        cellular2.add(cel);


        //cellular.add(new Cellular("32443240",new Plan ("BEST",3434.33F,new Package(new ArrayList<Package>("fdsf",4234.99F))));
    }

    public ArrayList getCellularInfo(String cel) {
        ArrayList<Cellular> dbMatch = new ArrayList<>();
        for (Cellular cel2 : cellular2) {
            if (cel2.getCellularNumber().equals(cel))
                System.out.println("Coincide");
            dbMatch.add(cel2);
        }
        return dbMatch;
    }

}
