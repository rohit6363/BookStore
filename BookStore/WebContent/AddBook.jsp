<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center" style="background-color: cyan">
<h1>ADDBOOK</h1>
</div>
<center>
<form action="AddBook">
<input type="text" name="book_name" placeholder="Book Name" required="required"><br>
<input type="text" name="author" placeholder="Author" required="required"><br>
<input type="text" name="price" placeholder="Price" required="required"><br>
<input type="submit" value="ADD!">
</form>
</center>
</body>
</html>