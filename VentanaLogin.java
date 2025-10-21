package com.mycompany.doparcial;

import javax.swing.*;

public class VentanaLogin extends javax.swing.JFrame{
    private JPanel panelLogin;
    private JFormattedTextField name;
    private JPasswordField pass;
    private JButton loguear;
    private JLabel labelNombre;
    private JLabel labelPass;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public String getName(){
        String nombre = name.getText();

        return nombre;
    }

    public String getPass(){
        String passw = pass.getText();

        return passw;
    }
}
