package Database;

import java.sql.*;

public class DBConnection {
    static public Connection connection(){
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_db", "root", "");
            if (con == null) {
                System.out.println("Connection not success"); 
            } else {
                System.out.println("Connection success");
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return con;
    }
}
