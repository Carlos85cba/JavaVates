package com.curso.proyecto.finall;

import java.util.ArrayList;

public class Main {
    //implementa comparable

    public static void main(String[] args) {

        Package p = new Package("Pack1", 4545.99F);
        Package p2 = new Package("Pack2", 4566.99F);
        ArrayList ar = new ArrayList<Package>();
        ar.add(p);
        ar.add(p2);

        Cellular c = new Cellular("344324", new Plan("fsdf",343.33F),ar);
       Api api= new Api(c);
       api.getCellularInfo("344324");
    }



}
