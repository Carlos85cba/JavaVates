package com.curso.ciclos.ciclos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int opcionMenu;
        do {
            System.out.println("Ingrese 1 para calcular sumatoria de Números");
            System.out.println("Ingrese 2 para calcular sumatoria de cuadrados de Números");
            System.out.println("Ingrese 3 para calcular promedio de Números");
            System.out.println("Ingrese 4 para Salir");
            opcionMenu = myScan.nextInt();
            switch (opcionMenu) {
                case 1: {
                    System.out.println("Ingrese número menor a 80");
                    int nro1 = myScan.nextInt();
                    while (nro1 > 80) {
                        System.out.println("Ingrese número menor a 80");
                        nro1 = myScan.nextInt();
                    }
                    System.out.println("Ingrese otro número menor a 100, mayor que el primero pero con diferencia menor a 20");
                    int nro2 = myScan.nextInt();
                    while (nro2 > 100 || nro1 > nro2 || nro1 < (nro2 - 20)) {
                        System.out.println("Ingrese otro número menor a 100, mayor que el primero pero con diferencia menor a 20");
                        nro2 = myScan.nextInt();
                    }

                    sumaNumero(nro1, nro2);
                    break;
                }
                case 2: {
                    System.out.println("Ingrese número menor a 80");
                    int nro1 = myScan.nextInt();
                    while (nro1 > 80) {
                        System.out.println("Ingrese número menor a 80");
                        nro1 = myScan.nextInt();
                    }
                    System.out.println("Ingrese otro número menor a 100, mayor que el primero pero con diferencia menor a 20");
                    int nro2 = myScan.nextInt();
                    while (nro2 > 100 || nro1 > nro2 || nro1 < (nro2 - 20)) {
                        System.out.println("Ingrese otro número menor a 100, mayor que el primero pero con diferencia menor a 20");
                        nro2 = myScan.nextInt();
                    }

                    sumaCuadrado(nro1, nro2);
                    break;
                }

                case 3: {
                    System.out.println("Ingrese una serie de numeros, corta con número negativo");
                    int nros = myScan.nextInt();
                    int suma = 0;
                    int contador = 0;
                    double promerdio;
                    while (nros > 0) {
                        suma += nros;
                        contador++;
                        System.out.println("suma: " + suma);
                        nros = myScan.nextInt();
                    }
                    promerdio = (double) suma / contador;
                    System.out.println("Promedio " + promerdio);

                    break;
                }

            }
        }
        while (opcionMenu != 4);


    }

    private static void sumaNumero(int nro1, int nro2) {
        int fromNumber = nro1;
        int suma = 0;
        while (fromNumber <= nro2) {
            suma = suma + fromNumber;
            fromNumber++;
            System.out.println("Contador " + fromNumber + "suma " + suma);
        }
    }

    private static void sumaCuadrado(int nro1, int nro2) {
        int fromNumber = nro1;
        int suma = 0;
        do {
            suma = suma + (fromNumber * fromNumber);
            fromNumber++;
            System.out.println("Contador " + fromNumber + "suma " + suma);


        } while (fromNumber <= nro2);
    }
}