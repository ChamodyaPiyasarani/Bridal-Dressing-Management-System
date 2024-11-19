package view;

import java.lang.Exception;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Photo_lbl = new javax.swing.JLabel();
        login_pnl = new javax.swing.JPanel();
        lbl_LOGIN = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        lbl_pass = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_clear = new javax.swing.JButton();
        lbl_name1 = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        txt_pass = new javax.swing.JPasswordField();
        txt_conpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Photo_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/green_sign.jpg"))); // NOI18N

        login_pnl.setBackground(new java.awt.Color(24, 61, 61));

        lbl_LOGIN.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_LOGIN.setForeground(new java.awt.Color(247, 233, 135));
        lbl_LOGIN.setText("SignUp");

        lbl_name.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(247, 233, 135));
        lbl_name.setText("Email");

        lbl_pass.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lbl_pass.setForeground(new java.awt.Color(247, 233, 135));
        lbl_pass.setText("Confirm Password");

        txt_name.setBackground(new java.awt.Color(255, 245, 228));

        btn_login.setBackground(new java.awt.Color(24, 61, 61));
        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_login.setForeground(new java.awt.Color(247, 233, 135));
        btn_login.setText("Login");
        btn_login.setBorder(null);
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(247, 233, 135));
        jLabel2.setText("Existing account? Return to login for access.");

        btn_clear.setBackground(new java.awt.Color(255, 245, 228));
        btn_clear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(24, 61, 61));
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        lbl_name1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lbl_name1.setForeground(new java.awt.Color(247, 233, 135));
        lbl_name1.setText("Password");

        btn_save.setBackground(new java.awt.Color(255, 245, 228));
        btn_save.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_save.setForeground(new java.awt.Color(24, 61, 61));
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        txt_pass.setBackground(new java.awt.Color(255, 245, 228));

        txt_conpass.setBackground(new java.awt.Color(255, 245, 228));

        javax.swing.GroupLayout login_pnlLayout = new javax.swing.GroupLayout(login_pnl);
        login_pnl.setLayout(login_pnlLayout);
        login_pnlLayout.setHorizontalGroup(
            login_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_pnlLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(login_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_pnlLayout.createSequentialGroup()
                        .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_pnlLayout.createSequentialGroup()
                        .addGroup(login_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_name, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_name, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_name1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_pass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(login_pnlLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btn_save)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_clear))
                            .addComponent(txt_pass)
                            .addComponent(txt_conpass))
                        .addGap(29, 29, 29))))
            .addGroup(login_pnlLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(lbl_LOGIN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        login_pnlLayout.setVerticalGroup(
            login_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_pnlLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lbl_LOGIN)
                .addGap(18, 18, 18)
                .addComponent(lbl_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(lbl_name1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lbl_pass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_conpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(login_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_clear)
                    .addComponent(btn_save))
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Photo_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(login_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Photo_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 558, Short.MAX_VALUE)
            .addComponent(login_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        Login login = new Login();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null); 
        this.dispose();
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        String name = null, pass = null, conf_pass = null, query;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:mysql://localhost/bridal";
        SUser = "root";
        SPass = "";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            
            if("".equals(txt_name.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Full Name is require", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if("".equals(txt_pass.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Password is require", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if("".equals(txt_conpass.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Confirm Password is require", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(!txt_conpass.getText().equals(txt_pass.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Password Missmatch", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else {
            name = txt_name.getText(); 
            pass = txt_pass.getText();
            
            query = "INSERT INTO login(name, pass)"+"VALUES('"+name+"', '"+pass+"')";
            
            st.execute(query);
            txt_name.setText("");
            txt_pass.setText("");
            txt_conpass.setText("");
            showMessageDialog(null, "New account has been created successfully!");
            
            }
        }
        catch(Exception e){
           System.out.println("Error! " + e.getMessage()); 
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        txt_name.setText("");
        txt_conpass.setText("");
        txt_pass.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Photo_lbl;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_LOGIN;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_name1;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JPanel login_pnl;
    private javax.swing.JPasswordField txt_conpass;
    private javax.swing.JTextField txt_name;
    private javax.swing.JPasswordField txt_pass;
    // End of variables declaration//GEN-END:variables
}
