package com.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchUser {
    private final Connection connection = new com.database.Connection().connection();
    public boolean searchUser(String username, String password) throws SQLException {
        String selectUser = "SELECT username, password FROM users";
        PreparedStatement statement = connection.prepareStatement(selectUser);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            if (username.equals(resultSet.getString("username"))
                    && password.equals(resultSet.getString("password"))) {
                statement.close();
                return true;
            }
        }
        statement.close();
        return false;
    }
    public String searchUser() throws SQLException {
        String selectUser = "SELECT username, password FROM users";
        PreparedStatement statement = connection.prepareStatement(selectUser);
        ResultSet resultSet = statement.executeQuery();
        StringBuilder result = new StringBuilder();
        while (resultSet.next()){
            result.append(resultSet.getString("username")).append(" ");
            result.append(resultSet.getString("password")).append("<br>");
        }
        return result.toString();
    }
}

