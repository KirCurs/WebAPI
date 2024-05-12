package com.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/mysql";
        String username = "root";
        String password = "asasin5440";


        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}




