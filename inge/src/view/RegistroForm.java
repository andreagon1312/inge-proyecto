package view;

import controllers.*;
import models.*;
import javax.swing.*;

public class RegistroForm extends JFrame {

    JTextField txtNombre, txtCedula, txtCorreo, txtUser, txtCarrera, txtFacultad, txtCargo;
    JPasswordField txtPass;
    JComboBox<String> comboRol;
    JButton btnRegistrar;

    public RegistroForm() {
        setTitle("Pre-Registro Comedor UCV");
        setSize(400, 600);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel title = new JLabel("PRE-REGISTRO UCV");
        title.setBounds(120, 10, 200, 30);
        add(title);

        txtNombre = new JTextField(); txtNombre.setBounds(100, 50, 200, 25);
        txtCedula = new JTextField(); txtCedula.setBounds(100, 90, 200, 25);
        txtCorreo = new JTextField(); txtCorreo.setBounds(100, 130, 200, 25);
        txtUser = new JTextField(); txtUser.setBounds(100, 170, 200, 25);
        txtPass = new JPasswordField(); txtPass.setBounds(100, 210, 200, 25);

        comboRol = new JComboBox<>(new String[]{"ESTUDIANTE", "EMPLEADO"});
        comboRol.setBounds(100, 250, 200, 25);

        txtCarrera = new JTextField(); txtCarrera.setBounds(100, 290, 200, 25);
        txtFacultad = new JTextField(); txtFacultad.setBounds(100, 330, 200, 25);
        txtCargo = new JTextField(); txtCargo.setBounds(100, 370, 200, 25);

        btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBounds(130, 420, 120, 30);

        add(new JLabel("Nombre")).setBounds(20, 50, 80, 25);
        add(txtNombre);
        add(new JLabel("Cedula")).setBounds(20, 90, 80, 25);
        add(txtCedula);
        add(new JLabel("Correo")).setBounds(20, 130, 80, 25);
        add(txtCorreo);
        add(new JLabel("Usuario")).setBounds(20, 170, 80, 25);
        add(txtUser);
        add(new JLabel("Password")).setBounds(20, 210, 80, 25);
        add(txtPass);
        add(new JLabel("Rol")).setBounds(20, 250, 80, 25);
        add(comboRol);
        add(new JLabel("Carrera")).setBounds(20, 290, 80, 25);
        add(txtCarrera);
        add(new JLabel("Facultad")).setBounds(20, 330, 80, 25);
        add(txtFacultad);
        add(new JLabel("Cargo")).setBounds(20, 370, 80, 25);
        add(txtCargo);
        add(btnRegistrar);

        btnRegistrar.addActionListener(e -> registrar());
    }

    private void registrar() {
        String rol = comboRol.getSelectedItem().toString();

        Usuario u = null;

        if (rol.equals("ESTUDIANTE")) {
            u = new Estudiante(txtNombre.getText(), txtCedula.getText(), txtCorreo.getText(),
                    txtUser.getText(), new String(txtPass.getPassword()),
                    txtCarrera.getText(), txtFacultad.getText());
        } else {
            u = new Empleado(txtNombre.getText(), txtCedula.getText(), txtCorreo.getText(),
                    txtUser.getText(), new String(txtPass.getPassword()),
                    txtCargo.getText());
        }

        if (RegistroController.registrarUsuario(u)) {
            JOptionPane.showMessageDialog(this, "Registro exitoso");
            dispose();
            new LoginForm().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Usuario ya existe");
        }
    }
}
