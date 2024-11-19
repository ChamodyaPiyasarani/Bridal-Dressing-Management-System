package view;

import controller.*;
import java.sql.*;
import javax.swing.*;

public class cancelations extends javax.swing.JFrame {

    public cancelations() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_delete = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        txt_appono = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 150));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(238, 240, 229));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(92, 131, 116));
        jLabel1.setText("Appointment no : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(92, 131, 116));
        jLabel2.setText("Name : ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, 20));

        txt_delete.setBackground(new java.awt.Color(48, 77, 48));
        txt_delete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_delete.setForeground(new java.awt.Color(255, 255, 255));
        txt_delete.setText("DELETE");
        txt_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(txt_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, 30));

        btn_clear.setBackground(new java.awt.Color(48, 77, 48));
        btn_clear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear.setText("CLEAR");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, -1, 30));

        txt_appono.setBackground(new java.awt.Color(182, 196, 182));
        txt_appono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_apponoFocusLost(evt);
            }
        });
        jPanel1.add(txt_appono, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 140, -1));

        txt_name.setBackground(new java.awt.Color(182, 196, 182));
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 140, -1));

        jPanel8.setBackground(new java.awt.Color(48, 77, 48));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Cancelation");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_deleteActionPerformed
        try {
            try{
                if("".equals(txt_appono.getText())){
                    JOptionPane.showMessageDialog(new JFrame(), "Appointment Number is required", "Error",JOptionPane.ERROR_MESSAGE);
                } else if("".equals(txt_name.getText())){
                    JOptionPane.showMessageDialog(new JFrame(), "Customer Name is required", "Error", JOptionPane.ERROR_MESSAGE);
                }else {
                    int appo_no = Integer.parseInt(txt_appono.getText());
                    String cus_name = txt_name.getText();
                    

                    C_cus_delete ccd = new C_cus_delete();
                    ccd.delete_apoointment(appo_no);
                    
                }
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(new JFrame(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_txt_deleteActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        txt_name.setText("");
        txt_appono.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void txt_apponoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_apponoFocusLost
        try {
                int id = Integer.parseInt(txt_appono.getText());

                // Establish the database connection
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/bridal","root","");

                
                String sql = "SELECT cus_name,ser_name,appo_date FROM appo_2 WHERE appo_no = ?";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    statement.setInt(1, id);

                    
                    try (ResultSet resultSet = statement.executeQuery()) {
                        if (resultSet.next()) {
                            String cus_name = resultSet.getString("cus_name");
                            txt_name.setText(cus_name);
                        } else {
                            txt_name.setText("No details found for ID: " + id);
                        }
                    }
                    catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(new JFrame(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (SQLException | NumberFormatException ex) {
                ex.printStackTrace(); // Handle exceptions appropriately in your application
            }
    }//GEN-LAST:event_txt_apponoFocusLost

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cancelations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField txt_appono;
    private javax.swing.JButton txt_delete;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
