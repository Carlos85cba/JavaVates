package com.curso.proyecto.finall;

import java.util.ArrayList;

public class Main {
    //implementa comparable

    public static void main(String[] args) {




        Package p1b = new Package("Pack01", 50F);
        Package p2b = new Package("Pack02", 50F);
        Package p3b = new Package("Pack03", 70F);
        Package p4b = new Package("Pack04", 75F);
        Package p5b = new Package("Pack05", 60F);



        ArrayList<Package> pacdb = new ArrayList<>();
        pacdb.add(p1b);
        pacdb.add(p2b);
        pacdb.add(p3b);
        pacdb.add(p4b);
        pacdb.add(p5b);


       Api api= new Api();
       ArrayList matchApi = api.getCellularInfo("3515557925");

       System.out.println(matchApi);

    }



}
