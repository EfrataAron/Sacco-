import java.sql.*;


public class JDBC {

    private static JDBC instance = null;
    private Connection connection;

    private JDBC() {
        // Private constructor to prevent direct instantiation.
    }

    public void connect() {
        // check connection
        String url = "jdbc:mysql://localhost:3306/Sacco";
        String username = "root";
        String password = "Password1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
           //e.printStackTrace();
           System.out.println(e.getMessage());
        }
    }

    public static JDBC getInstance() {
        if (instance == null) {
            synchronized (JDBC.class) {
                if (instance == null) {
                    instance = new JDBC();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        if (connection == null) {
             //    
            
        }
        return connection;
    }
}
