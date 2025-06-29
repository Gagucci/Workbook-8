package com.pluralsight;
import java.sql.*;

public class Main {

    public static void main(String[] args) {

        String url = "jdbc:sqlserver://skills4it.database.windows.net:1433;" +
                "database=Courses;" +
                "user=gtareader@skills4it;" +
                "password=StrongPass!2025;" +
                "encrypt=true;" +
                "trustServerCertificate=false;" +
                "loginTimeout=30;";

        String myQuery = "SELECT * FROM GTA.Citizens WHERE Name LIKE '%Ja%'";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(myQuery)) {

            while (rs.next()) {
                System.out.println("Name: " + rs.getString("name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}