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


        // Esto ya es un obtejo
        Cuenta cuenta1= new Cuenta();
        Cuenta cuenta2= new Cuenta();

        //Llenando la clase de datos
        cuenta1.numeroCuenta = 123456;
        cuenta1.titularCuenta="Agustin Romero";
        cuenta1.saldoCuenta = 1000000;

        cuenta1.mostrarInformacionCuentaCoriente();

        cuenta2.numeroCuenta = 123456;
        cuenta2.titularCuenta="Agustin Romero";
        cuenta2.saldoCuenta = 1000000;

        cuenta2.mostrarInformacionCuentaCoriente();
    }
}