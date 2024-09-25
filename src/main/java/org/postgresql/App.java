package org.postgresql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args ) throws SQLException {

        addBarista("Vladislav Pavlyuk","3-22-22-3","vladislav.pavlyuk@gmail.com");

    }

    private static void addBarista(String fullName, String phone, String email) throws SQLException {
        String sql = "INSERT INTO staff (full_name, phone, email, position) VALUES (?, ?, 'Бариста')";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, fullName);
            pstmt.setString(2, phone);
            pstmt.setString(3, email);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
