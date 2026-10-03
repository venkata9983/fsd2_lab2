package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username != null && !username.isEmpty()
                && password != null && !password.isEmpty()) {

            response.sendRedirect("/details.html");

        } else {

            response.setContentType("text/html");

            response.getWriter().println(
                    "<h2>Invalid Login</h2>"
            );
        }
    }
}
