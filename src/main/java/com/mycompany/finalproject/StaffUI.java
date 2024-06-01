/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.finalproject;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author HFCPC
 */
public class StaffUI extends javax.swing.JFrame {

    /**
     * Creates new form StaffUI
     */
    public StaffUI() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NicTF = new javax.swing.JTextField();
        EmailTF = new javax.swing.JTextField();
        SalaryTF = new javax.swing.JTextField();
        AddressTF = new javax.swing.JTextField();
        MobileTF = new javax.swing.JTextField();
        LectureTF = new javax.swing.JTextField();
        PracticeTF = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        SearchTF = new javax.swing.JTextField();
        BackB = new javax.swing.JButton();
        DeleteB = new javax.swing.JButton();
        AddB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nic");

        jLabel2.setText("Email");

        jLabel3.setText("Salary");

        jLabel4.setText("Address");

        jLabel5.setText("Mobile");

        jLabel6.setText("Lecture Hours");

        jLabel7.setText("Practice Hours");

        NicTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NicTFActionPerformed(evt);
            }
        });

        AddressTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressTFActionPerformed(evt);
            }
        });

        PracticeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PracticeTFActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nic", "Email", "Salary", "Address", "Mobile", "Lecture Hours", "Practice Hours"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\HFCPC\\Desktop\\New folder (2)\\13626973_1219189924811633_2762465031289819980_n (1).jpg")); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("Search Data");

        SearchTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTFActionPerformed(evt);
            }
        });
        SearchTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchTFKeyReleased(evt);
            }
        });

        BackB.setText("Back");
        BackB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBActionPerformed(evt);
            }
        });

        DeleteB.setText("Delete");
        DeleteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBActionPerformed(evt);
            }
        });

        AddB.setText("Add");
        AddB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AddB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NicTF)
                            .addComponent(EmailTF)
                            .addComponent(AddressTF)
                            .addComponent(MobileTF)
                            .addComponent(LectureTF)
                            .addComponent(PracticeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SalaryTF, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(DeleteB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BackB)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SearchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel8)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NicTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalaryTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MobileTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LectureTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PracticeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackB)
                    .addComponent(DeleteB)
                    .addComponent(AddB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SearchTF)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PracticeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PracticeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PracticeTFActionPerformed

    private void NicTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NicTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NicTFActionPerformed

    private void AddressTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressTFActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         DefaultTableModel tblModel= (DefaultTableModel) jTable1.getModel();
        
        String tblnic = tblModel.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String tblemail = tblModel.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String tblsalary = tblModel.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String tbladdress = tblModel.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String tblmobile = tblModel.getValueAt(jTable1.getSelectedRow(), 4).toString();
        String tbllecture = tblModel.getValueAt(jTable1.getSelectedRow(), 5).toString();
        String tblpractice = tblModel.getValueAt(jTable1.getSelectedRow(), 6).toString();
        
        // set to textfield 
        
        NicTF.setText(tblnic);
        EmailTF.setText(tblemail);
        SalaryTF.setText(tblsalary);
        AddressTF.setText(tbladdress);
        MobileTF.setText(tblmobile);
        LectureTF.setText(tbllecture);
        PracticeTF.setText(tblpractice);
    }//GEN-LAST:event_jTable1MouseClicked

    private void SearchTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTFActionPerformed

    private void SearchTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTFKeyReleased
        DefaultTableModel obj = (DefaultTableModel) jTable1.getModel();
         TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(obj);
         jTable1.setRowSorter(obj1);
         obj1.setRowFilter(RowFilter.regexFilter(SearchTF.getText()));
    }//GEN-LAST:event_SearchTFKeyReleased

    private void AddBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBActionPerformed
        if(NicTF.getText().equals("") || EmailTF.getText().equals("") || SalaryTF.getText().equals("")|| AddressTF.getText().equals("") || MobileTF.getText().equals("") || LectureTF.getText().equals("")|| PracticeTF.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter All Data! ");
        }else {

            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
            //add string array data
            tblModel.addRow(new Object[]{NicTF.getText(),EmailTF.getText(),Double.valueOf(SalaryTF.getText()),AddressTF.getText(),MobileTF.getText(),Integer.valueOf(LectureTF.getText()),Integer.valueOf(PracticeTF.getText())}
            );

            JOptionPane.showMessageDialog(this, "Add Data Successfully ");
            NicTF.setText("");
            EmailTF.setText("");
            SalaryTF.setText("");
            AddressTF.setText("");
            MobileTF.setText("");
            LectureTF.setText("");
            PracticeTF.setText("");
        }
    }//GEN-LAST:event_AddBActionPerformed

    private void DeleteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

        //delete Row
        if (jTable1.getSelectedRowCount()== 1){
            NicTF.setText("");
            EmailTF.setText("");
            SalaryTF.setText("");
            AddressTF.setText("");
            MobileTF.setText("");
            LectureTF.setText("");
            PracticeTF.setText("");
            // if single row selectes
            tblModel.removeRow(jTable1.getSelectedRow());

        }else {
            if(jTable1.getRowCount() == 0 ){
                JOptionPane.showMessageDialog(this, "Table is Empty");

            }else {
                JOptionPane.showMessageDialog(this, "Please Enter Single Row For Delete");
            }

        }
    }//GEN-LAST:event_DeleteBActionPerformed

    private void BackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBActionPerformed
        Admin admin = new Admin();
        this.setVisible(false);
        admin.setVisible(true);
    }//GEN-LAST:event_BackBActionPerformed

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
            java.util.logging.Logger.getLogger(StaffUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StaffUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddB;
    private javax.swing.JTextField AddressTF;
    private javax.swing.JButton BackB;
    private javax.swing.JButton DeleteB;
    private javax.swing.JTextField EmailTF;
    private javax.swing.JTextField LectureTF;
    private javax.swing.JTextField MobileTF;
    private javax.swing.JTextField NicTF;
    private javax.swing.JTextField PracticeTF;
    private javax.swing.JTextField SalaryTF;
    private javax.swing.JTextField SearchTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
