<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body>
<center>
		<form action="<%= request.getContextPath()%>/adminkoconectkaro" method="post">
			<h1>Admin Login</h1>
			<input type="text"name= "aid" placeholder="Enter admin id" required/>
			<br> <br>
			<input type="password"name= "apass" placeholder="Enter admin password" required/>
			<br><br>
			<input type="submit"value= "Login"/>
			
		</form>
	</center>

</body>
</html>