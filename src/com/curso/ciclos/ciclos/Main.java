package com.curso.ciclos.ciclos;

public class Main {
    public static void main(String[] args) {
        int contador = 0;
        int suma = 0;
        while (contador <= 50) {
            suma = suma + contador;
            contador++;
            System.out.println("Contador " + contador + "suma " + suma);


        }
        contador = 0;
        suma = 0;
        while (contador <= 400) {
            suma = suma + contador;
            contador++;
            System.out.println("Contador " + contador + "suma " + suma);


        }
    }
}