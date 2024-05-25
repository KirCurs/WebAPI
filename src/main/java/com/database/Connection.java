package com.database;


import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    private final static String url = "jdbc:mysql://127.0.0.1:3306/webapi";
    private final static String username = "root";
    private final static String password = "root";

    public java.sql.Connection connection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}




