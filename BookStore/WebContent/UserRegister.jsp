<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>

<div style="background-color: cyan">
<h1>
<b>Customer Register</b>
</h1>
</div>


</b><br><br>
<form action="CustomerRegister">

<input type="text" name="name" placeholder="Enter Name" required="required"><br>
<input type="text" name="email" placeholder="Enter Email" required="required"><br>
<input type="text" name="phone" placeholder="Enter Phone" required="required"><br>
<input type="password" name="password" placeholder="Enter Password" required="required"><br>
<input type="text" name="city" placeholder="Enter City" required="required"><br>
<input type="text" name="pincode" placeholder="Enter Pincode" required="required"><br><br>

<input type="submit" value="Register">
</form><br><br>

</center>
</body>
</html>