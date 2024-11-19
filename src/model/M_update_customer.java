package model;

import java.sql.*;
import javax.swing.JOptionPane;

public class M_update_customer {
    public void update_apoointment(int appo_no, String cus_name, String pack_name, String date) throws SQLException{
        
        PreparedStatement st = my_db_connection.getmyconnection().prepareStatement("UPDATE appo_2 SET cus_name = ?, ser_name = ?, appo_date = ? WHERE appo_no = ?;");
        st.setString(1,cus_name);
        st.setString(2,pack_name);
        st.setString(3,date);
        st.setInt(4,appo_no);
        int count = st.executeUpdate();
        
        if(count > 0){
            JOptionPane.showMessageDialog(null, "Details updated Successfully added.");
        }
    }
}
