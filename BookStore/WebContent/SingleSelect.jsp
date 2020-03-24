<%@page import="com.store.model.Book"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Book c = (Book)session.getAttribute("singlebook");
%>

<center>
<table border=2>
<tr><th>ID</th><th>NAME</th><th>AUTHOR</th><th>PRICE</th>



	
	<tr>
	
		<td><%=c.getBook_id() %><td><%=c.getBook_name() %></td><td><%=c.getAuthor() %></td><td><%=c.getPrice() %></td>
	</tr>
	


</table><br><br>
<form action="ConfirmOrder">
Enter Quantity : <input type = "text" name = "quantity">
<input type="submit" value = "confirm Order">

</form>
</center>
<%
session.setAttribute("book", c);
%>
</body>
</html>