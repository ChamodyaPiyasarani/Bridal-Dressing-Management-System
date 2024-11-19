package controller;

import java.sql.*;
import model.*;

public class C_cus_delete {
    public void delete_apoointment(int appo_no) throws SQLException{
            
            M_cus_delete mcd = new M_cus_delete();
            mcd.delete_appointment(appo_no);
        
        }
}
