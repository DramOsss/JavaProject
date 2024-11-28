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
    private boolean mostrarContrasena = false;

    
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
        txtemail = new javax.swing.JTextField();
        guardarbt = new javax.swing.JButton();
        limpiarbt = new javax.swing.JButton();
        salirbt = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();
        accesolbl1 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        passwordlbl1 = new javax.swing.JLabel();
        txtpassword1 = new javax.swing.JPasswordField();
        seeButton1 = new javax.swing.JButton();
        seeButton = new javax.swing.JButton();

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

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnombreKeyPressed(evt);
            }
        });

        txtapellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtapellidosKeyPressed(evt);
            }
        });

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

        accesolbl1.setText("Nivel de Acceso");

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Administrador" }));

        passwordlbl1.setText("Connfirm Password");

        seeButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-visible-24.png"))); // NOI18N
        seeButton1.setToolTipText("");
        seeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeButton1ActionPerformed(evt);
            }
        });

        seeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-visible-24.png"))); // NOI18N
        seeButton.setToolTipText("");
        seeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(accesolbl1)
                        .addGap(26, 26, 26)
                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(guardarbt)
                        .addGap(26, 26, 26)
                        .addComponent(limpiarbt)
                        .addGap(31, 31, 31)
                        .addComponent(salirbt))
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
                            .addComponent(txtapellidos)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(passwordlbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seeButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seeButton)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginlbl)
                    .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passwordlbl))
                    .addComponent(seeButton))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordlbl1)
                    .addComponent(seeButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accesolbl1)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

     private boolean esEmailValido(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email.matches(emailRegex);
    }

     
    private void limpiarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarbtActionPerformed
        txtlogin.setText("");
        txtpassword.setText("");
        txtpassword1.setText("");
        txtnombre.setText("");
        txtapellidos.setText("");
        txtemail.setText("");
    }//GEN-LAST:event_limpiarbtActionPerformed

    private void guardarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarbtActionPerformed
     if (validarCampos()) {
        Archivos archivos = new Archivos();
        File file = new File("C:\\Users\\admin\\\\Desktop\\Usuario.txt");
        String usuario, login, pass, pass1, nombre, apellido,email,comboGuardado;
        // Recoger los valores de los campos
        login = txtlogin.getText();
        pass = txtpassword.getText();
        pass1 = txtpassword1.getText();
        
        if (!pass.equals(pass1)) {  
            JOptionPane.showMessageDialog(null, "No coinciden las contraseñas");
            return;
        }   
            
        nombre = txtnombre.getText();
        apellido = txtapellidos.getText();
        email = txtemail.getText();
        comboGuardado=(String)comboBox.getSelectedItem();
        if(comboGuardado.equals("Normal")){
            nivel="1";
        }else if(comboGuardado.equals("Administrador")){
            nivel="0";
        }
        usuario= login+";"+pass+";"+nivel+";"+nombre+";"+apellido+";"+email;
        
        if (Modificar) {
            archivos.ModificarArchivo(Lantigua, usuario, file);
            JOptionPane.showMessageDialog(null, "Modificado exitosamente");
        } else {
            archivos.Guardar(usuario, file);
            JOptionPane.showMessageDialog(null, "Guardado exitosamente");
        }
        
        limpiarbtActionPerformed(evt);
     }
    }//GEN-LAST:event_guardarbtActionPerformed
                                  
    private boolean validarCampos() {
        if (txtlogin.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de login no debe estar vacío");
            txtlogin.grabFocus();
            return false;
        } else if (txtpassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de password no debe estar vacío");
            txtpassword.grabFocus();
            return false;
        } else if (txtpassword1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de confirmacion de password no debe estar vacío");
            txtpassword1.grabFocus();
            return false;
        } else if (txtnombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre no debe estar vacío");
            txtnombre.grabFocus();
            return false;
        } else if (txtapellidos.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Los apellidos no deben estar vacíos");
            txtapellidos.grabFocus();
            return false;
        } else if (txtemail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El Email no debe estar vacío");
            txtemail.grabFocus();
            return false;
        } else if (!esEmailValido(txtemail.getText())) { // Asumir que v es una variable que valida el email
            JOptionPane.showMessageDialog(null, "El email no es válido");
            txtemail.grabFocus();
            return false;
        }
        return true;
    }

    private void txtnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyPressed
         if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            txtapellidos.grabFocus();
        }
    }//GEN-LAST:event_txtnombreKeyPressed

    private void txtapellidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidosKeyPressed
       if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            txtemail.grabFocus();
       }
    }//GEN-LAST:event_txtapellidosKeyPressed

    private void seeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeButton1ActionPerformed
        if (mostrarContrasena) {
                    txtpassword1.setEchoChar('•'); 
                    
                } else {
                    txtpassword1.setEchoChar((char) 0); 
                    
                }
                mostrarContrasena = !mostrarContrasena; 
    }//GEN-LAST:event_seeButton1ActionPerformed

    private void seeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeButtonActionPerformed
       if (mostrarContrasena) {
                    txtpassword.setEchoChar('•'); 
                    
                } else {
                    txtpassword.setEchoChar((char) 0); 
                    
                }
                mostrarContrasena = !mostrarContrasena; 
    }//GEN-LAST:event_seeButtonActionPerformed

    
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
    private javax.swing.JLabel accesolbl1;
    private javax.swing.JLabel apellidoslbl;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel emaillbl;
    private javax.swing.JButton guardarbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton limpiarbt;
    private javax.swing.JLabel loginlbl;
    private javax.swing.JLabel nombrelbl;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JLabel passwordlbl1;
    private javax.swing.JButton salirbt;
    private javax.swing.JButton seeButton;
    private javax.swing.JButton seeButton1;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtlogin;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JPasswordField txtpassword1;
    // End of variables declaration//GEN-END:variables
}
