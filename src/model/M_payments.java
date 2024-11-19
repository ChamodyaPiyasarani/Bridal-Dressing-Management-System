package model;

import java.sql.*;
import javax.swing.JOptionPane;


public class M_payments {
    public void payments(int appo_no, String cus_name,String pack_name,int amount,String ser_charge, String payMethod) throws SQLException {
        Connection connection = my_db_connection.getmyconnection();
        String query = "SELECT appo_no, cus_name, package_name, amount, ser_charge,pay_method,tot_amount FROM appo_2 INNER JOIN payment_1 ON appo_2.ser_name = payment_1.package_name";

        try (Statement st = connection.createStatement();
             ResultSet resultSet = st.executeQuery(query)) {

            while (resultSet.next()) {
                
            }

            JOptionPane.showMessageDialog(null, "Payment Successful.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
}
