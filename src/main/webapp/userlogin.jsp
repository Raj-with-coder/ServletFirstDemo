<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="style.css" rel="stylesheet" type="text/css"/>
</head>
<body>

<center>
		<form action="<%= request.getContextPath()%>/pageconectkaro" method="post">
			<h1>User Login</h1>
			<input type="text"name= "uid" placeholder="Enter user id" required/>
			<br> <br>
			<input type="password"name= "upass" placeholder="Enter user password" required/>
			<br><br>
			<input type="submit"value= "Login"/>
			
			
		</form>
</center>
	

</body>
</html>