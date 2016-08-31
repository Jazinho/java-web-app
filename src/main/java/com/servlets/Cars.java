package com.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Jan Pałucki.
 */

public class Cars extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<h1>" + "Our cars:" + "</h1>");
        out.println("<ul>"+"<li>Car1</li>"+"<li>Car2</li>"+"<li>Car3</li>"+"</ul>");
        out.println("<a href=http://localhost:8080/WebApp-1.0.0><-- Powrót</a>");
    }
}
