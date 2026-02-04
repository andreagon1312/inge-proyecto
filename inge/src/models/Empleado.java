package models;

public class Empleado extends Usuario {
    private String cargo;

    public Empleado(String nombre, String cedula, String correo, String username, String password, String cargo) {
        super(nombre, cedula, correo, username, password, "EMPLEADO");
        this.cargo = cargo;
    }
}
