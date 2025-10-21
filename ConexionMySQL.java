/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.doparcial;

import javax.swing.JOptionPane;


public class ConexionMySQL {      
      public static void main(String[] args) {
      if( Conexion.GetConnection()!= null)
            
          JOptionPane.showMessageDialog(null,  "conectado!!!");
    }
}





