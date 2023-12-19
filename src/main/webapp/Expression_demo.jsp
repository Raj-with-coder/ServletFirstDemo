<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%= "Hello raj" %>

<% 
	int n1= 10, n2 =2,res;
	res= n1*n2;
	

%>
<h1>Multiplication result= <%=res %></h1>



<%!
String city="lucknow";

%>
<h1>city name:<%= city%></h1>

</body>
</html>