<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Register</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
 <div class="container">
    <div class="myform">
	<h1>Register Student Details</h1>
	<form action="RegisterServlet" method="post">
		<label for="name">Name:</label>
		<input type="text" id="name" name="name"><br><br>
		<label for="age">Age:</label>
		<input type="text" id="age" name="age"><br><br>
		<label for="dept">Gender:</label>
		<input type="text" id="gender" name="gender"><br><br>
		<label for="subject">Subject:</label>
		<select name="subject" id="subject">
		<option value="cloud computing">cloud computing</option>
		<option value="machine learning">machine learning</option>
		<option value="big data">big data</option>
		</select>
		<br><br>
		<label for="num">Phone Number:</label>
		<input type="text" id="num" name="num"><br><br>
		<input type="submit" value="Register">
	</form>
	</div>
	</div>
</body>
</html>