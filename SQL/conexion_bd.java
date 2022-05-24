/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author romer
 */
public class  conexion_bd {
private static String url = "jdbc:postgresql://localhost:5432/pasteleria";
    private static String usuario ="postgres";
    private static String Password = "Carpe22diem";
     
     
    public static Connection conectar(){
        Connection conexion = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url, usuario, Password);
           // System.out.println("Conexion Establecida");
            
        } catch (ClassNotFoundException | SQLException e) {
           // System.out.println("Error al conectar; "  +e );
        }
        
        return conexion;
     
    } 
    
}
    
