/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tdang
 */
public class JdbcConnection {
    Connection conn;
    int i=1;
    String m="Git trial";
    
    public Connection Connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","Reset@123");
} catch (ClassNotFoundException ex) {
    Logger.getLogger(JdbcConnection.class.getName()).log(Level.SEVERE, "JDBC Driver not found", ex);
} catch (SQLException ex) {
    Logger.getLogger(JdbcConnection.class.getName()).log(Level.SEVERE, "Database connection failed", ex);
}
        return conn;
    }
}

