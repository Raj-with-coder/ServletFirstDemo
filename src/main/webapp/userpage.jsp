<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Signup page</title>
</head>
<body>
<center>
		<form action="<%= request.getContextPath()%>/aaa" method="post">
			<h1>User Signup</h1>
			<input type="text"name= "uname" placeholder="Enter the user name" required/>
			<br> <br>
			<input type="text"name= "user_id" placeholder="Enter usre id" required/>
			<br><br>
			<input type="password"name= "upass" placeholder="Enter user password" required/>
			<br><br>
			<input type="text"name= "ucity" placeholder="Enter city name" required/>
			<br><br>
			<input type="text"name= "umob" placeholder="Enter the mobile number" required/>
			<br><br>
			<input type="submit"value= "Signup"/>
		</form>
</center>

</body>
</html>