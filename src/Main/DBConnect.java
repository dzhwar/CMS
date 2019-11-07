/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dd
 */
public class DBConnect {
        
    
    public Connection connect(){
        Connection conn=null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/clinic","root","");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return conn;
    }
    
    
}
