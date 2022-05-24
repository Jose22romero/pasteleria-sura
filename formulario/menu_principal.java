/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import SQL.conexion_bd;
import java.awt.CardLayout;
import java.awt.Image;
import java.net.URL;
import java.sql.Connection;
import java.time.Clock;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author romer
 */
public class menu_principal extends javax.swing.JFrame {
    
    
    
    
    alta_empleados alta_empleado = new alta_empleados();
    
    
    
    CardLayout vista;

    /**
     * Creates new form menu_principal
     */
    public menu_principal() {
        initComponents();
        
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("pasteleria sura");
        setSize(1280,720);
        
        ImageIcon fondo = new ImageIcon("src/imajenes/fondo1.jpg");
        Icon icono = new ImageIcon(fondo.getImage().getScaledInstance(jLabel1_fondo.getWidth()
                ,jLabel1_fondo.getHeight(), Image.SCALE_DEFAULT ));
        jLabel1_fondo.setIcon(icono);
        this.repaint();
        
        
//extender toda la pantalla
      // setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btnmoclientes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnmoproductos = new javax.swing.JButton();
        btnreportesempleados = new javax.swing.JButton();
        btnmempleados = new javax.swing.JButton();
        btnaltasempleados = new javax.swing.JButton();
        btnaltasclientes = new javax.swing.JButton();
        btnaltaproductos = new javax.swing.JButton();
        btnaltapedidos = new javax.swing.JButton();
        btnbajasempleados = new javax.swing.JButton();
        btnbajasclientes = new javax.swing.JButton();
        btnbajasproductos = new javax.swing.JButton();
        btnbajaspedidos = new javax.swing.JButton();
        btnmopedidos = new javax.swing.JButton();
        btnreportesventas = new javax.swing.JButton();
        btnreportesclientes = new javax.swing.JButton();
        jLabel1_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setFocusCycleRoot(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Gabriola", 1, 35)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 51));
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, 190, 60));

        btnmoclientes.setBackground(new java.awt.Color(255, 51, 51));
        btnmoclientes.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        btnmoclientes.setText("Clientes");
        btnmoclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoclientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnmoclientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 170, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imajenes/icon-removebg-preview.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 530, 300, 150));

        jLabel2.setFont(new java.awt.Font("Gabriola", 0, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BIENVENIDOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 330, 60));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BAJAS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 120, 50));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MODIFICACIONES");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 330, 50));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("REPORTES");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 160, 240, 50));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ALTAS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 120, 50));

        btnmoproductos.setBackground(new java.awt.Color(255, 51, 0));
        btnmoproductos.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        btnmoproductos.setText("Productos");
        btnmoproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoproductosActionPerformed(evt);
            }
        });
        getContentPane().add(btnmoproductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 170, 70));

        btnreportesempleados.setBackground(new java.awt.Color(255, 51, 51));
        btnreportesempleados.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        btnreportesempleados.setText("Empleados");
        btnreportesempleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreportesempleadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnreportesempleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 300, 170, 70));

        btnmempleados.setBackground(new java.awt.Color(255, 102, 102));
        btnmempleados.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        btnmempleados.setText("Empleados");
        btnmempleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmempleadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnmempleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 170, 70));

        btnaltasempleados.setBackground(new java.awt.Color(255, 102, 102));
        btnaltasempleados.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        btnaltasempleados.setText("Empleados");
        btnaltasempleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaltasempleadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnaltasempleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 170, 70));

        btnaltasclientes.setBackground(new java.awt.Color(255, 51, 51));
        btnaltasclientes.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        btnaltasclientes.setText("Clientes");
        btnaltasclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaltasclientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnaltasclientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 170, 70));

        btnaltaproductos.setBackground(new java.awt.Color(255, 51, 0));
        btnaltaproductos.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        btnaltaproductos.setText("Productos");
        btnaltaproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaltaproductosActionPerformed(evt);
            }
        });
        getContentPane().add(btnaltaproductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 170, 70));

        btnaltapedidos.setBackground(new java.awt.Color(204, 51, 0));
        btnaltapedidos.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        btnaltapedidos.setText("Pedidos");
        btnaltapedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaltapedidosActionPerformed(evt);
            }
        });
        getContentPane().add(btnaltapedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 170, 70));

        btnbajasempleados.setBackground(new java.awt.Color(255, 102, 102));
        btnbajasempleados.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        btnbajasempleados.setText("Empleados");
        btnbajasempleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbajasempleadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnbajasempleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 170, 70));

        btnbajasclientes.setBackground(new java.awt.Color(255, 51, 51));
        btnbajasclientes.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        btnbajasclientes.setText("Clientes");
        btnbajasclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbajasclientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnbajasclientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 170, 70));

        btnbajasproductos.setBackground(new java.awt.Color(255, 51, 0));
        btnbajasproductos.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        btnbajasproductos.setText("Productos");
        btnbajasproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbajasproductosActionPerformed(evt);
            }
        });
        getContentPane().add(btnbajasproductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 170, 70));

        btnbajaspedidos.setBackground(new java.awt.Color(204, 51, 0));
        btnbajaspedidos.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        btnbajaspedidos.setText("Pedidos");
        btnbajaspedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbajaspedidosActionPerformed(evt);
            }
        });
        getContentPane().add(btnbajaspedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 170, 70));

        btnmopedidos.setBackground(new java.awt.Color(204, 51, 0));
        btnmopedidos.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        btnmopedidos.setText("Pedidos");
        btnmopedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmopedidosActionPerformed(evt);
            }
        });
        getContentPane().add(btnmopedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 170, 70));

        btnreportesventas.setBackground(new java.awt.Color(255, 102, 102));
        btnreportesventas.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        btnreportesventas.setText("Ventas");
        btnreportesventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreportesventasActionPerformed(evt);
            }
        });
        getContentPane().add(btnreportesventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 220, 170, 70));

        btnreportesclientes.setBackground(new java.awt.Color(255, 51, 0));
        btnreportesclientes.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        btnreportesclientes.setText("Clientes");
        btnreportesclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreportesclientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnreportesclientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 380, 170, 70));
        getContentPane().add(jLabel1_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnmoclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoclientesActionPerformed

Modificar_clientes nuevaventana = new Modificar_clientes();
        nuevaventana.setVisible(true);
        
        //para que no se acumulen las ventanas
        this.dispose();



        // TODO add your handling code here:
    }//GEN-LAST:event_btnmoclientesActionPerformed

    private void btnmoproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoproductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmoproductosActionPerformed

    private void btnreportesempleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportesempleadosActionPerformed
    //GENERAR REPORTES

      //reporte_empleados nuevaventana = new reporte_empleados();
       // nuevaventana.setVisible(true);
        
        //para que no se acumulen las ventanas
        //this.dispose();
          conexion_bd cn = new conexion_bd();
        
        try{
        cn.conectar();
        } catch (Exception ex){
            Logger.getLogger(reporte_empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        URL archivo = this.getClass().getResource("/reportes/empleados.jasper");
        JasperReport jr = null;
        
        try {
            jr = (JasperReport) JRLoader.loadObject(archivo);
            
            
            JasperPrint JP = JasperFillManager.fillReport( jr, null, cn.conectar());
            JasperViewer jv = new JasperViewer(JP);
            jv.setVisible(true);
            jv.setTitle("Visor de reportes");
            
            // TODO add your handling code here:
        } catch (JRException ex) {
            Logger.getLogger(reporte_empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
     



        // TODO add your handling code here:
    }//GEN-LAST:event_btnreportesempleadosActionPerformed

    private void btnmempleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmempleadosActionPerformed
 modificar_empleados nuevaventana = new modificar_empleados();
        nuevaventana.setVisible(true);
        
        //para que no se acumulen las ventanas
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnmempleadosActionPerformed

    private void btnaltasempleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaltasempleadosActionPerformed
        // TODO add your handling code here:
        //mostrar ventana de empleados
        alta_empleados nuevaventana = new alta_empleados();
        nuevaventana.setVisible(true);
        
        //para que no se acumulen las ventanas
        this.dispose();
        
        
    }//GEN-LAST:event_btnaltasempleadosActionPerformed

    private void btnaltasclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaltasclientesActionPerformed

        alta_clientes nuevaventana = new alta_clientes();
        nuevaventana.setVisible(true);
        
        //para que no se acumulen las ventanas
        this.dispose();





        // TODO add your handling code here:
    }//GEN-LAST:event_btnaltasclientesActionPerformed

    private void btnaltaproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaltaproductosActionPerformed
        // TODO add your handling code here:
         alta_productos nuevaventana = new alta_productos();
        nuevaventana.setVisible(true);
        
        //para que no se acumulen las ventanas
        this.dispose();

    }//GEN-LAST:event_btnaltaproductosActionPerformed

    private void btnaltapedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaltapedidosActionPerformed
        // TODO add your handling code here:
         alta_pedidos nuevaventana = new alta_pedidos();
        nuevaventana.setVisible(true);
        
        //para que no se acumulen las ventanas
        this.dispose();

    }//GEN-LAST:event_btnaltapedidosActionPerformed

    private void btnbajasempleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbajasempleadosActionPerformed
        // TODO add your handling code here:
        
        baja_empleados nuevaventana = new baja_empleados();
        nuevaventana.setVisible(true);
        
        //para que no se acumulen las ventanas
        this.dispose();
        
        
        
    }//GEN-LAST:event_btnbajasempleadosActionPerformed

    private void btnbajasclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbajasclientesActionPerformed

baja_clientes nuevaventana = new baja_clientes();
        nuevaventana.setVisible(true);
        
        //para que no se acumulen las ventanas
        this.dispose();




        // TODO add your handling code here:
    }//GEN-LAST:event_btnbajasclientesActionPerformed

    private void btnbajasproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbajasproductosActionPerformed
        // TODO add your handling code here:
        
        baja_productos nuevaventana = new baja_productos();
        nuevaventana.setVisible(true);
        
        //para que no se acumulen las ventanas
        this.dispose();
    }//GEN-LAST:event_btnbajasproductosActionPerformed

    private void btnbajaspedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbajaspedidosActionPerformed
baja_pedidos nuevaventana = new baja_pedidos();
        nuevaventana.setVisible(true);
        
        //para que no se acumulen las ventanas
        this.dispose();



        // TODO add your handling code here:
    }//GEN-LAST:event_btnbajaspedidosActionPerformed

    private void btnmopedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmopedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmopedidosActionPerformed

    private void btnreportesventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportesventasActionPerformed

       conexion_bd cn = new conexion_bd();
        
        try{
        cn.conectar();
        } catch (Exception ex){
            Logger.getLogger(reporte_empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        URL archivo = this.getClass().getResource("/reportes/pedidos.jasper");
        JasperReport jr = null;
        
        try {
            jr = (JasperReport) JRLoader.loadObject(archivo);
            
            
            JasperPrint JP = JasperFillManager.fillReport( jr, null, cn.conectar());
            JasperViewer jv = new JasperViewer(JP);
            jv.setVisible(true);
            jv.setTitle("Visor de reportes");
            
            // TODO add your handling code here:
        } catch (JRException ex) {
            Logger.getLogger(reporte_empleados.class.getName()).log(Level.SEVERE, null, ex);
        }










        // TODO add your handling code here:
    }//GEN-LAST:event_btnreportesventasActionPerformed

    private void btnreportesclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportesclientesActionPerformed

conexion_bd cn = new conexion_bd();
        
        try{
        cn.conectar();
        } catch (Exception ex){
            Logger.getLogger(reporte_empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        URL archivo = this.getClass().getResource("/reportes/clientes.jasper");
        JasperReport jr = null;
        
        try {
            jr = (JasperReport) JRLoader.loadObject(archivo);
            
            
            JasperPrint JP = JasperFillManager.fillReport( jr, null, cn.conectar());
            JasperViewer jv = new JasperViewer(JP);
            jv.setVisible(true);
            jv.setTitle("Visor de reportes");
            
            // TODO add your handling code here:
        } catch (JRException ex) {
            Logger.getLogger(reporte_empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
     








        // TODO add your handling code here:
    }//GEN-LAST:event_btnreportesclientesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_principal().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaltapedidos;
    private javax.swing.JButton btnaltaproductos;
    private javax.swing.JButton btnaltasclientes;
    private javax.swing.JButton btnaltasempleados;
    private javax.swing.JButton btnbajasclientes;
    private javax.swing.JButton btnbajasempleados;
    private javax.swing.JButton btnbajaspedidos;
    private javax.swing.JButton btnbajasproductos;
    private javax.swing.JButton btnmempleados;
    private javax.swing.JButton btnmoclientes;
    private javax.swing.JButton btnmopedidos;
    private javax.swing.JButton btnmoproductos;
    private javax.swing.JButton btnreportesclientes;
    private javax.swing.JButton btnreportesempleados;
    private javax.swing.JButton btnreportesventas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

    
    
    
}
            

