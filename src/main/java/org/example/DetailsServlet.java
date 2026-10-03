package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/details")
public class DetailsServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String course = request.getParameter("course");
        String address = request.getParameter("address");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Student Details</title>");
        out.println("</head>");

        out.println("<body style='text-align:center; margin-top:50px;'>");

        out.println("<h1>Student Details</h1>");

        out.println("<p><b>Name:</b> " + name + "</p>");
        out.println("<p><b>Age:</b> " + age + "</p>");
        out.println("<p><b>Email:</b> " + email + "</p>");
        out.println("<p><b>Phone:</b> " + phone + "</p>");
        out.println("<p><b>Course:</b> " + course + "</p>");
        out.println("<p><b>Address:</b> " + address + "</p>");

        out.println("</body>");
        out.println("</html>");
    }
}
