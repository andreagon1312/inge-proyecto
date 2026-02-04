package models;

public class Estudiante extends Usuario {
    private String carrera;
    private String facultad;

    public Estudiante(String nombre, String cedula, String correo, String username, String password, String carrera, String facultad) {
        super(nombre, cedula, correo, username, password, "ESTUDIANTE");
        this.carrera = carrera;
        this.facultad = facultad;
    }
}
