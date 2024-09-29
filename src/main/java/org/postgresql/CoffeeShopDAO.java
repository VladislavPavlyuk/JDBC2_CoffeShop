package org.postgresql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CoffeeShopDAO {
    public void addDrink(String nameEn, String nameOther, double price) throws SQLException {
        String sql = "INSERT INTO drinks (name_en, name_other, price) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, nameEn);
                pstmt.setString(2, nameOther);
                pstmt.setDouble(3, price);
                pstmt.executeUpdate();
        }
    }
    public void addBarista(String fullName, String phone, String email) throws SQLException {
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

