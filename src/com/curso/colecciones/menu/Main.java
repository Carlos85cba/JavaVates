package com.curso.colecciones.menu;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int opcionMenu;
        String sc;



        {
        }
        do {
            System.out.println("Ingrese 1 para ordenar en forma ascendente"); //sort
            System.out.println("Ingrese 2 para ordenar en forma descendiente"); //reverse
            System.out.println("Ingrese 3 para usar HashSet");
            System.out.println("Ingrese 4 para Salir");
            opcionMenu = myScan.nextInt();
            switch (opcionMenu) {
                case 1: {
                    ArrayList<String> a1 = new ArrayList<>();
                    sc = myScan.next();
                    do {
                        a1.add(sc);
                        sc = myScan.next();
                    }
                    while (!sc.equals("salir"));

                    Collections.sort(a1);
                    Iterator li = a1.iterator();
                    while (li.hasNext()) {
                        System.out.println(li.next());
                    }
                    break;
                }
                case 2: {
                    ArrayList<String> a2 = new ArrayList<String>();
                    sc = myScan.next();
                    do {
                        a2.add(sc);
                        sc = myScan.next();
                    }
                    while (!sc.equals("salir"));

                    Collections.reverse(a2);
                    Iterator li = a2.iterator();
                    while (li.hasNext()) {
                        System.out.println(li.next());
                    }
                    break;
                }

                case 3: {
                    HashSet<String> a3 = new HashSet<String>();
                    sc = myScan.next();
                    do {
                        a3.add(sc);
                        sc = myScan.next();
                    }
                    while (!sc.equals("salir"));


                    Iterator li = a3.iterator();
                    while (li.hasNext()) {
                        System.out.println(li.next());
                    }
                    break;
                }

            }
        }
        while (opcionMenu != 4);


    }
}

