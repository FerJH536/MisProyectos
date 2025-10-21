/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class App {

    public static void main(String[] args) {
        VentLogin vent = new VentLogin();
        vent.setVisible(true);
        if( Conexion.GetConnection()!= null)
            
          JOptionPane.showMessageDialog(null,  "conectado!!!");
    }
}
