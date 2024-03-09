import cl.billeteraVirtualBootcamp.clases.Cuenta;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
        CrearCuenta
        AgregarSaldo
        RestarSaldo
        MostrarSaldo
        VerSaldo
        ConversorMoneda
        Menu
         */


        // Esto ya es un objeto
        Cuenta cuenta= new Cuenta(); //Cuenta es un constructor




/*
        //Llenando la clase de datos
        cuenta1.numeroCuenta = 123456;
        cuenta1.titularCuenta="Agustin Romero";
        cuenta1.saldoCuenta = 1000000;/
*/
        cuenta.setNumeroCuenta(123456);
        cuenta.setTitularCuenta("Alexis Rebolledo");
        cuenta.setSaldoCuenta(50);


        /*ejercicio 8-3-2024
         Cuenta cuenta2= new Cuenta(346535, "alexis rebolledo", 77677867);
        //Llenando la clase de datos
        cuenta2.numeroCuenta = 123457;
        cuenta2.titularCuenta="Victor Paillacar";
        cuenta2.saldoCuenta = 300000;
        cuenta2.mostrarInformacionCuentaCoriente();
        */

        System.out.println("Nombre de la cuenta: "+cuenta.getTitularCuenta());
        cuenta.mostrarInformacionCuentaCoriente();


    }
}