/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dd
 */
public class loginpro {
    
    public String user,password,priv;
    DBConnect connector = new DBConnect();
    Connection conn = connector.connect();
    boolean chk = false;
    
    public loginpro(){
        
    }
    
    public loginpro(String u, String p){
        user = u;
        password = p;
        
    }
    
    public boolean check(){
        
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM users WHERE username = '" + user + "' AND password = '" + password +"'");
            
            if (rs.next())
                chk = true;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
         
        return chk;
        
    }
    
    public String privilege(){
     
            try {
                Statement stm = conn.createStatement();
                ResultSet rs = stm.executeQuery("SELECT * FROM users WHERE username = '" + user + "'");
                rs.next();
                priv = rs.getString("privilege");
            } catch (SQLException ex) {
                Logger.getLogger(loginpro.class.getName()).log(Level.SEVERE, null, ex);
            }
            return priv;
        
            
    }
    
}
    
    
       
          

