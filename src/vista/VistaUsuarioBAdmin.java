/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControlUsuario;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.like;
import modelo.usuario;

/**
 *
 * @author Vale
 */
public class VistaUsuarioBAdmin extends javax.swing.JFrame {

    LinkedList<usuario> listaUsuarios;
    String id1;

    /**
     * Creates new form VistaUsuarioBorrar
     */
    public VistaUsuarioBAdmin() {
        initComponents();
        listaUsuarios = new LinkedList<>();
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        txtcorreouser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnconsultarusuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Eliminar Usuario");

        jLabel2.setText("Ingresar el Id del usuario a eliminar:");

        jButton1.setText("Borrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Consultar todos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Consultar todos los usuarios");

        jLabel4.setText("Consultar por id");

        btnconsultarusuario.setText("Consultar");
        btnconsultarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarusuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(385, 385, 385))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 948, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(txtcorreouser, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnconsultarusuario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcorreouser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnconsultarusuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2))
                .addGap(76, 76, 76))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        ControlUsuario objcu = new ControlUsuario();
        int ncol;
        Object[] fila;

        // if (busqueda.equals("")){
        listaUsuarios = objcu.consultarUsuarios();

        DefaultTableModel modelo = new DefaultTableModel();
        this.jTable1.setModel(modelo);

        modelo.addColumn("primer nombre");
        modelo.addColumn("segundo nombre");
        modelo.addColumn("primer apellido");
        modelo.addColumn("segundo apellido");
        modelo.addColumn("foto perfil");
        modelo.addColumn("correo");
        modelo.addColumn("contraseña");
        modelo.addColumn("Estado bloqueo");
        modelo.addColumn("rol");
        ncol = modelo.getColumnCount();

        for (int i = 0; i < listaUsuarios.size(); i++) {

            fila = new Object[ncol];
            fila[0] = listaUsuarios.get(i).getNombre1U();
            fila[1] = listaUsuarios.get(i).getNombre2U();
            fila[2] = listaUsuarios.get(i).getApellido1U();
            fila[3] = listaUsuarios.get(i).getApellido2U();
            fila[4] = listaUsuarios.get(i).getFotodePerfil();
            fila[5] = listaUsuarios.get(i).getCorreoU();
            fila[6] = listaUsuarios.get(i).getContraseñaU();
            fila[7] = listaUsuarios.get(i).getEstadoBloqueo();
            fila[8] = listaUsuarios.get(i).getIdRolf();
            modelo.addRow(fila);

            // }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String correoU = jTextField1.getText();
        ControlUsuario cu = new ControlUsuario();
        usuario borrarUsuario = new usuario(correoU);
       boolean t= cu.BorrarUsuario(borrarUsuario);
         if(t==true){
            JOptionPane.showMessageDialog(rootPane, "Se borró el usuario");
            
        }else {
               JOptionPane.showMessageDialog(rootPane, "No se borró el usuario");
        }   // TODO add your handling code here:
      
         
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnconsultarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarusuarioActionPerformed
        // TODO add your handling code here:

        ControlUsuario objcu = new ControlUsuario();
        int ncol;
        Object[] fila;

        // if (busqueda.equals("")){
        
        listaUsuarios = objcu.consultarUsuarios(txtcorreouser.getText());

        DefaultTableModel modelo = new DefaultTableModel();
        this.jTable1.setModel(modelo);

        modelo.addColumn("primer nombre");
        modelo.addColumn("segundo nombre");
        modelo.addColumn("primer apellido");
        modelo.addColumn("segundo apellido");
        modelo.addColumn("foto perfil");
        modelo.addColumn("correo");
        modelo.addColumn("contraseña");
        modelo.addColumn("Estado bloqueo");
        modelo.addColumn("rol");
        ncol = modelo.getColumnCount();

        for (int i = 0; i < listaUsuarios.size(); i++) {

            fila = new Object[ncol];
            fila[0] = listaUsuarios.get(i).getNombre1U();
            fila[1] = listaUsuarios.get(i).getNombre2U();
            fila[2] = listaUsuarios.get(i).getApellido1U();
            fila[3] = listaUsuarios.get(i).getApellido2U();
            fila[4] = listaUsuarios.get(i).getFotodePerfil();
            fila[5] = listaUsuarios.get(i).getCorreoU();
            fila[6] = listaUsuarios.get(i).getContraseñaU();
            fila[7] = listaUsuarios.get(i).getEstadoBloqueo();
            fila[8] = listaUsuarios.get(i).getIdRolf();
            modelo.addRow(fila);

            // }
        }
    }//GEN-LAST:event_btnconsultarusuarioActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int cor = jTable1.getSelectedRow();
        id1 = jTable1.getValueAt(cor, 5).toString();
        jTextField1.setText(id1);
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(VistaUsuarioBAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaUsuarioBAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaUsuarioBAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaUsuarioBAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaUsuarioBAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnconsultarusuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtcorreouser;
    // End of variables declaration//GEN-END:variables
}
