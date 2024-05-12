package com.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/auth")
public class AuthServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");


        RequestDispatcher dispatcher;
        if (isValid(username, password)) {

            dispatcher = request.getRequestDispatcher("/success.jsp");
        } else {

            dispatcher = request.getRequestDispatcher("/error.jsp");
        }
        dispatcher.forward(request, response);
    }

    private boolean isValid(String username, String password) {

        return true;


    }
}