package mmmd.teammmmd_eksamensprojekt2sem.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserRepository {

    private final Connection dbConnection;

    @Autowired
    public UserRepository(ConnectionManager connectionManager) throws SQLException {
        this.dbConnection = connectionManager.getConnection();
    }

    public void testConnection() {
        String SQL = "SELECT fullName FROM employee INNER JOIN employeerole ON employee.role = employeerole.roleID WHERE employeerole.roleTitle = ?";

        try (PreparedStatement ps = dbConnection.prepareStatement(SQL)) {
            ps.setString(1, "Project Manager");
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    String fullName = rs.getString("fullName");
                    System.out.println(fullName);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
