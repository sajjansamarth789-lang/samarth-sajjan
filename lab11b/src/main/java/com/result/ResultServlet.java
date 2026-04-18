  package com.result;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ResultServlet")
public class ResultServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String rollno = request.getParameter("rollno");
        String name = request.getParameter("name");

        int sub1 = Integer.parseInt(request.getParameter("sub1"));
        int sub2 = Integer.parseInt(request.getParameter("sub2"));
        int sub3 = Integer.parseInt(request.getParameter("sub3"));
        int sub4 = Integer.parseInt(request.getParameter("sub4"));
        int sub5 = Integer.parseInt(request.getParameter("sub5"));

        String message;

        // Server-side validation
        if (rollno == null || name == null ||
            rollno.trim().isEmpty() || name.trim().isEmpty()) {

            message = "Error: Roll No and Name required";
        } else {

            int total = sub1 + sub2 + sub3 + sub4 + sub5;
            double avg = total / 5.0;

            // Pass condition: all subjects > 40
            boolean pass = (sub1 > 40 && sub2 > 40 && sub3 > 40 &&
                            sub4 > 40 && sub5 > 40);

            request.setAttribute("rollno", rollno);
            request.setAttribute("name", name);
            request.setAttribute("sub1", sub1);
            request.setAttribute("sub2", sub2);
            request.setAttribute("sub3", sub3);
            request.setAttribute("sub4", sub4);
            request.setAttribute("sub5", sub5);
            request.setAttribute("avg", avg);

            request.setAttribute("result", pass ? "PASS" : "FAIL");

            message = "Result Generated Successfully";
        }

        request.setAttribute("message", message);

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}
