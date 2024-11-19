package view;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author chamodya piyasarani
 */
public class Login extends javax.swing.JFrame {

    public Login() {
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
        btn_signup = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        txt_pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 196, 196));

        Photo_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/green_login.jpg"))); // NOI18N

        login_pnl.setBackground(new java.awt.Color(238, 240, 229));

        lbl_LOGIN.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_LOGIN.setForeground(new java.awt.Color(133, 14, 53));
        lbl_LOGIN.setText("LOGIN");

        lbl_name.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(133, 14, 53));
        lbl_name.setText("Email");

        lbl_pass.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lbl_pass.setForeground(new java.awt.Color(133, 14, 53));
        lbl_pass.setText("Password");

        txt_name.setBackground(new java.awt.Color(255, 245, 228));

        btn_signup.setBackground(new java.awt.Color(238, 240, 229));
        btn_signup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_signup.setForeground(new java.awt.Color(133, 14, 53));
        btn_signup.setText("SignUp");
        btn_signup.setBorder(null);
        btn_signup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(133, 14, 53));
        jLabel2.setText("Elevate your beauty journey: Sign up with us!");

        btn_login.setBackground(new java.awt.Color(255, 245, 228));
        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_login.setForeground(new java.awt.Color(133, 14, 53));
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        btn_clear.setBackground(new java.awt.Color(255, 245, 228));
        btn_clear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(133, 14, 53));
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        txt_pass.setBackground(new java.awt.Color(255, 245, 228));

        javax.swing.GroupLayout login_pnlLayout = new javax.swing.GroupLayout(login_pnl);
        login_pnl.setLayout(login_pnlLayout);
        login_pnlLayout.setHorizontalGroup(
            login_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_pnlLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(lbl_LOGIN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_pnlLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(login_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_pnlLayout.createSequentialGroup()
                        .addComponent(btn_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_pnlLayout.createSequentialGroup()
                        .addGroup(login_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(login_pnlLayout.createSequentialGroup()
                                .addComponent(btn_login)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_clear))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_name, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_name, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_pass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pass))
                        .addGap(29, 29, 29))))
        );
        login_pnlLayout.setVerticalGroup(
            login_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_pnlLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lbl_LOGIN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(lbl_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lbl_pass)
                .addGap(31, 31, 31)
                .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(login_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_login)
                    .addComponent(btn_clear))
                .addGap(93, 93, 93))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Photo_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(login_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Photo_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
            txt_name.setText("");
            txt_pass.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
            SignUp secondForm = new SignUp();
            secondForm.setVisible(true);

            
            setVisible(false);
    }//GEN-LAST:event_btn_signupActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        String name, pass, query, lname= null, lpass = null;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:mysql://localhost/bridal";
        SUser = "root";
        SPass = "";
        int notFound = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            if("".equals(txt_name.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Email Address is require", "Error", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(txt_pass.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Password is require", "Error", JOptionPane.ERROR_MESSAGE);
            }else {
            name = txt_name.getText();
            pass = txt_pass.getText();
            
            query = "SELECT * FROM login WHERE name= '"+name+"';";
       
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                lname = rs.getString("name");
                lpass = rs.getString("pass");
                notFound = 1;
            }
            if(notFound == 1 && pass.equals(lpass)){
                Home home = new Home();
//              home.setUser(lname);
                home.setVisible(true);
                home.pack();
                home.setLocationRelativeTo(null); 
                this.dispose();
            }else{
               JOptionPane.showMessageDialog(new JFrame(), "Incorrect name or password", "Error", JOptionPane.ERROR_MESSAGE);
            }
            txt_pass.setText("");
            
            }
        }catch(Exception e){
           System.out.println("Error!" + e.getMessage()); 
        }
    }//GEN-LAST:event_btn_loginActionPerformed

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
    private javax.swing.JLabel Photo_lbl;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_signup;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_LOGIN;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JPanel login_pnl;
    private javax.swing.JTextField txt_name;
    private javax.swing.JPasswordField txt_pass;
    // End of variables declaration//GEN-END:variables
}
