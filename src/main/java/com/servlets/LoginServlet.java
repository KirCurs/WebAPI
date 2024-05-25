package com.servlets;

import com.database.SearchUser;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            boolean resp = new SearchUser().searchUser(username,password);
            if (resp) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/success.jsp");
                dispatcher.forward(request, response);
            }
            else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/fail.jsp");
                dispatcher.forward(request, response);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}

