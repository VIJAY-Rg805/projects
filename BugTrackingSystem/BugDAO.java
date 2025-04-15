import java.sql.*;

public class BugDAO {
    public void insertBug(Bug bug) throws SQLException {
        Connection con = DatabaseConnection.getConnection();
        String query = "INSERT INTO bugs (title, description, severity, status, assigned_to) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, bug.title);
        ps.setString(2, bug.description);
        ps.setString(3, bug.severity);
        ps.setString(4, bug.status);
        ps.setString(5, bug.assignedTo);
        ps.executeUpdate();
        System.out.println("Bug reported successfully!");
    }
}