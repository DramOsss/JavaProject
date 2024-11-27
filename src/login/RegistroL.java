
package login;

import ManejoArchivos.Archivos;
import Desplegables.VentanaInicio;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class RegistroL extends javax.swing.JFrame {

    
    public RegistroL() {
        initComponents();
    }
  private int lvl;
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        Iniciarbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(37, 109, 123));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 405, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        jLabel1.setText("LOGIN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-usuario-32.png"))); // NOI18N
        jLabel2.setText("User");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-contraseña-32.png"))); // NOI18N
        jLabel3.setText("Password");

        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });

        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });

        Iniciarbtn.setText("INICIAR");
        Iniciarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(txtusuario)
                            .addComponent(txtpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(Iniciarbtn)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(Iniciarbtn)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarbtnActionPerformed
       String usuario = txtusuario.getText();
        String password = txtpassword.getText();
                
        if(usuario.isEmpty() && password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe ingresar el usuario y la contraseña");
        }
        else if(usuario.isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe ingresar el usuario");
        }
        else if(password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe ingresar la contraseña");
        }
        boolean encontrado = false;
                
        try {
            File f = new File("D:\\DB\\Usuario.txt");
            if(!f.exists()){
                f.createNewFile();
            }
            else {
                Scanner a = new Scanner(f);
                while(a.hasNextLine() && !encontrado){
                    String linea = a.nextLine();
                    Scanner a1 = new Scanner(linea);
                    
                    a1.useDelimiter("\\s*;\\s*");
                    
                    String Log = a1.next();
                    String Pass = a1.next();
                    
                    if(Log.equals(txtusuario.getText()) && Pass.equals(txtpassword.getText())){
                     lvl=Integer.parseInt(a1.next());
                     String name = a1.next();
                     VentanaInicio ve = new VentanaInicio();
                        if(lvl==1){
                           // ve.menProcesos.setEnabled(false);
                            //ve.itmUsuario.setEnabled(false);
                           // ve.lblLetrero.setText("Status:Normal");
                        }
                      //  ve.lblLetrero.setText("Status: Administrador");
                      //  ve.jLabel1.setText("User: " +name);
                        int validar=lvl;
                     //   ve.Dato(validar);
                        ve.setVisible(true);
                        encontrado = true;
                        this.dispose();
                    
                    }else{
                        encontrado = false;
                        if(Log.equals(txtusuario.getText())){
                            JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                            txtpassword.setText("");
                            return;
                        }
                        else if(!a.hasNextLine()){
                            JOptionPane.showMessageDialog(null, "Uusario no encontrado");
                            txtusuario.setText("");
                            txtpassword.setText("");
                        }
                    }
                }
                a.close();
            }
        }
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }                                          

    private void windowadmin(java.awt.event.WindowEvent evt) {                             
        Archivos ar = new Archivos();
        File archivosDBase = new File("D:\\DB");
        if(!archivosDBase.exists()){
            archivosDBase.mkdir();
            
            String Administrador = "Admin;4321;0;Admin;Admin;Provisional;admin@gmail.com";
            File uf = new File("D:\\DB\\Usuario.txt");
            ar.Guardar(Administrador, uf);
       }                            
    }//GEN-LAST:event_IniciarbtnActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        txtpassword.grabFocus();
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        IniciarbtnActionPerformed(evt);
    }//GEN-LAST:event_txtpasswordActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Iniciarbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
