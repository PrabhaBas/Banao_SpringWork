<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Signup</h1>
<div>
	<form action="/signUp">
	Type :<br>
	<input type="text" name="type">user/admin<br>
	First Name : <br>
	<input type="text" name="fname">  <br>
	Email : <br>
	<input type="email" name="email"><br>
	Password     :<br>
	<input type="password" name="password"><br>
    Confirm Password :<br>
    <input type="password" name="cpass"><br><br>
	<input value="Submit" type="submit"><br>
	</form>
</div>


</body>
</html>