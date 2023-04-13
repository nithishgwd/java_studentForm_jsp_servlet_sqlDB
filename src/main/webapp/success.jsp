<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Registration Successful</title>
	<link rel="stylesheet" href="style.css">
</head>
<body>
  <div class="container">
    <div class="myform">

	<h1>Registration Successful</h1>
	<p>Your auto-generated roll number is: <%= request.getAttribute("rollNumber") %></p>
	<form action="login.jsp" method="post">
      <input type="submit" value="Logout">
    </form>
    <form action="register.jsp" method="post">
      <input type="submit" value="Register">
       </form>
</div>
</div>
</body>
</html>