 <%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<title>Result Page</title>
</head>

<body>

<h2>Student Result</h2>

<%
    String message = (String) request.getAttribute("message");
    String rollno = (String) request.getAttribute("rollno");
    String name = (String) request.getAttribute("name");

    Integer sub1 = (Integer) request.getAttribute("sub1");
    Integer sub2 = (Integer) request.getAttribute("sub2");
    Integer sub3 = (Integer) request.getAttribute("sub3");
    Integer sub4 = (Integer) request.getAttribute("sub4");
    Integer sub5 = (Integer) request.getAttribute("sub5");

    Double avg = (Double) request.getAttribute("avg");
    String result = (String) request.getAttribute("result");
%>

<h3><%= message %></h3>

<% if (rollno != null) { %>

<p>Roll No: <%= rollno %></p>
<p>Name: <%= name %></p>

<p>Sub1: <%= sub1 %></p>
<p>Sub2: <%= sub2 %></p>
<p>Sub3: <%= sub3 %></p>
<p>Sub4: <%= sub4 %></p>
<p>Sub5: <%= sub5 %></p>

<h3>Average Marks: <%= avg %></h3>

<h3>Result: <%= result %></h3>

<% } %>

<br>

<a href="index.jsp">← Back to Form</a>

</body>
</html>