package com.curso.iteracion.foor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Ingrese numero para que se listen todos los numeros");
        int cap = myScan.nextInt();
        allValues(cap);

        System.out.println("Ingrese numero min y max para listar valores");
        int low = myScan.nextInt();
        int max = myScan.nextInt();
        minMaxValues(low, max);

        System.out.println("Ingrese numero min y max para listar valores pares");
        int lowpar = myScan.nextInt();
        int maxpar = myScan.nextInt();
        evenValues(lowpar, maxpar);


    }

    private static void allValues(int cap) {
        for (int i = 1; i <= cap; i++) {
            System.out.println(i);
        }
    }

    private static void minMaxValues(int low, int max) {
        for (int i = low; i <= max; i++) {
            System.out.println(i);
        }
    }

    private static void evenValues(int lowpar, int maxpar) {
        for (int i = lowpar; i <= maxpar; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}
