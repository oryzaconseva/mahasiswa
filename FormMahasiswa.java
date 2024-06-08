/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package oryzac12.view;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import oryzac13.controller.MahasiswaController;
import javax.swing.JTable;
import javax.swing.JFrame;

/**
 *
 * @author ORYZA CONSEVA
 */
public class FormMahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form Mahasiswa
     */
    MahasiswaController controller;
    public FormMahasiswa() {
        initComponents();
        controller = new MahasiswaController(this);
        controller.cancel();
        controller.viewData();
    }

    public JComboBox<String> getCboJenisKelamin() {
        return cboJenisKelamin;
    }

    public JTextField getTxtAlamat() {
        return txtAlamat;
    }

    public JTextField getTxtNobp () {
        return txtNobp;
    }

    public JTextField getTxtNama() {
        return txtNama;
    }

    public JTextField getTxtTanggalLahir() {
        return txtTanggalLahir;
    }
    
    public JTable getTabelMahasiswa(){
        return tabelMahasiswa;
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
        jLabel1 = new javax.swing.JLabel();
        txtNobp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cboJenisKelamin = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtTanggalLahir = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelMahasiswa = new javax.swing.JTable();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("NOBP");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 80, 30);

        txtNobp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNobpActionPerformed(evt);
            }
        });
        getContentPane().add(txtNobp);
        txtNobp.setBounds(120, 10, 330, 30);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 50, 80, 30);
        getContentPane().add(txtNama);
        txtNama.setBounds(120, 52, 330, 30);

        jLabel3.setText("Alamat");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 90, 80, 30);
        getContentPane().add(txtAlamat);
        txtAlamat.setBounds(120, 90, 330, 30);

        jLabel4.setText("Jenis Kelamin");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 130, 90, 30);

        cboJenisKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboJenisKelamin);
        cboJenisKelamin.setBounds(120, 130, 100, 30);

        jLabel5.setText("Tanggal Lahir");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 170, 90, 30);

        txtTanggalLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTanggalLahirActionPerformed(evt);
            }
        });
        getContentPane().add(txtTanggalLahir);
        txtTanggalLahir.setBounds(120, 170, 330, 30);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(20, 220, 72, 23);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(110, 220, 75, 23);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(200, 220, 72, 23);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(290, 220, 70, 23);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(380, 220, 60, 23);

        tabelMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NoBP", "Nama", "Alamat", "Jekel", "TglLahir"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelMahasiswa);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 250, 452, 230);

        setSize(new java.awt.Dimension(487, 493));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNobpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNobpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNobpActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        controller.insert();
        controller.viewData();
        controller.cancel();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        controller.update();
        controller.viewData();
        controller.delete();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        controller.delete();
        controller.update();
        controller.viewData();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtTanggalLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTanggalLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTanggalLahirActionPerformed

    private void tabelMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMahasiswaMouseClicked
        // TODO add your handling code here:
        controller.getMahasiswa();
    }//GEN-LAST:event_tabelMahasiswaMouseClicked

   
    
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
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboJenisKelamin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabelMahasiswa;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNobp;
    private javax.swing.JTextField txtTanggalLahir;
    // End of variables declaration//GEN-END:variables

   
}
