import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Ventana_Login extends JFrame{
    private JPanel panel_log;
    private JTextField nombre;
    private JPasswordField pass;
    private JButton log;
    Connection con = null;

    public Ventana_Login(){
        setTitle("Ventana de Login");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel_log = new JPanel();
        panel_log.setLayout(new GridLayout(3, 4, 10, 10));

        JLabel label_nombre = new JLabel("Usuario:");
        nombre = new JTextField(2);
        JLabel label_contraseña = new JLabel("Contraseña:");
        pass = new JPasswordField(2);
        log = new JButton("Entrar");

        panel_log.add(label_nombre);
        panel_log.add(nombre);
        panel_log.add(label_contraseña);
        panel_log.add(pass);
        panel_log.add(log);

        add(panel_log);

        log.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String user = nombre.getText();
                String contr = new String (pass.getPassword());
                String sql= "Select clientes.password from clientes where clientes.usuario="+nombre;
                con=Conexion.GetConnection();
                PreparedStatement stm = con.prepareStatement(sql);
                ResultSet res = stm.executeQuery();
                rsPass = res.getString(password);
            }
        });
    }
}
