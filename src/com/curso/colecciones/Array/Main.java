package com.curso.colecciones.Array;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<String>();
        System.out.println("Ingrese 4 palabras");

        for (int i = 0; i < 4; i++) {

            a.add(myScan.next());
        }
        ListIterator li = a.listIterator();
        while (li.hasNext())
           li.next();
        while (li.hasPrevious())
            System.out.println(li.previous());


        //Linked List
        LinkedList<Persona> ll = new LinkedList<Persona>();
        System.out.println("Ingrese 3 nombres y apellidos");
        for (int i = 0; i < 3; i++) {
            String v_nombre = myScan.next();
            String v_apellido = myScan.next();
            ll.add(new Persona(v_nombre, v_apellido));

        }
        ListIterator lis = ll.listIterator();
        while (lis.hasNext())
            System.out.println(lis.next());
        System.out.println(ll.toString());
    }
}
