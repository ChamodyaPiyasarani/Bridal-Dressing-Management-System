package controller;

import java.sql.*;
import model.*;

public class C_payments {
    public void payments(int appo_no, String cus_name,String pack_name,int amount,String ser_charge, String payMethod) throws SQLException{
        M_payments mp = new M_payments();
        mp.payments(appo_no,cus_name,pack_name,amount,ser_charge,payMethod);      
    }
}
