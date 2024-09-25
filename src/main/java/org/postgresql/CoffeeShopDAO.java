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

    // Добавьте другие методы для выполнения запросов из задания
}

