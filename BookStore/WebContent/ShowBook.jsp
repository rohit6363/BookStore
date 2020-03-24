
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.store.model.Book"%>
	<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center" style="background-color: cyan">
<h1>USER HOME
</h1>
<div align="right"><a href="Userlogin.jsp">LOGOUT</a></div>
</div>
<center>
<%
List<Book> list = (List<Book>)session.getAttribute("booklist");

%>
<center>
<table border=2>
<tr><th>ID</th><th>NAME</th><th>AUTHOR</th><th>PRICE</th>


<%
for(Book c : list)
{
	%>
	
	<tr>
	
	<td><a href="SingleDisplay?id=<%=c.getBook_id()%>"><%=c.getBook_id() %></a></td>
	<td><%=c.getBook_name() %></td><td><%=c.getAuthor() %></td><td><%=c.getPrice() %></td></tr>
	<%
}
%>

</table>
</center>
</body>
</html>


