<%@page import="com.store.model.Order"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><center>

<h1>Welcome Admin</h1>
<%
	List<Order> order = (List<Order>)session.getAttribute("orders");
%>

<table border="2">
<tr>

<th>Order_id</th>
<th>book</th>
<th>quantity</th>
<th>FinalPrice</th>
<th>OrderDate</th>
</tr>

<%
	for(Order o : order)
{
%>
	<tr>
	<td> <%=o.getOrder_id() %></td>
	<td> s</td>
	<td> <%=o.getQuantity() %></td>
	<td> <%=o.getFinal_price() %></td>
	<td> <%=o.getOrder_date() %></td>
	</tr>
	<%
}
%>
</table>
</center>
</body>
</html>