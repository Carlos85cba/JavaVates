package com.curso.banco.banco;


public class Main {

    public static void main(String[] args) {
        double montoPositivo=3000;
        double montoNegativo=-1000;
       Cuenta cue = new Cuenta(1,333,true);
       Cliente cli = new Cliente("Carlos",11,cue);
       System.out.println(cli);
       System.out.println("Paso 1: Se deposita el monto de "+ montoPositivo);
       cue.depositar(montoPositivo);
       System.out.println("El nuevo Saldo es de "+ cue.getSaldo());
       cue.setStatus(false);
       System.out.println("Paso 2: Se deposita el monto de "+ montoPositivo+" . La cuenta tiene estado "+cue.isStatus());
       cue.depositar(montoPositivo);
       System.out.println("El nuevo Saldo es de "+ cue.getSaldo());
       cue.setStatus(true);
       System.out.println("Paso 3: Se deposita el monto de "+ montoNegativo);
       cue.depositar(montoNegativo);
       System.out.println("El nuevo Saldo es de "+ cue.getSaldo());
       System.out.println("Paso 4: Se extrae el monto de "+ montoPositivo);
       cue.extraer(montoPositivo);
       System.out.println("El nuevo Saldo es de "+ cue.getSaldo());
       System.out.println("Paso 5: Se extrae el monto de "+ montoPositivo);
       cue.extraer(montoPositivo);
       System.out.println("El nuevo Saldo es de "+ cue.getSaldo());
       System.out.println("Paso 6: Se extrae el monto de "+ montoNegativo);
       cue.extraer(montoNegativo);
       System.out.println("El nuevo Saldo es de "+ cue.getSaldo());
       System.out.println("Paso 7: Se deposita el monto de US$ "+ montoPositivo );
       cue.depositar(montoPositivo,43.50);
       System.out.println("El nuevo Saldo es de "+ cue.getSaldo());
        System.out.println("Paso 8: Se extrae el monto de US$ "+ montoPositivo );
        cue.extraer(montoPositivo,43.50);
        System.out.println("El nuevo Saldo es de "+ cue.getSaldo());
        System.out.println("Paso 9: Se extrae el monto de US$ "+ montoPositivo );
        cue.extraer(montoPositivo,43.50);
        System.out.println("El nuevo Saldo es de "+ cue.getSaldo());




    }
}
