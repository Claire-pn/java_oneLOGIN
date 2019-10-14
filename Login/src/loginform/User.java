/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author banawancl_sd2081
 */
public class User {
    private static String servername="localhost";
    private static String username="root";
    private static String dbname="onedb";
    private static Integer portnumber=3306;
    private static String password="";
    
    public static Connection getConnection(){
    
    Connection user = null;
    
    MysqlDataSource datasource = new MysqlDataSource();
    
    datasource.setServerName(servername);
    datasource.setUser(username);
    datasource.setPassword(password);
    datasource.setDatabaseName(dbname);
    datasource.setPortNumber(portnumber);
    
        try { 
            user = (Connection) datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger("Get Connection -> " +User.class.getName()).log(Level.SEVERE, null, ex);
        }
    return user;
    }
}
