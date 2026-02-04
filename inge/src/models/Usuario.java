package models;

public class Usuario {
    protected int id;
    protected String nombre;
    protected String cedula;
    protected String correo;
    protected String username;
    protected String password;
    protected String rol;

    public Usuario(String nombre, String cedula, String correo, String username, String password, String rol) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.username = username;
        this.password = password;
        this.rol = rol;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getRol() { return rol; }
}
