
package Desplegables;
import ManejoArchivos.Archivos;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Usuarios extends javax.swing.JFrame {

    public Usuarios() {
        initComponents();
    }
    public static String Lantigua;
    public boolean Modificar = false;
    public int Nivel = 0;
    public String nivel= "";
    public int v;

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loginlbl = new javax.swing.JLabel();
        txtlogin = new javax.swing.JTextField();
        passwordlbl = new javax.swing.JLabel();
        nombrelbl = new javax.swing.JLabel();
        apellidoslbl = new javax.swing.JLabel();
        emaillbl = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        etqEstado = new javax.swing.JTextField();
        accesolbl = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        normalbt = new javax.swing.JRadioButton();
        adminbt = new javax.swing.JRadioButton();
        guardarbt = new javax.swing.JButton();
        limpiarbt = new javax.swing.JButton();
        salirbt = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(37, 109, 123));

        jLabel1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-grupo-de-usuario-32.png"))); // NOI18N
        jLabel1.setText("USUARIO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(140, 140, 140))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26))
        );

        loginlbl.setText("Login");

        passwordlbl.setText("Password");

        nombrelbl.setText("Nombre");

        apellidoslbl.setText("Apellidos");

        emaillbl.setText("Email");

        etqEstado.setEditable(false);
        etqEstado.setEnabled(false);
        etqEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etqEstadoActionPerformed(evt);
            }
        });

        accesolbl.setText("Nivel de Acceso");

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        normalbt.setText("Normal");

        adminbt.setText("Administrador");

        guardarbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-guardar-32.png"))); // NOI18N
        guardarbt.setText("Guardar");
        guardarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarbtActionPerformed(evt);
            }
        });

        limpiarbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-actualizar-32.png"))); // NOI18N
        limpiarbt.setText("Limpiar");
        limpiarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarbtActionPerformed(evt);
            }
        });

        salirbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-salida-32.png"))); // NOI18N
        salirbt.setText("Salir");
        salirbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirbtActionPerformed(evt);
            }
        });

        jLabel2.setText("Estado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(accesolbl)
                            .addGap(32, 32, 32)
                            .addComponent(normalbt)
                            .addGap(36, 36, 36)
                            .addComponent(adminbt))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(guardarbt)
                            .addGap(26, 26, 26)
                            .addComponent(limpiarbt)
                            .addGap(31, 31, 31)
                            .addComponent(salirbt))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nombrelbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordlbl)
                                    .addComponent(loginlbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtlogin, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                    .addComponent(txtpassword))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(apellidoslbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(emaillbl)
                                    .addGap(26, 26, 26)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                .addComponent(txtapellidos)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginlbl)
                    .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordlbl))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrelbl)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoslbl)
                    .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emaillbl)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accesolbl)
                    .addComponent(normalbt)
                    .addComponent(adminbt))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarbt)
                    .addComponent(limpiarbt)
                    .addComponent(salirbt))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirbtActionPerformed
         this.dispose();
    }//GEN-LAST:event_salirbtActionPerformed

    private void limpiarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarbtActionPerformed
        txtlogin.setText("");
        txtpassword.setText("");
        txtnombre.setText("");
        txtapellidos.setText("");
        txtemail.setText("");
        etqEstado.setText("");
    }//GEN-LAST:event_limpiarbtActionPerformed

    private void guardarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarbtActionPerformed
      Archivos ar = new Archivos();
        File nwa = new File("D:\\DB\\Usuario.txt");
        boolean validar = true;
        String usuario, login, pass, nombre, apellido,email;
        //do{
            if(txtlogin.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El campo de login no debe estar vacio");
                validar=false;
                txtlogin.grabFocus();
            }else if(txtpassword.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El campo de password no debe estar vacio");
                validar=false;
                txtpassword.grabFocus();
            }else if(txtnombre.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El nombre nombre no debe estar vacio");
                validar=false;
                txtnombre.grabFocus();
            }else if(txtapellidos.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Los apellidos no deben estar vacios");
                validar=false;
                txtapellidos.grabFocus();
            }else if(txtemail.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El Email no deben estar vacios");
                validar=false;
                txtemail.grabFocus();
            }else if(v==0){
               validar=false;
               JOptionPane.showMessageDialog(null, "El email no es valido");
               txtemail.grabFocus();
            }
        //}while(validar!=true);
        
        login=txtlogin.getText();
        pass=txtpassword.getText();
        nombre=txtnombre.getText();
        apellido=txtapellidos.getText();
        email=txtemail.getText();
        if(adminbt.isSelected()){
            nivel="0";
        }else if(normalbt.isSelected()){
            nivel="1";
        }
        usuario= login+";"+pass+";"+nivel+";"+nombre+";"+apellido+";"+email;
        if(validar){
          if(Modificar){
            ar.ModificarArchivo(Lantigua,usuario, nwa);
            JOptionPane.showMessageDialog(null,"Modificado exitosamente");
            limpiarbtActionPerformed(evt);
            }else{
            ar.Guardar(usuario, nwa);
            JOptionPane.showMessageDialog(null,"Guardado exitosamente");
            limpiarbtActionPerformed(evt);
            }  
        }                      
    }//GEN-LAST:event_guardarbtActionPerformed

    private void txtnombreKeyPressed(java.awt.event.KeyEvent evt) {                                     
    if(evt.getKeyCode()== KeyEvent.VK_ENTER){
        txtapellidos.grabFocus();
    }
    }                                    

    private void txtapellidosKeyPressed(java.awt.event.KeyEvent evt) {                                        
     if(evt.getKeyCode()== KeyEvent.VK_ENTER){
        txtemail.grabFocus();
    }
    }                                       

    private void txtemailKeyTyped(java.awt.event.KeyEvent evt) {                                  
        String correo = txtemail.getText();
                String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(correo);

                if (matcher.matches()) {
                    jLabel1.setText("Correo electrónico válido");                    
                    v=1;
                } else {
                    jLabel1.setText("Correo electrónico no válido");                    
                    v=0;
                } 
                if(txtemail.getText().isEmpty()){
                    jLabel1.setText("");
                }
    }                                 

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void etqEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etqEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etqEstadoActionPerformed

    
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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accesolbl;
    private javax.swing.JRadioButton adminbt;
    private javax.swing.JLabel apellidoslbl;
    private javax.swing.JLabel emaillbl;
    private javax.swing.JTextField etqEstado;
    private javax.swing.JButton guardarbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton limpiarbt;
    private javax.swing.JLabel loginlbl;
    private javax.swing.JLabel nombrelbl;
    private javax.swing.JRadioButton normalbt;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JButton salirbt;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtlogin;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
