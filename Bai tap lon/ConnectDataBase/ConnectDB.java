/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectDataBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author lanh
 */
public class ConnectDB {
    public static String dirver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String url = "jdbc:sqlserver://Localhost:1433;databaseName=QuanLySV";
    public static String user = "sa";
    public static String pass = "123456";
    public static Connection con;
    public static boolean open(){
        try {
            if(con == null || con.isClosed()){
                Class.forName(dirver);
                con = DriverManager.getConnection(url, user, pass);
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex){
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
         return false;   
    }
    public static void close() {
        try {
            if(con != null){
                con.close();
            }
        } catch (SQLException e) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null , e);
            
        }
    }
    public static void close(PreparedStatement ps){
        try {
            if(ps != null){
                ps.close();
            }
        } catch (SQLException e) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, e);
            
        }
        close();
    }
    public static void close(PreparedStatement ps, ResultSet rs) {
        try {
            if(rs != null){
                rs.close();
            }
        } catch (SQLException e) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, e);
        }
        close(ps);
    }
}
