/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Desplegables;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author admin
 */
public class ConsultaBalanzaGeneral extends javax.swing.JDialog {

    /**
     * Creates new form ConsultaBalanzaGeneral
     */
    public ConsultaBalanzaGeneral(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        GenerarConsulta();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setDragEnabled(true);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowGrid(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void GenerarConsulta(){
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{
            "Número de Cuenta", "Descripción", "Tipo Cuenta", "Nivel", "Cuenta Padre", "Grupo Cuenta",
            "Conciliable", "Fecha", "Hora", "Balance", "Débito", "Crédito"
        });
        jTable1.setModel(model);

        String rutaArchivo = "C:\\Users\\admin\\Desktop\\Catalogo_Cuentas.txt"; // Ajusta la ruta

        double totalBalance = 0.0;
        double totalDebito = 0.0;
        double totalCredito = 0.0;

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");

                if (datos.length >= 12) {
                    // Convertir Balance, Débito y Crédito a valores numéricos
                    double balance = Double.parseDouble(datos[9]);
                    double debito = Double.parseDouble(datos[10]);
                    double credito = Double.parseDouble(datos[11]);

                    totalBalance += balance;
                    totalDebito += debito;
                    totalCredito += credito;

                    model.addRow(new Object[]{
                        datos[0],  
                        datos[1],  
                        datos[2],  
                        datos[3],  
                        datos[4],  
                        datos[5],  
                        datos[6],  
                        datos[7],  
                        datos[8],  
                        balance,  
                        debito,  
                        credito
                    });
                }
            }

            model.addRow(new Object[]{
                "TOTAL", "", "", "", "", "", "", "", "", 
                totalBalance, 
                totalDebito, 
                totalCredito
            });

            // Configurar el TableRowSorter para ordenar las filas
            TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
            jTable1.setRowSorter(sorter);

            // Establecer la columna por la que se debe ordenar (columna 0, que es "Número de Documento")
            sorter.setSortKeys(java.util.Collections.singletonList(new RowSorter.SortKey(0, SortOrder.ASCENDING)));

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error al convertir valores numéricos: " + e.getMessage());
        }
    }
    
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
            java.util.logging.Logger.getLogger(ConsultaBalanzaGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaBalanzaGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaBalanzaGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaBalanzaGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConsultaBalanzaGeneral dialog = new ConsultaBalanzaGeneral(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
