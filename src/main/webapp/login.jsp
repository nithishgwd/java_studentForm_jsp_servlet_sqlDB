<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>



<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Login Page</title>
	<link rel="stylesheet" href="style.css">
	<style>
  body {
    background-image: url(https://manipal.edu/content/dam/manipal/mu/sois/Images/banners/MSIS%20Institute%20Home%20Page%201440x800%20Edit%201.jpg);
    background-size: cover;
  }
</style>
</head>
<body>
  <div class="container">
    <div class="myform">

	<% String errorMessage = (String) request.getAttribute("errorMessage"); %>
	<form action="LoginServlet" method="post">
	<h1>Admin Login</h1>
		<label for="username">User name:</label>
		<input type="text" id="username" name="uname"><br><br>
		<label for="password">Password:</label>
		<input type="password" id="password" name="pass"><br><br>
		<input type="submit" value="Login">
		<br><br>
		<% if(errorMessage != null) { %>
			<div style="color:red"><%= errorMessage %></div>
		<% } %>
	</form>
</div>
 <div class="image">
      <img src="MIT.jpeg">
    </div>
  </div>
</body>
</html>

