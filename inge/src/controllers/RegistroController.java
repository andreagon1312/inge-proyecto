package controller;

import model.*;
import java.util.ArrayList;

public class RegistroController {

    public static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static boolean registrarUsuario(Usuario u) {
        // Validación básica
        for (Usuario user : usuarios) {
            if (user.getUsername().equals(u.getUsername())) {
                return false; // usuario ya existe
            }
        }
        usuarios.add(u);
        return true;
    }
}
