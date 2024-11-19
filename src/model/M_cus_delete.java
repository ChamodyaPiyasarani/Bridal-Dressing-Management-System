package model;

import java.sql.*;
import javax.swing.JOptionPane;

public class M_cus_delete {
    public void delete_appointment(int appo_no) throws SQLException {
        
        PreparedStatement st = my_db_connection.getmyconnection().prepareStatement("DELETE FROM appo_2 WHERE appo_no = ?");
        st.setInt(1, appo_no);
        int count = st.executeUpdate();
        
        if (count > 0) {
            JOptionPane.showMessageDialog(null, "Details deleted successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "No records found for deletion.");
        }
    }
}

