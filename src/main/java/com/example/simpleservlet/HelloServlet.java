package com.example.simpleservlet;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "It's infromation about ";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");
        String age = request.getParameter("userage");
        String gender = request.getParameter("gender");
        String country = request.getParameter("country");
        String education = request.getParameter("education");
        String hardskills = request.getParameter("hardskills");
        String softskills = request.getParameter("softskills");
        String level = request.getParameter("level");
        String phone = request.getParameter("phone");
        String mail = request.getParameter("e-mail");
        String[] courses = request.getParameterValues("courses");

        out.println("<html>");
        out.println("<head><title>Second page</title>" +
                "<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"></head>");
        out.println("<body>");
        out.println("<h1>" + message + name + "</h1>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Age: " + age + "</p>");
        out.println("<p>Gender: " + gender + "</p>");
        out.println("<p>Country: " + country + "</p>");
        out.println("<p>Education: " + education + "</p>");
        out.println("<p>Hard skills: " + hardskills + "</p>");
        out.println("<p>Soft skills: " + softskills + "</p>");
        out.println("<p>Knowledge level: " + level + "</p>");
        out.println("<p>Phone number: " + phone + "</p>");
        out.println("<p>E-mail: " + mail + "</p>");
        out.println("<h4>Courses</h4>");
        for(String course: courses)
            out.println("<li>" + course + "</li>");

        out.println("</body></html>");
    }

    public void destroy() {
    }
}