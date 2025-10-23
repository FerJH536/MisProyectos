/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author Usuario
 */
public class Login extends VentLogin {
    
    
    public boolean login1(){
        Connection con = null;
        boolean log=false;
        String rslog="";
        
        String sql = "Select clientes.password from clientes where clientes.usuario="+getName();
        try {
            con=Conexion.GetConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rslog=rs.getString("password");
        }
        catch (SQLException e){
            System.out.println("Error");
        }

        if (rslog==getPass()){
            log=true;
        }
        return log;
    }
}
