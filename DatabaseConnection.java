import java.sql.*;

public class DatabaseConnection {
    public static Connection getConnection() 
    {
        try 
        {
            // this looks for the jdbc driver
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            // My database url, (its local not on a server):
            String url = "jdbc:mysql://localhost:3306/mydb";
            String user = "root";
            String password = "";

            return DriverManager.getConnection(url, user, password);
        }
         catch (Exception e) 
        { 
            System.out.println("Connection Failed: " + e.getMessage());
            return null;
        }
    }
}