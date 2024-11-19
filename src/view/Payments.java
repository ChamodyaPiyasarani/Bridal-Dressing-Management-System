package view;

import controller.*;
import java.sql.*;
import javax.swing.*;
import java.lang.NumberFormatException;


public class Payments extends javax.swing.JFrame {

    public Payments() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_appono = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        btn_pay = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_amount = new javax.swing.JTextField();
        txt_serCharge = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmb_paymethod = new javax.swing.JComboBox<>();
        cmb_packages = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_totPayment = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 150));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(238, 240, 229));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(92, 131, 116));
        jLabel1.setText("Appointment no : ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(92, 131, 116));
        jLabel2.setText("Name :");

        txt_appono.setBackground(new java.awt.Color(182, 196, 182));
        txt_appono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_apponoFocusLost(evt);
            }
        });

        txt_name.setBackground(new java.awt.Color(182, 196, 182));
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });

        btn_pay.setBackground(new java.awt.Color(48, 77, 48));
        btn_pay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_pay.setForeground(new java.awt.Color(255, 255, 255));
        btn_pay.setText("PAY");
        btn_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payActionPerformed(evt);
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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(92, 131, 116));
        jLabel6.setText("Amount : ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(92, 131, 116));
        jLabel4.setText("Service charge :");

        txt_amount.setBackground(new java.awt.Color(182, 196, 182));

        txt_serCharge.setBackground(new java.awt.Color(182, 196, 182));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(92, 131, 116));
        jLabel3.setText("Package :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(92, 131, 116));
        jLabel5.setText("Payment method : ");

        cmb_paymethod.setBackground(new java.awt.Color(182, 196, 182));
        cmb_paymethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select payment method>", "Card", "Cash" }));

        cmb_packages.setBackground(new java.awt.Color(182, 196, 182));
        cmb_packages.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select your package>", "Classic Elegance", "Glamour Diva", "Natural Radiance", "Destination Dream", "Royal Princess", "Complete Bridal Experience", " " }));

        jPanel2.setBackground(new java.awt.Color(48, 77, 48));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Payments");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(92, 131, 116));
        jLabel8.setText("Total payment :");

        txt_totPayment.setBackground(new java.awt.Color(182, 196, 182));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(251, 252, Short.MAX_VALUE)
                .addComponent(btn_pay)
                .addContainerGap(185, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(35, 35, 35)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_appono)
                                        .addComponent(cmb_packages, 0, 170, Short.MAX_VALUE)
                                        .addComponent(txt_name)))
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(cmb_paymethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_amount)
                                .addComponent(txt_serCharge, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))))
                    .addComponent(btn_clear, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_totPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(213, 213, 213))))
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_appono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmb_packages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_serCharge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmb_paymethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_totPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_pay)
                    .addComponent(btn_clear))
                .addGap(42, 42, 42))
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

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void btn_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payActionPerformed
        try {
                if("".equals(txt_appono.getText())){
                    JOptionPane.showMessageDialog(new JFrame(), "Appointment Number is required", "Error",JOptionPane.ERROR_MESSAGE);
                } else if("".equals(txt_name.getText())){
                    JOptionPane.showMessageDialog(new JFrame(), "Customer Name is required", "Error", JOptionPane.ERROR_MESSAGE);
                } else if("".equals(txt_amount.getText())){
                    JOptionPane.showMessageDialog(new JFrame(), "Phone Number is required", "Error", JOptionPane.ERROR_MESSAGE);
                } else if("".equals(txt_serCharge.getText())){
                    JOptionPane.showMessageDialog(new JFrame(), "Date is required", "Error", JOptionPane.ERROR_MESSAGE);
                } else if("".equals(cmb_packages.getSelectedItem())) {
                    JOptionPane.showMessageDialog(new JFrame(), "Package is required", "Error", JOptionPane.ERROR_MESSAGE);
                }else if("".equals(cmb_paymethod.getSelectedItem())) {
                    JOptionPane.showMessageDialog(new JFrame(), "Payment method is required", "Error", JOptionPane.ERROR_MESSAGE);
                }else if("".equals(txt_totPayment.getText())) {
                    JOptionPane.showMessageDialog(new JFrame(), "Total Payment is required", "Error", JOptionPane.ERROR_MESSAGE);
                }else {
                    int appo_no = Integer.parseInt(txt_appono.getText());
                    String cus_name = txt_name.getText();
                    int amount = Integer.parseInt(txt_amount.getText());
                    String pack_name = (String) cmb_packages.getSelectedItem();
                    String ser_charge = txt_serCharge.getText();
                    String payMethod = (String) cmb_paymethod.getSelectedItem();

                    C_payments cp = new C_payments();
                    cp.payments(appo_no,cus_name,pack_name,amount,ser_charge,payMethod); 
                }
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } 
            catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
            
    }//GEN-LAST:event_btn_payActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        txt_name.setText("");
        txt_appono.setText("");
        txt_amount.setText("");
        txt_serCharge.setText("");
        cmb_packages.setSelectedIndex(-1);
        txt_totPayment.setText("");
        cmb_paymethod.setSelectedIndex(-1);
    }//GEN-LAST:event_btn_clearActionPerformed

    private void txt_apponoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_apponoFocusLost
        
          try {
                    int id = Integer.parseInt(txt_appono.getText());

                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/bridal", "root", "");

                    String sql = "SELECT appo_2.cus_name, appo_2.ser_name, payment_1.amount, payment_1.ser_charge, payment_1.pay_method, payment_1.tot_amount FROM appo_2 INNER JOIN payment_1 ON appo_2.ser_name = payment_1.package_name WHERE appo_2.appo_no = ?";

                    try (PreparedStatement statement = connection.prepareStatement(sql)) {
                        statement.setInt(1, id);

                        try (ResultSet resultSet = statement.executeQuery()) {
                            if (resultSet.next()) {
                                String cus_name = resultSet.getString("cus_name");
                                txt_name.setText(cus_name);

                                String ser_name = resultSet.getString("ser_name");
                                cmb_packages.setSelectedItem(ser_name);

                                int amount = resultSet.getInt("amount");
                                txt_amount.setText(String.valueOf(amount));

                                int ser_charge = resultSet.getInt("ser_charge");
                                txt_serCharge.setText(String.valueOf(ser_charge));

                                String pay_method = resultSet.getString("pay_method");
                                cmb_paymethod.setSelectedItem(pay_method);

                                int tot_amount = resultSet.getInt("tot_amount");
                                txt_totPayment.setText(String.valueOf(tot_amount));

                            } else {
                                txt_name.setText("No details found for ID: " + id);
                                cmb_packages.setSelectedItem(null);
                                txt_amount.setText("");
                                cmb_paymethod.setSelectedItem(null);
                                txt_serCharge.setText("");
                                txt_totPayment.setText("");
                            }
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(new JFrame(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (SQLException | NumberFormatException ex) {
                    ex.printStackTrace();
                }
    }//GEN-LAST:event_txt_apponoFocusLost

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_pay;
    private javax.swing.JComboBox<String> cmb_packages;
    private javax.swing.JComboBox<String> cmb_paymethod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_amount;
    private javax.swing.JTextField txt_appono;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_serCharge;
    private javax.swing.JTextField txt_totPayment;
    // End of variables declaration//GEN-END:variables
}
