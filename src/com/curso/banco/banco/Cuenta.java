package com.curso.banco.banco;

public class Cuenta {
    private int nroCuenta;
    private double saldo;
    private boolean status;

    public Cuenta(int nroCuenta, double saldo, boolean status) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
        this.status = status;
    }


    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double monto) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double depositar(double monto) {
        if (this.status == false) {
            System.out.println("El estado de la cuenta no permite el deposito");
        } else {
            if (monto > 0) {
                this.saldo = this.saldo + monto;
            } else {
                System.out.println("El monto a depositar debe ser mayor a 0");
            }

        }
        return this.saldo;
    }

    public double depositar(double monto, double valorDolar) {
        double montoPeso= monto * valorDolar;
        if (this.status == false) {
            System.out.println("El estado de la cuenta no permite el deposito");
        } else {
            if (montoPeso > 0) {
                this.saldo = this.saldo + montoPeso;
            } else {
                System.out.println("El monto a depositar debe ser mayor a 0");
            }

        }
        return this.saldo;
    }
    public double extraer(double monto) {
        if (this.status == false) {
            System.out.println("El estado de la cuenta no permite el deposito");
        } else {
            if (monto > 0&&monto<this.saldo) {
                this.saldo = this.saldo - monto;
            } else {
                System.out.println("El monto a extraer debe ser mayor a 0 y menor al Saldo");
            }

        }
        return this.saldo;
    }

    public double extraer(double monto, double valorDolar) {
        double montoPeso= monto * valorDolar;
        if (this.status == false) {
            System.out.println("El estado de la cuenta no permite el deposito");
        } else {
            if (montoPeso > 0&&montoPeso<this.saldo) {
                this.saldo = this.saldo - montoPeso;
            } else {
                System.out.println("El monto a extraer debe ser mayor a 0 y menor al Saldo");
            }

        }
        return this.saldo;
    }

    @Override
    public String toString() {
        return "[nroCuenta=" + nroCuenta + ", saldo=" + saldo + ", estado=" + status +"]";
    }

}
