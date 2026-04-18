package com.cookie;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/cookie")
public class CookieServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        Cookie nameCookie = null;
        Cookie visitCookie = null;

        Cookie[] cookies = request.getCookies();
        int visitCount = 0;

        // Retrieve existing cookies
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("username")) {
                    nameCookie = c;
                }
                if (c.getName().equals("visitCount")) {
                    visitCookie = c;
                }
            }
        }

        // First visit
        if (nameCookie == null) {
            nameCookie = new Cookie("username", name);   // set value
            visitCookie = new Cookie("visitCount", "1"); // set value
            visitCount = 1;
        } else {
            visitCount = Integer.parseInt(visitCookie.getValue());
            visitCount++;
            visitCookie.setValue(String.valueOf(visitCount)); // update value
        }

        // Set expiry (30 seconds for demo)
        nameCookie.setMaxAge(30);
        visitCookie.setMaxAge(30);

        response.addCookie(nameCookie);
        response.addCookie(visitCookie);

        // OUTPUT
        out.println("<html><body>");
        out.println("<h2>Welcome back " + nameCookie.getValue() + "!</h2>");
        out.println("<h3>You have visited this page " + visitCount + " times.</h3>");

        // Display all cookies with values
        out.println("<h3>List of Cookies with Values:</h3>");
        if (cookies != null) {
            for (Cookie c : cookies) {
                out.println("Cookie Name: " + c.getName() +
                            " | Value: " + c.getValue() + "<br>");
            }
        }

        out.println("<br><b>Note:</b> Cookies expire in 30 seconds. Wait and refresh to see reset.");

        out.println("</body></html>");
    }
}