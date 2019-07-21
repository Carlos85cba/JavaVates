package com.curso.ciclos.ciclos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese 1 para calcular sumatoria de Números");
        System.out.println("Ingrese 2 para calcular sumatoria de cuadrados de Números");
        System.out.println("Ingrese 3 para calcular promedio");

        Scanner myScan = new Scanner(System.in);
        System.out.println("Ingrese número menor a 80");
        int nro1 = myScan.nextInt();
        while (nro1>80) {
            System.out.println("Ingrese número menor a 80");
            nro1 = myScan.nextInt();}
        System.out.println("Ingrese otro número menor a 100, mayor que el primero pero con diferencia menor a 20");
        int nro2 = myScan.nextInt();
        while (nro2>100 || nro1>nro2 || nro1<(nro2-20)  ) {
            System.out.println("Ingrese otro número menor a 100, mayor que el primero pero con diferencia menor a 20");
            nro2 = myScan.nextInt();}
        sumaNumero(nro1,nro2);
        sumaCuadrado(nro1,nro2);




    }

    public static void  sumaNumero(int nro1,int nro2){
        int fromNumber = nro1;
        int suma = 0;
        while (fromNumber <= nro2) {
            suma = suma + fromNumber;
            fromNumber++;
            System.out.println("Contador " + fromNumber + "suma " + suma);
    }
}

    public static void  sumaCuadrado(int nro1,int nro2){
        int fromNumber = nro1;
        int suma = 0;
        do {
            suma = suma + (fromNumber*fromNumber);
            fromNumber++;
            System.out.println("Contador " + fromNumber + "suma " + suma);


        }while (fromNumber <= nro2);
    }
}