package view;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Display extends javax.swing.JFrame {

    Connection con;
    
    public Display() {
        initComponents();
        try{
            String bdpath = "jdbc:mysql://localhost/bridal";
            con = DriverManager.getConnection(bdpath,"root","");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_display = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_appo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_appono = new javax.swing.JLabel();
        lbl_cusname = new javax.swing.JLabel();
        lbl_package = new javax.swing.JLabel();
        lbl_bill = new javax.swing.JLabel();
        btn_clear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(238, 240, 229));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_display.setBackground(new java.awt.Color(48, 77, 48));
        btn_display.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_display.setForeground(new java.awt.Color(255, 255, 255));
        btn_display.setText("Display");
        btn_display.setBorder(null);
        btn_display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_displayActionPerformed(evt);
            }
        });
        jPanel1.add(btn_display, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, 30));

        tbl_appo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Appointment No", "Customer name", "Package name", "Date", "Amount", "Service Charge", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_appo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_appoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_appo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 620, 120));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(92, 131, 116));
        jLabel1.setText("Appointment No:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(92, 131, 116));
        jLabel2.setText("Customer Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(92, 131, 116));
        jLabel3.setText("Packages:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(92, 131, 116));
        jLabel4.setText("Total Price:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        lbl_appono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_appono.setForeground(new java.awt.Color(92, 131, 116));
        jPanel1.add(lbl_appono, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        lbl_cusname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_cusname.setForeground(new java.awt.Color(92, 131, 116));
        jPanel1.add(lbl_cusname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        lbl_package.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_package.setForeground(new java.awt.Color(92, 131, 116));
        jPanel1.add(lbl_package, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        lbl_bill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_bill.setForeground(new java.awt.Color(92, 131, 116));
        jPanel1.add(lbl_bill, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));

        btn_clear.setBackground(new java.awt.Color(48, 77, 48));
        btn_clear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear.setText("clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(92, 131, 116));
        jLabel5.setText("Date:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 50, -1));

        lbl_date.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_date.setForeground(new java.awt.Color(92, 131, 116));
        jPanel1.add(lbl_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 220, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_displayActionPerformed
        String sql = "SELECT appo_no, cus_name, package_name, appo_date, amount, ser_charge, tot_amount FROM appo_2 INNER JOIN payment_1 ON appo_2.ser_name = payment_1.package_name";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)tbl_appo.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getInt(7)});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_btn_displayActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        lbl_appono.setText("");
        lbl_cusname.setText("");
        lbl_package.setText("");
        lbl_bill.setText("");
        lbl_date.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void tbl_appoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_appoMouseClicked
        int i = tbl_appo.getSelectedRow();
        TableModel model = tbl_appo.getModel();
        lbl_appono.setText(model.getValueAt(i,0).toString());
        lbl_cusname.setText(model.getValueAt(i,1).toString());
        lbl_package.setText(model.getValueAt(i,2).toString());
        lbl_date.setText(model.getValueAt(i,3).toString());
        lbl_bill.setText(model.getValueAt(i,6).toString());
    }//GEN-LAST:event_tbl_appoMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Display().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_appono;
    private javax.swing.JLabel lbl_bill;
    private javax.swing.JLabel lbl_cusname;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_package;
    private javax.swing.JTable tbl_appo;
    // End of variables declaration//GEN-END:variables
}
