package view;

import controllers.*;
import models.Usuario;
import javax.swing.*;

public class LoginForm extends JFrame {

    JTextField txtUser;
    JPasswordField txtPass;
    JButton btnLogin;

    public LoginForm() {
        setTitle("Login Comedor UCV");
        setSize(300, 250);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lbl = new JLabel("INICIO DE SESIÓN");
        lbl.setBounds(90, 20, 200, 30);
        add(lbl);

        txtUser = new JTextField();
        txtUser.setBounds(80, 70, 150, 25);
        txtPass = new JPasswordField();
        txtPass.setBounds(80, 110, 150, 25);

        btnLogin = new JButton("Ingresar");
        btnLogin.setBounds(100, 150, 100, 30);

        add(new JLabel("Usuario")).setBounds(20, 70, 60, 25);
        add(txtUser);
        add(new JLabel("Password")).setBounds(20, 110, 60, 25);
        add(txtPass);
        add(btnLogin);

        btnLogin.addActionListener(e -> login());
    }

    private void login() {
        Usuario u = LoginController.login(txtUser.getText(), new String(txtPass.getPassword()));

        if (u != null) {
            JOptionPane.showMessageDialog(this, "Bienvenido " + u.getRol());
        } else {
            JOptionPane.showMessageDialog(this, "Datos inválidos");
        }
    }
}
