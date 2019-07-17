package com.curso.condicionales.mes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // String input
        Scanner myScan = new Scanner(System.in);
        System.out.println("Ingrese número del 1 al 12");
        int nro = myScan.nextInt();
        imprimirSimple(nro);
        System.out.println("Ingrese número del 1 al 12");
        nro = myScan.nextInt();
        imprimirDoble(nro);
        System.out.println("Ingrese el número del mes a imprimir");
        nro = myScan.nextInt();
        imprimirMultiple(nro);
        System.out.println("Ingrese el número del mes a imprimir");
        nro = myScan.nextInt();
        imprimirCase(nro);

    }

    private static void imprimirSimple(int nro) {
        if (nro >= 1 & nro <= 12) {
            System.out.println("El numero es valido " + nro);
        }
    }

    private static void imprimirDoble(int nro) {
        if (nro >= 1 & nro <= 12) {
            System.out.println("El numero es valido " + nro);
        } else {
            System.out.println("El numero no es valido " + nro);
        }
    }

    private static void imprimirMultiple(int nro) {
        String mes1 = "";
        if (nro == 1) {
            mes1 = "Enero";

        } else if (nro == 2) {
            mes1 = "Febrero";
        } else if (nro == 3) {
            mes1 = "Marzo";
        } else if (nro == 4) {
            mes1 = "Abril";
        } else if (nro == 5) {
            mes1 = "Mayo";
        } else if (nro == 6) {
            mes1 = "Junio";
        } else if (nro == 7) {
            mes1 = "Julio";
        } else if (nro == 8) {
            mes1 = "Agosto";
        } else if (nro == 9) {
            mes1 = "Septiembre";
        } else if (nro == 10) {
            mes1 = "Octubre";
        } else if (nro == 11) {
            mes1 = "Noviembre";
        } else if (nro == 12) {
            mes1 = "Diciembre";
        } else {
            System.out.println("El numero no es valido " + nro);
        }
        Mes mes = new Mes(mes1);
        System.out.println(mes.toString());
    }


    private static void imprimirCase(int nro) {
        String mes1 = "";
        switch (nro) {
            case 1:
                mes1 = "Enero";
                break;
            case 2:
                mes1 = "Febrero";
                break;
            case 3:
                mes1 = "Marzo";
                break;
            case 4:
                mes1 = "Abril";
                break;
            case 5:
                mes1 = "Mayo";
                break;
            case 6:
                mes1 = "Junio";
                break;
            case 7:
                mes1 = "Julio";
                break;
            case 8:
                mes1 = "Agosto";
                break;
            case 9:
                mes1 = "Septiembre";
                break;
            case 10:
                mes1 = "Octubre";
                break;
            case 11:
                mes1 = "Noviembre";
                break;
            case 12:
                mes1 = "Diciembre";
                break;

            default:
                System.out.println("El numero no es valido " + nro);
        }
        Mes mes = new Mes(mes1);
        System.out.println(mes.toString());
    }
}
