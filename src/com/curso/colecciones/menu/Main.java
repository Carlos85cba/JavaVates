package com.curso.colecciones.menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int opcionMenu;
        String ar;
        ArrayList<String> a = new ArrayList<String>();
        ListIterator<String> li = a.listIterator();
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
                    ar = myScan.next();

                    do { a.add(ar);
                        ar = myScan.next();}

                    while (!ar.equals("salir"));
                    Collections.sort(a);
                    while ( li.hasNext())
                    System.out.println(li.next());

                    break;
                }
                case 2: {

                    break;
                }

                case 3: {


                    break;
                }

            }
        }
        while (opcionMenu != 4);


    }
}

