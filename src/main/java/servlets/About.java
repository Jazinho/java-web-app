package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Jan Pałucki.
 */

public class About extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<h1>" + "Wypożyczalnia samochodów Pałucki - Kraków" + "</h1>");
        out.println("<h3>" + "O nas" + "</h3>");
        out.println("<h3>" + "Lokalizacja" + "</h3>");
        out.println("<h3>" + "Historia" + "</h3>");
        out.println("<a href=http://localhost:8080/WebApp-1.0.0><-- Powrót</a>");
    }
}
