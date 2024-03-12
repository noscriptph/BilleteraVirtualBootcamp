package cl.billeteraVirtualBootcamp.clases;

import java.util.Scanner;

public class Cliente {
    private long idCliente;
    private String nombreCliente;
    private Cuenta cuentaCliente;

    public Cliente(long idCliente, String nombreCliente, Cuenta cuentaCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.cuentaCliente = cuentaCliente;
    }

    public Cliente(long idCliente, String nombreCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
    }

    public Cliente() {

    }

    public static Cliente crearClienteDesdeConsola() {
        Scanner scanner = new Scanner(System.in);
        long idCliente;
        String nombreCliente;

        System.out.println("Ingrese el id del cliente");
        idCliente = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Ingrese el nombre del cliente");
        nombreCliente = scanner.nextLine();

        Cuenta cuentaCorriente = Cuenta.CrearCuentaCorrientePorConsola();

        return new Cliente(idCliente, nombreCliente, cuentaCorriente);

    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Cuenta getCuentaCliente() {
        return cuentaCliente;
    }

    public void setCuentaCliente(Cuenta cuentaCliente) {
        this.cuentaCliente = cuentaCliente;
    }
}
