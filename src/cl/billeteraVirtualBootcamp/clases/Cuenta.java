package cl.billeteraVirtualBootcamp.clases;

import java.text.DecimalFormat;

public class Cuenta {
    /*
    1)Atributos de una clase
     */
/*modificadores de acceso, son parte de los polimorfismos
public, private, protected y son palabras reservadas
 */

    public int numeroCuenta;
    public String titularCuenta;
    public double saldoCuenta;

    /*
    2)Constructor
     */

    /*
    3)Metodos de acceso
     */

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
