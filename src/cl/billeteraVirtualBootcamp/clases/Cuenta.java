package cl.billeteraVirtualBootcamp.clases;

import java.text.DecimalFormat;

public class Cuenta {
    /*
    1)Atributos de una clase
     */
/*modificadores de acceso, son parte de los polimorfismos
public, private, protected y son palabras reservadas
 */

    private int numeroCuenta;
    private String titularCuenta;
    private double saldoCuenta;

    /*
    2)Constructor
     */
public Cuenta(){

}
public Cuenta(int numCuenta, String titular, double saldo){
    this.numeroCuenta= numCuenta;
    this.titularCuenta= titular;
    this.saldoCuenta=saldo;
}
    /*
    3)Metodos de acceso
     */

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitularCuenta() {
        return titularCuenta;
    }

    public void setTitularCuenta(String titularCuenta) {
        this.titularCuenta = titularCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }
/*
    4)Metodos de comportamiento
     */

    public void mostrarInformacionCuentaCoriente() {
        String formatoSaldo = formatearSaldo(saldoCuenta);

        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titularCuenta);
        System.out.println("Saldo de cuenta: $" + saldoCuenta);

    }


    /*
    5)Metodos utilitarios o de logica
     */

    private String formatearSaldo(double saldo) {
        DecimalFormat formatoSaldo = new DecimalFormat("#,###");

        return formatoSaldo.format(saldo);
    }

}
