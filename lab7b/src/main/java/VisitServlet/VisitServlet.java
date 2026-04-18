package VisitServlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VisitServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        int visitCount = 0;
        boolean found = false;

        Cookie cookies[] = request.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("user")) {
                    name = c.getValue();
                    found = true;
                }
                if (c.getName().equals("count")) {
                    visitCount = Integer.parseInt(c.getValue());
                }
            }
        }

        visitCount++;

        // Create / Update Cookies
        Cookie userCookie = new Cookie("user", name);
        Cookie countCookie = new Cookie("count", String.valueOf(visitCount));

        // Set expiry (e.g., 30 seconds for demo)
        userCookie.setMaxAge(30);
        countCookie.setMaxAge(30);

        response.addCookie(userCookie);
        response.addCookie(countCookie);

        out.println("<html><body>");

        if (found) {
            out.println("<h2>Welcome back " + name + "!</h2>");
            out.println("<p>You have visited this page " + visitCount + " times.</p>");
        } else {
            out.println("<h2>Welcome " + name + "!</h2>");
            out.println("<p>This is your first visit.</p>");
        }

        out.println("<p><b>Note:</b> Cookie will expire in 30 seconds.</p>");

        out.println("<br><a href='index.html'>Visit Again</a>");

        out.println("</body></html>");
    }
}