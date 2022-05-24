/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import SQL.Metodos_SQL;
import SQL.conexion_bd;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author romer
 */
public class baja_pedidos extends javax.swing.JFrame {
Metodos_SQL metodos_SQL = new Metodos_SQL();

    /**
     * Creates new form baja_pedidos
     */
    public baja_pedidos() {
        initComponents();
        
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("pasteleria sura");
        setSize(1280,720);
        
        ImageIcon fondo = new ImageIcon("src/imajenes/alta_pedido_edited.jpg");
        Icon icono = new ImageIcon(fondo.getImage().getScaledInstance(jLabel1_fondo.getWidth()
                ,jLabel1_fondo.getHeight(), Image.SCALE_DEFAULT ));
        jLabel1_fondo.setIcon(icono);
        this.repaint();
        
    }
    private static Connection  conexion;
      private static PreparedStatement sentencia_preparada;
    private static ResultSet resultados;
    public void buscareliminarpedido(String clave){
    
     try {
         conexion = conexion_bd.conectar();
         String consulta= "SELECT * FROM PASTELERIA.Pedido WHERE clave = ?";
         sentencia_preparada = conexion.prepareStatement(consulta);
          sentencia_preparada.setString(1, clave);
         resultados = sentencia_preparada.executeQuery();
         if(resultados.next()){
             lblinformacion.setText("Pedido Registrado");
             lblvendedor.setText(resultados.getString("FK_claveE"));
             lblcliente.setText(resultados.getString("FK_claveC"));
             lblpastel.setText(resultados.getString("FK_claveP"));

             
             
             
             
         }else{
             lblinformacion.setText("Sin Resultados");
             
           
         }
         conexion.close ();
     } catch (SQLException e){
          System.out.println("Error"+e);
     }finally{
             try {
                 conexion.close();
             } catch (SQLException ex) {
                 
            
                 System.out.println("Error"+ex);
             }

}

 }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbl_clave = new javax.swing.JLabel();
        txt_clave = new javax.swing.JTextField();
        lblinformacion = new javax.swing.JLabel();
        lbl_ap1 = new javax.swing.JLabel();
        lbl_ap5 = new javax.swing.JLabel();
        lbl_ap4 = new javax.swing.JLabel();
        lblpastel = new javax.swing.JLabel();
        lblcliente = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblvendedor = new javax.swing.JLabel();
        jLabel1_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BAJA DE PEDIDOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 580, 40));

        lbl_clave.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_clave.setForeground(new java.awt.Color(255, 255, 255));
        lbl_clave.setText("Clave de Pedido:");
        getContentPane().add(lbl_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 190, 60));

        txt_clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_claveActionPerformed(evt);
            }
        });
        txt_clave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_claveKeyReleased(evt);
            }
        });
        getContentPane().add(txt_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 180, 40));

        lblinformacion.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lblinformacion.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblinformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 390, 70));

        lbl_ap1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbl_ap1.setForeground(new java.awt.Color(255, 51, 51));
        lbl_ap1.setText("Vendedor:");
        getContentPane().add(lbl_ap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 190, 60));

        lbl_ap5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbl_ap5.setForeground(new java.awt.Color(255, 51, 51));
        lbl_ap5.setText("Cliente:");
        getContentPane().add(lbl_ap5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 140, 60));

        lbl_ap4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbl_ap4.setForeground(new java.awt.Color(255, 51, 51));
        lbl_ap4.setText("Pastel:");
        getContentPane().add(lbl_ap4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 240, 120, 60));

        lblpastel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblpastel.setForeground(new java.awt.Color(255, 51, 51));
        lblpastel.setText("--");
        getContentPane().add(lblpastel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 240, 130, 60));

        lblcliente.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblcliente.setForeground(new java.awt.Color(255, 51, 51));
        lblcliente.setText("--");
        getContentPane().add(lblcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 130, 60));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        jButton2.setText("cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 580, 170, 70));

        jButton1.setBackground(new java.awt.Color(51, 255, 0));
        jButton1.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        jButton1.setText("eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 580, 170, 70));

        lblvendedor.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblvendedor.setForeground(new java.awt.Color(255, 51, 51));
        lblvendedor.setText("--");
        getContentPane().add(lblvendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 130, 60));
        getContentPane().add(jLabel1_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_claveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_claveActionPerformed

    private void txt_claveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_claveKeyReleased

        buscareliminarpedido(txt_clave.getText());

        // TODO add your handling code here:
    }//GEN-LAST:event_txt_claveKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        menu_principal nuevaventana = new menu_principal();
        nuevaventana.setVisible(true);

        //para que no se acumulen las ventanas
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        //boton guardar
        metodos_SQL.eliminarpedido(txt_clave.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(baja_pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(baja_pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(baja_pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(baja_pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new baja_pedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_fondo;
    private javax.swing.JLabel lbl_ap1;
    private javax.swing.JLabel lbl_ap4;
    private javax.swing.JLabel lbl_ap5;
    private javax.swing.JLabel lbl_clave;
    private javax.swing.JLabel lblcliente;
    private javax.swing.JLabel lblinformacion;
    private javax.swing.JLabel lblpastel;
    private javax.swing.JLabel lblvendedor;
    private javax.swing.JTextField txt_clave;
    // End of variables declaration//GEN-END:variables
}