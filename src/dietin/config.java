/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dietin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SMK TELKOM
 */
public class config {
    private static Connection mysqlconfig;
    public static Connection configDB() throws SQLException{
        try{
            String url="jdbc:mysql://localhost:3306/diet";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=(Connection) DriverManager.getConnection(url, user, pass);
        }catch(SQLException e){
            System.err.println("koneksi gagal"+e.getMessage());
    }
        return mysqlconfig();

    }

    private static Connection mysqlconfig() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
