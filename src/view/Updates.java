package view;

import controller.*;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.lang.NumberFormatException;

public class Updates extends javax.swing.JFrame {

    public Updates() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_appono = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        cmb_packages = new javax.swing.JComboBox<>();
        txt_date = new javax.swing.JTextField();
        btn_update = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 150));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(238, 240, 229));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(92, 131, 116));
        jLabel1.setText("Appointment no : ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(92, 131, 116));
        jLabel2.setText("Name : ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(92, 131, 116));
        jLabel3.setText("Package : ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(92, 131, 116));
        jLabel4.setText("Appointment Date : ");

        txt_appono.setBackground(new java.awt.Color(182, 196, 182));
        txt_appono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_apponoFocusLost(evt);
            }
        });
        txt_appono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apponoActionPerformed(evt);
            }
        });

        txt_name.setBackground(new java.awt.Color(182, 196, 182));

        cmb_packages.setBackground(new java.awt.Color(182, 196, 182));
        cmb_packages.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select your package>", "Classic Elegance", "Glamour Diva", "Natural Radiance", "Destination Dream", "Royal Princess", "Complete Bridal Experience" }));

        txt_date.setBackground(new java.awt.Color(182, 196, 182));

        btn_update.setBackground(new java.awt.Color(48, 77, 48));
        btn_update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_clear.setBackground(new java.awt.Color(48, 77, 48));
        btn_clear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear.setText("CLEAR");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(48, 77, 48));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Updates");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_appono)
                            .addComponent(txt_name)
                            .addComponent(cmb_packages, 0, 162, Short.MAX_VALUE)
                            .addComponent(txt_date)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_update)
                        .addGap(65, 65, 65)
                        .addComponent(btn_clear)
                        .addGap(12, 12, 12)))
                .addGap(56, 56, 56))
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txt_appono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmb_packages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_update)
                    .addComponent(btn_clear))
                .addGap(79, 79, 79))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        try {
            try{
                if("".equals(txt_appono.getText())){
                    JOptionPane.showMessageDialog(new JFrame(), "Appointment Number is required", "Error",JOptionPane.ERROR_MESSAGE);
                } else if("".equals(txt_name.getText())){
                    JOptionPane.showMessageDialog(new JFrame(), "Customer Name is required", "Error", JOptionPane.ERROR_MESSAGE);
                }else if("".equals(txt_date.getText())){
                    JOptionPane.showMessageDialog(new JFrame(), "Date is required", "Error", JOptionPane.ERROR_MESSAGE);
                } else if("".equals(cmb_packages.getSelectedItem())) {
                    JOptionPane.showMessageDialog(new JFrame(), "Package is required", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    int appo_no = Integer.parseInt(txt_appono.getText());
                    String cus_name = txt_name.getText();
                    String pack_name = (String) cmb_packages.getSelectedItem();
                    String date = txt_date.getText();

                    C_update_customer cup = new C_update_customer();
                    cup.update_apoointment(appo_no,cus_name,pack_name,date);
                    
                }
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(new JFrame(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        txt_name.setText("");
        txt_appono.setText("");
        cmb_packages.setSelectedIndex(-1);
        txt_date.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void txt_apponoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apponoActionPerformed
        
    }//GEN-LAST:event_txt_apponoActionPerformed

    private void txt_apponoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_apponoFocusLost
            try {
                int id = Integer.parseInt(txt_appono.getText());

                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/bridal","root","");

                String sql = "SELECT cus_name,ser_name,appo_date FROM appo_2 WHERE appo_no = ?";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    statement.setInt(1, id);

                    try (ResultSet resultSet = statement.executeQuery()) {
                        if (resultSet.next()) {
                            String cus_name = resultSet.getString("cus_name");
                            txt_name.setText(cus_name);

                            String ser_name = resultSet.getString("ser_name");
                            cmb_packages.setSelectedItem(ser_name);

                            String appo_date = resultSet.getString("appo_date");
                            txt_date.setText(appo_date);

                        } else {
                            txt_name.setText("No details found for ID: " + id);
                            cmb_packages.setSelectedItem(null); 
                            txt_date.setText("");
                        }
                    }
                    catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(new JFrame(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (SQLException | NumberFormatException ex) {
                ex.printStackTrace();
            }
            
    }//GEN-LAST:event_txt_apponoFocusLost

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Updates().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cmb_packages;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txt_appono;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
