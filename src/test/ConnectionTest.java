
package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectionTest {


    public static void getConnection() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException
    {
        String url = "jdbc:mysql://127.0.0.1:3306/facturador";
        String user = "root";
        String password = "";

        // Load the Connector/J driver
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        
        // Establish connection to MySQL
        Connection conn = DriverManager.getConnection(url, user, password);
            
            
        Statement stmt = conn.createStatement();
        ResultSet rs;

        rs = stmt.executeQuery("SELECT PersonName FROM people WHERE idPerson = 1234");
        while ( rs.next() ) {
            String name = rs.getString("PersonName");
            System.out.println(name);
        }
        conn.close();

    }
    
    
}
