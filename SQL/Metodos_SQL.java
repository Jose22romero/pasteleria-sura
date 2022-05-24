/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author romer
 */
public class Metodos_SQL {
    
    private static Connection conexion;
    private static PreparedStatement sentencia_preparada;
    private static ResultSet resultado;
    
    public void guardar_datos_empleado(String nombre, String apellidop,
            String apellidom,String telefono, String domicilio, String area, String PK_claveE){
        
        try {
            conexion = conexion_bd.conectar();
            String consulta = "INSERT INTO pasteleria.Empleados (Nombre,Apellidop,Apellidom,Telefono,Domicilio,Area,PK_claveE) VALUES (?,?,?,?,?,?,?)";
            sentencia_preparada = conexion.prepareStatement(consulta);
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, apellidop);
            sentencia_preparada.setString(3, apellidom);
            sentencia_preparada.setString(4, telefono);
            sentencia_preparada.setString(5, domicilio);
            sentencia_preparada.setString(6, area);
            sentencia_preparada.setString(7, PK_claveE);
            
            int i = sentencia_preparada.executeUpdate();
            
            if(i > 0){
                
                         JOptionPane.showMessageDialog(null, "Datos Guardados");

            } else {
                         JOptionPane.showMessageDialog(null, "Error al guardar");

            }
          conexion.close();
        } catch (HeadlessException | SQLException e) {

            System.out.println("Error al guardar 1: + e");

        }finally{
            try {
                conexion.close();
            } catch (SQLException e) {
                System.out.println("Error al aguardar  2: " +e);
            }
        }

    }
     public void guardar_datos_clientes(String PK_claveC,String nombre, String apellidop,
            String apellidom,String telefono, String domicilio){
        
        try {
            conexion = conexion_bd.conectar();
            String consulta = "INSERT INTO pasteleria.Clientes (PK_claveC,Nombre,Apellidop,Apellidom,Telefono,Domicilio) VALUES (?,?,?,?,?,?)";
            sentencia_preparada = conexion.prepareStatement(consulta);
            sentencia_preparada.setString(1, PK_claveC);
            sentencia_preparada.setString(2, nombre);
            sentencia_preparada.setString(3, apellidop);
            sentencia_preparada.setString(4, apellidom);
            sentencia_preparada.setString(5, telefono);
            sentencia_preparada.setString(6, domicilio);
            
            
            
            int i = sentencia_preparada.executeUpdate();
            
            if(i > 0){
                
                         JOptionPane.showMessageDialog(null, "Datos Guardados");

            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar");

            }
          conexion.close();
        } catch (HeadlessException | SQLException e) {

            System.out.println("Error al guardar 1: + e");

        }finally{
            try {
                conexion.close();
            } catch (SQLException e) {
                System.out.println("Error al aguardar  2: " +e);
            }
        
    
    
        }}
public void guardar_datos_productos(String PK_claveP,String pastel, String precio){
        
        try {
            conexion = conexion_bd.conectar();
            String consulta = "INSERT INTO pasteleria.Productos (PK_claveP,pastel,precio) VALUES (?,?,?)";
            sentencia_preparada = conexion.prepareStatement(consulta);
            sentencia_preparada.setString(1, PK_claveP);
            sentencia_preparada.setString(2, pastel);
            sentencia_preparada.setString(3, precio);
            int i = sentencia_preparada.executeUpdate();
            
            if(i > 0){
                
                         JOptionPane.showMessageDialog(null, "Datos Guardados");

            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar");

            }
          conexion.close();
        } catch (HeadlessException | SQLException e) {

            System.out.println("Error al guardar 1: + e");

        }finally{
            try {
                conexion.close();
            } catch (SQLException e) {
                System.out.println("Error al aguardar  2: " +e);
            }
        }
}
    
        
public void guardar_datos_pedido(String FK_claveE,String FK_claveC, String FK_claveP,String clave){
        
        try {
            conexion = conexion_bd.conectar();
            String consulta = "INSERT INTO pasteleria.Pedido (FK_claveE,FK_claveC,FK_claveP,clave) VALUES (?,?,?,?)";
            sentencia_preparada = conexion.prepareStatement(consulta);
            sentencia_preparada.setString(1, FK_claveE);
            sentencia_preparada.setString(2, FK_claveC);
            sentencia_preparada.setString(3, FK_claveP);
            sentencia_preparada.setString(4, clave);
            
          
            int i = sentencia_preparada.executeUpdate();
            
            if(i > 0){
                
                         JOptionPane.showMessageDialog(null, "Datos Guardados");

            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar");

            }
          conexion.close();
        } catch (HeadlessException | SQLException e) {

            System.out.println("Error al guardar 1: " +e);

        }finally{
            try {
                conexion.close();
            } catch (SQLException e) {
                System.out.println("Error al aguardar  2: " +e);
            }
        
    
    
        }}


public ResultSet consulta(String sql){
     ResultSet res = null;
     try {
         conexion = conexion_bd.conectar();
        sentencia_preparada = conexion.prepareStatement(sql);
         res = sentencia_preparada.executeQuery();
     } catch (Exception e) {
         System.out.println("Error consultas4;"+e.getMessage());
     }
     return res;
 }
public  DefaultComboBoxModel obtener_vendedor(){
    DefaultComboBoxModel Lista = new DefaultComboBoxModel();
    Lista.addElement("Seleccionar");
    ResultSet res = this.consulta(" Select * from pasteleria.empleados order by PK_claveE");
    
    try {
        while(res.next()){
            Lista.addElement(res.getString("PK_claveE"));
        }
        res.close();
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
    return Lista;
    }
public ResultSet consulta1(String sql){
     ResultSet res = null;
     try {
         conexion = conexion_bd.conectar();
        sentencia_preparada = conexion.prepareStatement(sql);
         res = sentencia_preparada.executeQuery();
     } catch (Exception e) {
         System.out.println("Error consultas4;"+e.getMessage());
     }
     return res;
 }
public  DefaultComboBoxModel obtener_cliente(){
    DefaultComboBoxModel Lista = new DefaultComboBoxModel();
    Lista.addElement("Seleccionar");
    ResultSet res = this.consulta1(" Select * from pasteleria.Clientes order by PK_claveC");
    
    try {
        while(res.next()){
            Lista.addElement(res.getString("PK_claveC"));
        }
        res.close();
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
    return Lista;
    }
public ResultSet consulta2(String sql){
     ResultSet res = null;
     try {
         conexion = conexion_bd.conectar();
        sentencia_preparada = conexion.prepareStatement(sql);
         res = sentencia_preparada.executeQuery();
     } catch (Exception e) {
         System.out.println("Error consultas4;"+e.getMessage());
     }
     return res;
 }
public  DefaultComboBoxModel obtener_pastel(){
    DefaultComboBoxModel Lista = new DefaultComboBoxModel();
    Lista.addElement("Seleccionar");
    ResultSet res = this.consulta2(" Select * from pasteleria.Productos order by PK_claveP");
    
    try {
        while(res.next()){
            Lista.addElement(res.getString("PK_claveP"));
        }
        res.close();
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
    return Lista;
    }
//ELIMINADOS
public void eliminarempleado(String PK_claveE) {
        try {

            conexion = conexion_bd.conectar();
            String consulta = "DELETE  FROM PASTELERIA.Empleados WHERE PK_claveE = ?";
            sentencia_preparada = conexion.prepareStatement(consulta);
            sentencia_preparada.setString(1,PK_claveE);
            int resultado =  sentencia_preparada.executeUpdate();
              if(1 > 0){
                 JOptionPane.showMessageDialog(null, "Empleado eliminado Exitosamente");
             } else{
                 
             //JOptionPane.showMessageDialog(null, "Datos no Modificados");
             }
            
            conexion.close();
            
        } catch (HeadlessException | SQLException e) {
            System.out.println("Error"+e);
  
     }finally{
             try {
                 conexion.close();
             } catch (SQLException e) {
                 System.out.println("Error"+e);
             }
             
             
    }}
public void eliminarcliente(String PK_claveC) {
        try {

            conexion = conexion_bd.conectar();
            String consulta = "DELETE  FROM PASTELERIA.Clientes WHERE PK_claveC = ?";
            sentencia_preparada = conexion.prepareStatement(consulta);
            sentencia_preparada.setString(1,PK_claveC);
            int resultado =  sentencia_preparada.executeUpdate();
              if(1 > 0){
                 JOptionPane.showMessageDialog(null, "Cliente eliminado Exitosamente");
             } else{
                 
             //JOptionPane.showMessageDialog(null, "Datos no Modificados");
             }
            
            conexion.close();
            
        } catch (HeadlessException | SQLException e) {
            System.out.println("Error"+e);
  
     }finally{
             try {
                 conexion.close();
             } catch (SQLException e) {
                 System.out.println("Error"+e);
             }
             
             
    }}
public void eliminarproducto(String PK_claveP) {
        try {

            conexion = conexion_bd.conectar();
            String consulta = "DELETE  FROM PASTELERIA.Productos WHERE PK_claveP = ?";
            sentencia_preparada = conexion.prepareStatement(consulta);
            sentencia_preparada.setString(1,PK_claveP);
            int resultado =  sentencia_preparada.executeUpdate();
              if(1 > 0){
                 JOptionPane.showMessageDialog(null, "Producto eliminado Exitosamente");
             } else{
                 
             //JOptionPane.showMessageDialog(null, "Datos no Modificados");
             }
            
            conexion.close();
            
        } catch (HeadlessException | SQLException e) {
            System.out.println("Error"+e);
  
     }finally{
             try {
                 conexion.close();
             } catch (SQLException e) {
                 System.out.println("Error"+e);
             }
             
             
    }}
public void eliminarpedido(String clave) {
        try {

            conexion = conexion_bd.conectar();
            String consulta = "DELETE  FROM PASTELERIA.Pedido WHERE clave = ?";
            sentencia_preparada = conexion.prepareStatement(consulta);
            sentencia_preparada.setString(1, clave);
            int resultado =  sentencia_preparada.executeUpdate();
              if(1 > 0){
                 JOptionPane.showMessageDialog(null, "Pedido eliminado Exitosamente");
             } else{
                 
             //JOptionPane.showMessageDialog(null, "Datos no Modificados");
             }
            
            conexion.close();
            
        } catch (HeadlessException | SQLException e) {
            System.out.println("Error"+e);
  
     }finally{
             try {
                 conexion.close();
             } catch (SQLException e) {
                 System.out.println("Error"+e);
             }
             
             
    }}

//modificar datos 
public void modificar_empleados(String PK_claveE, String nombre,String apellidop, String apellidom ,String telefono,String domicilio,
     String area){
    
    try {
        conexion = conexion_bd.conectar();
     String consulta = "UPDATE PASTELERIA.Empleados SET nombre =?,apellidop=?,apellidom=?,telefono=?,domicilio=?,area=?  WHERE PK_claveE=? ";
        sentencia_preparada = conexion.prepareStatement(consulta);
        sentencia_preparada.setString(1, PK_claveE);
        sentencia_preparada.setString(2, nombre);
        sentencia_preparada.setString(3, apellidop);
        sentencia_preparada.setString(4, apellidom);
        sentencia_preparada.setString(5, telefono);
        sentencia_preparada.setString(6, domicilio);
        sentencia_preparada.setString(7, area);
        
        int i = sentencia_preparada.executeUpdate();
             
             if(1 > 0){
                 JOptionPane.showMessageDialog(null, "Datos Modificados");
             } else{
                 
             JOptionPane.showMessageDialog(null, "Datos no Modificados");
             }
         conexion.close();
         } catch (HeadlessException | SQLException e) {
             System.out.println("Error"+e);
         }finally{
             try {
                 conexion.close();
             } catch (SQLException e) {
                 System.out.println("Error"+e);
             }
             
             
    }}
//validar si existe 
     public static String buscarclave(String PK_claveE){
    
    String mensaje = null;
    try {
        conexion = conexion_bd.conectar();
        String consulta = "SELECT PK_claveE FROM PASTELERIA.Empleados WHERE   PK_claveE = ?";
        sentencia_preparada = conexion.prepareStatement(consulta);
        sentencia_preparada.setString(1, PK_claveE);
        resultado = sentencia_preparada.executeQuery();
        
        
        if (resultado.next()) {
            mensaje = "Existe empleado";}
        else{
            mensaje= "No existe empleado";
            
            
        }
        
        conexion.close();
    } catch (Exception e) {
        
        System.out.println("Error: "+e);
        
    }finally{
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Metodos_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    return mensaje;


}}
             