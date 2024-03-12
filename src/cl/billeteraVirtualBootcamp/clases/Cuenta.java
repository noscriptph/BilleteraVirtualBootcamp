package cl.billeteraVirtualBootcamp.clases;

import java.text.DecimalFormat;
import java.util.Scanner;

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
    public Cuenta() {

    }

    public Cuenta(int numCuenta, String titular, double saldo) {
        this.numeroCuenta = numCuenta;
        this.titularCuenta = titular;
        this.saldoCuenta = saldo;
    }

    public Cuenta(int numeroCuenta, double saldoCuenta) {
    }

    /*
    3)Metodos de acceso
     */

    public static Cuenta CrearCuentaCorrientePorConsola() {
        Scanner scanner = new Scanner(System.in);
        int numeroCuenta;
        double saldoCuenta;

        System.out.println("Ingrese el numero de cuenta: ");
        numeroCuenta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el saldo de cuenta: ");
        saldoCuenta = scanner.nextDouble();
        return new Cuenta (numeroCuenta, saldoCuenta);
    }

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
/*
    4)Metodos de comportamiento
     */

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

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
