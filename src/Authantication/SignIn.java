package Authantication;

import Component.MSG;
import Database.DBConnection;
import Themes.Theme;
import Home.Home;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SignIn extends javax.swing.JFrame {
    PreparedStatement ps;
    ResultSet rs;
    
    public SignIn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        gotoSignUp = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnSignIn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(888, 535));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/signin.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 38, -1, -1));

        jLabel2.setFont(new java.awt.Font("Barlow", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sign In");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 44, 506, 37));

        jLabel3.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Email                :");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 178, 120, 30));

        gotoSignUp.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        gotoSignUp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gotoSignUp.setText("Sign Up");
        gotoSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gotoSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotoSignUpMouseClicked(evt);
            }
        });
        jPanel2.add(gotoSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 518, 70, 24));

        jLabel5.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Password        :");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 228, 120, 30));

        txtPassword.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 228, 220, 30));

        txtEmail.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 178, 220, 30));

        btnSignIn.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnSignIn.setText("Sign In");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        jPanel2.add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 308, 210, 40));

        jLabel6.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Wecome to app , Continue with your email and password");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 103, 516, 24));

        jLabel7.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Do you have an account ? ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 518, 210, 24));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1063, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gotoSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoSignUpMouseClicked
        new SignUp().setVisible(true);
        
        dispose();
    }//GEN-LAST:event_gotoSignUpMouseClicked

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        String email    = txtEmail.getText();
        String password = txtPassword.getText();
        if (!email.isEmpty() && !password.isEmpty()) {
            try {
                String sql = "SELECT * FROM `authantication` WHERE `email` = ? AND `password`=?";
                ps = DBConnection.connection().prepareStatement(sql);
                ps.setString(1, email);
                ps.setString(2, password);
                rs = ps.executeQuery();
                if (rs.next()) {
                    new Home().setVisible(true);
                    dispose();
                }else{
                    MSG.error("Your account is invalid");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else {
            MSG.warning("All field can not empty");
        }
    }//GEN-LAST:event_btnSignInActionPerformed

    public static void main(String args[]) {
        new Theme("light");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignIn;
    private javax.swing.JLabel gotoSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
