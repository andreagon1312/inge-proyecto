package controllers;

import models.*;

public class LoginController {

    public static Usuario login(String username, String password) {
        for (Usuario u : RegistroController.usuarios) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }
}
