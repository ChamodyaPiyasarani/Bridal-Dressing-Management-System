package model;

import java.sql.*;
import javax.swing.JOptionPane;

public class M_cus_appointment {
    
    public void customer_apoointment(int appo_no, String cus_name, String email, int phone, String pack_name, String date) throws SQLException{
        
        Statement st = my_db_connection.getmyconnection().createStatement();
        int count = st.executeUpdate("insert into appo_2 values('"+appo_no+"','"+cus_name+"','"+email+"','"+phone+"','"+pack_name+"','"+date+"')");
        if(count > 0){
            JOptionPane.showMessageDialog(null, "Appointments Successfully added.");
        }
    }
}
