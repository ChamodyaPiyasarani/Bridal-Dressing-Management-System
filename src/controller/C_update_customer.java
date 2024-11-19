package controller;

import java.sql.SQLException;
import model.*;

public class C_update_customer {
    public void update_apoointment(int appo_no, String cus_name, String pack_name, String date) throws SQLException{
            
            M_update_customer muc = new M_update_customer();
            muc.update_apoointment(appo_no,cus_name,pack_name,date);
        
        }
}
