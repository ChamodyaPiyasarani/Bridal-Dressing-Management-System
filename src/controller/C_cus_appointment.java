package controller;

import java.sql.*;
import model.*;

public class C_cus_appointment {
    
    public void customer_apoointment(int appo_no, String cus_name, String email, int phone, String pack_name, String date) throws SQLException{
        M_cus_appointment mca = new M_cus_appointment();
        mca.customer_apoointment(appo_no,cus_name,email,phone,pack_name,date);        
    }
}
