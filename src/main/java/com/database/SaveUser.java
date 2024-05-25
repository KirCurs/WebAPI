package com.database;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaveUser {
    public SaveUser(String username, String password) throws SQLException {
        java.sql.Connection connection = new Connection().connection();
        saveUsers(username, password, connection);
    }
    private void saveUsers(String username, String password, java.sql.Connection connection) throws SQLException {
        String insertUser = "INSERT INTO users (username, password) VALUES (?, ?)";
        PreparedStatement insertStatement = connection.prepareStatement(insertUser);
        insertStatement.setString(1, username);
        insertStatement.setString(2, password);
        insertStatement.executeUpdate();
        insertStatement.close();
    }
}