package com.eventmanagement.servlets;

import com.eventmanagement.model.User;
import com.eventmanagement.service.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/user")
public class UserServlet extends HttpServlet {

    private UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> users = userService.getAllUsers();
        request.setAttribute("users", users);
        request.getRequestDispatcher("users.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = new User(name, email, password);
        userService.registerUser(user);

        response.sendRedirect("user");
    }
}
