package com.curso.iteracion.foor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Ingrese numero para que se listen todos los numeros");
        int cap = myScan.nextInt();
        for (int i=1; i<=cap; i++) {
            System.out.println(i);
        }

        System.out.println("Ingrese numero min y max para listar valores");
        int low = myScan.nextInt();
        int max = myScan.nextInt();

        for (int i=low; i<=max; i++) {
            System.out.println(i);
        }

        System.out.println("Ingrese numero min y max para listar valores pares");
        int lowpar = myScan.nextInt();
        int maxpar = myScan.nextInt();

        for (int i=lowpar; i<=maxpar; i++) {
            if(i%2==0) {
                System.out.println(i);
            }
        }

    }
}
