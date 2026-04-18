 <%@ page session="true" %>
<html>
<body>

<%
    String user = (String) session.getAttribute("user");

    if (user != null) {
%>
        <h2>Welcome back <%= user %>!</h2>
        <p>Session is still active.</p>
<%
    } else {
%>
        <h2>Session Expired!</h2>
        <p>Please enter your name again.</p>
<%
    }
%>

</body>
</html>