/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.finalproject;

/**
 *
 * @author HFCPC
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        Background_P = new javax.swing.JPanel();
        Icon_L1 = new javax.swing.JLabel();
        Username_L1 = new javax.swing.JLabel();
        Password_L1 = new javax.swing.JLabel();
        Password_TF = new javax.swing.JTextField();
        Username_TF = new javax.swing.JTextField();
        Login_B1 = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Background_P.setBackground(new java.awt.Color(255, 255, 255));

        Icon_L1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HFCPC\\Desktop\\download.png")); // NOI18N

        Username_L1.setText("Username");

        Password_L1.setText("Password");

        Password_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password_TFActionPerformed(evt);
            }
        });

        Username_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Username_TFActionPerformed(evt);
            }
        });

        Login_B1.setText("Login");
        Login_B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_B1ActionPerformed(evt);
            }
        });

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Background_PLayout = new javax.swing.GroupLayout(Background_P);
        Background_P.setLayout(Background_PLayout);
        Background_PLayout.setHorizontalGroup(
            Background_PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Background_PLayout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addGroup(Background_PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Background_PLayout.createSequentialGroup()
                        .addComponent(Back)
                        .addGap(139, 139, 139)
                        .addComponent(Login_B1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Username_L1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password_L1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Background_PLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(Background_PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Username_TF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Password_TF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(280, Short.MAX_VALUE))
            .addGroup(Background_PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Background_PLayout.createSequentialGroup()
                    .addGap(166, 166, 166)
                    .addComponent(Icon_L1)
                    .addContainerGap(160, Short.MAX_VALUE)))
        );
        Background_PLayout.setVerticalGroup(
            Background_PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Background_PLayout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .addGroup(Background_PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Background_PLayout.createSequentialGroup()
                        .addComponent(Username_L1)
                        .addGap(38, 38, 38)
                        .addComponent(Password_L1))
                    .addGroup(Background_PLayout.createSequentialGroup()
                        .addComponent(Username_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(Password_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(Background_PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(Login_B1))
                .addGap(168, 168, 168))
            .addGroup(Background_PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Background_PLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Icon_L1)
                    .addContainerGap(335, Short.MAX_VALUE)))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background_P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background_P, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Password_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Password_TFActionPerformed

    private void Username_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Username_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Username_TFActionPerformed

    private void Login_B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_B1ActionPerformed
        String Username = Username_TF.getText();
        String Password = Password_TF.getText();

        if( Username.equals("Admin") & Password.equals("Admin")){
            Admin admin = new Admin();
        this.setVisible(false);
        admin.setVisible(true);
        }
        else 
            if(Username.equals("Student") & Password.equals("Student")){
                jStudent student = new jStudent();
                this.setVisible(false);
                student.setVisible(true);
                 }
                else 
            if(Username.equals("Staff") & Password.equals("Staff")){
                jStaff staff = new jStaff();
                this.setVisible(false);
                staff.setVisible(true);
                 }

    }//GEN-LAST:event_Login_B1ActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        this.setVisible(false);
        new Main_Menu().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JPanel Background_P;
    private javax.swing.JLabel Icon_L1;
    private javax.swing.JButton Login_B1;
    private javax.swing.JLabel Password_L1;
    private javax.swing.JTextField Password_TF;
    private javax.swing.JLabel Username_L1;
    private javax.swing.JTextField Username_TF;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
