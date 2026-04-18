 <%@ page session="true" %>
<html>
<body>

<%
    String name = request.getParameter("username");

    // Create session and store name
    session.setAttribute("user", name);

    // Set session expiry time (60 seconds)
    session.setMaxInactiveInterval(60);
%>

<h2>Hello <%= name %>!</h2>

<a href="check.jsp">Click here to check session</a>

<br><br>
<p><b>Note:</b> Session expires in 60 seconds.</p>

</body>
</html>