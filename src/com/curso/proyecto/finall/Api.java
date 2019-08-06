package com.curso.proyecto.finall;

import com.curso.colecciones.Array.Persona;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Api {

    ArrayList<Cellular> cellular = new ArrayList<Cellular>();


    public Api() {
        Package p1 = new Package("Pack01", 60.50F);
        Package p2 = new Package("Pack02", 60.50F);
        Package p3 = new Package("Pack03", 84.7F);
        Package p4 = new Package("Pack04", 90.75F);
        Package p5 = new Package("Pack05", 72.60F);

        ArrayList<Package> pac = new ArrayList<>();
        pac.add(p1);
        pac.add(p2);
        pac.add(p3);
        pac.add(p4);
        pac.add(p5);
        Plan pl1 = new Plan("Plan01",847F);


        Cellular c = new Cellular("3513936390", pl1,pac);
        cellular.add(c);
        Cellular c2 = new Cellular("3515557925", pl1,pac);
        cellular.add(c2);
        Cellular c3 = new Cellular("3515555555", pl1,pac);
        cellular.add(c3);
        Cellular c4 = new Cellular("3513333333", pl1,pac);
        cellular.add(c4);
        Cellular c5 = new Cellular("3514444444", pl1,pac);
        cellular.add(c5);
        Cellular c6 = new Cellular("3517777777", pl1,pac);
        cellular.add(c6);
    }

   // public Api(Cellular cel) {




        //cellular.add(new Cellular("32443240",new Plan ("BEST",3434.33F,new Package(new ArrayList<Package>("fdsf",4234.99F))));
   // }

    public ArrayList getCellularInfo(String cel) {
        ArrayList<Cellular> apiMatch = new ArrayList<>();

        try {
        for (Cellular cel2 : cellular) {
            if (cel2.getCellularNumber().equals(cel)){
                System.out.println("Devuelve Api");
                apiMatch.add(cel2);}

        }

        if (apiMatch.isEmpty()) {
              throw new MyExcepcion();
            }
    }
            catch(MyExcepcion ex){
               System.out.println(ex.excErrorPersonalizado());}
        return apiMatch;
    }


    public Cellular getCellularInfo2(String cel) throws MyExcepcion {
        ListIterator<Cellular> lis = cellular.listIterator();

            while (lis.hasNext()) {
                Cellular cel2 = lis.next();
                if (cel2.getCellularNumber().equals(cel))
                    return cel2;
            }
            throw new MyExcepcion();


        }

    }
