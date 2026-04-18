 <%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<title>Student Result Form</title>

<script>
function validateForm() {

    let rollno = document.forms["studForm"]["rollno"].value;
    let name = document.forms["studForm"]["name"].value;

    let subjects = ["sub1","sub2","sub3","sub4","sub5"];

    if (rollno == "" || name == "") {
        alert("Roll No and Name are required");
        return false;
    }

    for (let i = 0; i < subjects.length; i++) {
        let val = document.forms["studForm"][subjects[i]].value;
        if (val == "" || val < 0 || val > 100) {
            alert("Enter valid marks (0–100)");
            return false;
        }
    }

    return true;
}
</script>

</head>

<body>

<h2>Student Result Form</h2>

<form name="studForm" action="ResultServlet" method="post" onsubmit="return validateForm()">

Roll No: <input type="text" name="rollno"><br><br>

Name: <input type="text" name="name"><br><br>

Subject 1: <input type="number" name="sub1"><br><br>
Subject 2: <input type="number" name="sub2"><br><br>
Subject 3: <input type="number" name="sub3"><br><br>
Subject 4: <input type="number" name="sub4"><br><br>
Subject 5: <input type="number" name="sub5"><br><br>

<input type="submit" value="Submit">

</form>

</body>
</html>