import java.sql.*;

public class DatabaseConnection {
    static Connection con;

    public static Connection getConnection() throws SQLException {
        if (con == null) {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bugtracker", "root", "password");
        }
        return con;
    }
}