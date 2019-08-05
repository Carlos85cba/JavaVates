package com.curso.proyecto.finall;

import java.util.ArrayList;

public class Api {

    ArrayList<Cellular> cellular = new ArrayList<Cellular>();


    public Api() {
        Package p1 = new Package("Pack01", 60.50F);
        Package p2 = new Package("Pack02", 60.50F);
        Package p3 = new Package("Pack03", 84.75F);
        Package p4 = new Package("Pack04", 90.75F);
        Package p5 = new Package("Pack05", 72.60F);

        ArrayList<Package> pac = new ArrayList<>();
        pac.add(p1);
        pac.add(p2);
        pac.add(p3);
        pac.add(p4);
        pac.add(p5);

        Cellular c = new Cellular("3513936390", new Plan("Plan01",847F),pac);
        cellular.add(c);
        Cellular c2 = new Cellular("3515557925", new Plan("Plan01",700F),pac);
        cellular.add(c2);
    }

   // public Api(Cellular cel) {




        //cellular.add(new Cellular("32443240",new Plan ("BEST",3434.33F,new Package(new ArrayList<Package>("fdsf",4234.99F))));
   // }

    public ArrayList getCellularInfo(String cel) {
        ArrayList<Cellular> apiMatch = new ArrayList<>();
        for (Cellular cel2 : cellular) {
            if (cel2.getCellularNumber().equals(cel)){
                System.out.println("Coincide");
                apiMatch.add(cel2);}
        }
        return apiMatch;
    }

}