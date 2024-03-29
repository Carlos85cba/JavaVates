package com.curso.proyecto.finall;

import java.util.ArrayList;
import java.util.ListIterator;

public class BaseDeDatos {

    ArrayList<Cellular> cellular2 = new ArrayList<Cellular>();


    public BaseDeDatos() {
        Package p1b = new Package("Pack01", 50F, 0.21F);
        Package p2b = new Package("Pack02", 50F, 0.21F);
        Package p3b = new Package("Pack03", 70F, 0.21F);
        Package p3b80 = new Package("Pack03", 80F, 0.21F);
        Package p4b = new Package("Pack04", 75F, 0.21F);
        Package p5b = new Package("Pack05", 60F, 0.21F);

        ArrayList<Package> pacdb = new ArrayList<>();
        pacdb.add(p1b);
        pacdb.add(p2b);
        pacdb.add(p3b);
        pacdb.add(p4b);
        pacdb.add(p5b);

        ArrayList<Package> pacdb444 = new ArrayList<>();
        pacdb444.add(p1b);
        pacdb444.add(p2b);
        pacdb444.add(p3b80);
        pacdb444.add(p4b);
        pacdb444.add(p5b);

        ArrayList<Package> pacdb777 = new ArrayList<>();
        pacdb777.add(p1b);
        pacdb777.add(p2b);
        pacdb777.add(p4b);
        pacdb777.add(p5b);

        Plan pldb = new Plan("Plan01",700F, 0.21F);
        Plan pldb2 = new Plan("Plan02",700F, 0.21F);

        Cellular c = new Cellular("3513936390", pldb,pacdb);
        cellular2.add(c);
        Cellular c2 = new Cellular("3515557925", pldb,pacdb);
        cellular2.add(c2);
        Cellular c3 = new Cellular("3515555555", pldb2,pacdb);
        cellular2.add(c3);
        Cellular c4 = new Cellular("3513333333", pldb,pacdb);
        cellular2.add(c4);
        Cellular c5 = new Cellular("3514444444", pldb,pacdb444);
        cellular2.add(c5);
        Cellular c6 = new Cellular("3517777777", pldb,pacdb777);
        cellular2.add(c6);
    }



    public ArrayList getCellularInfo(String cel) {
        ArrayList<Cellular> dbMatch = new ArrayList<>();
        try {
        for (Cellular cel3 : cellular2) {
            if (cel3.getCellularNumber().equals(cel)){
                System.out.println("Devuelve DB");
            dbMatch.add(cel3);}
        }
        if (dbMatch.isEmpty()) {
            throw new MyExcepcion();
        }
    }
            catch(MyExcepcion ex){
        System.out.println(ex.excErrorPersonalizado());}

        return dbMatch;
    }


    public Cellular getCellularInfo2(String cel) throws MyExcepcion {
        ListIterator<Cellular> lis = cellular2.listIterator();

        while (lis.hasNext()) {
            Cellular cel3 = lis.next();
            if (cel3.getCellularNumber().equals(cel))
                return cel3;
        }
        throw new MyExcepcion();


    }

}
