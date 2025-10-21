/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.doparcial;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class App {

    public static void main(String[] args) {
        VentanaLogin vent = new VentanaLogin();
        vent.setVisible(true);
        if( Conexion.GetConnection()!= null)
            
          JOptionPane.showMessageDialog(null,  "conectado!!!");
    }
}
