package model;

import java.sql.*;
import javax.swing.JOptionPane;

public class my_db_connection {
    
    private static Connection con;
    
    public static Connection getmyconnection(){
        
        try{
            String bdpath = "jdbc:mysql://localhost/bridal";
            con = DriverManager.getConnection(bdpath,"root","");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return con;
    }
}
