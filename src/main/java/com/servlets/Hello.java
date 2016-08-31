package com.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Created by Jan Pałucki.
 */

public class Hello extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<h1>" + "Hello" + "</h1>");
    }

}
