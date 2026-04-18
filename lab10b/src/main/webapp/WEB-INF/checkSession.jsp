 <%@ page session="true" %>
<html>
<head>
    <title>Check Session</title>
</head>
<body>

<%
    String name = (String) session.getAttribute("user");

    if (name != null) {
%>
        <h2>Hello <%= name %>!</h2>
        <p>Session is still active.</p>
<%
    } else {
%>
        <h2>Session Expired!</h2>
        <p>Your session has expired after 1 minute.</p>
<%
    }
%>

<br>
<a href="index.jsp">Go Back</a>

</body>
</html>