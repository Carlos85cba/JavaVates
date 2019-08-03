package com.curso.proyecto.finall;

import java.util.ArrayList;

public class Api  {

    ArrayList<Cellular> cellular = new ArrayList<Cellular>();


    public Api() {
    }

    public Api(Cellular cel) {

        cellular.add(cel);


        //cellular.add(new Cellular("32443240",new Plan ("BEST",3434.33F,new Package(new ArrayList<Package>("fdsf",4234.99F))));
    }

    public void getCellularInfo(String cel) {
        for (Cellular cel2 : cellular) {
            if (cel2.getCellularNumber().equals(cel))
                System.out.println("Coincide");

        }
    }

}