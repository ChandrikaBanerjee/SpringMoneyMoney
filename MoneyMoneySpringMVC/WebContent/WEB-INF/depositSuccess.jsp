<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Home.jsp" method="get">
<h2>Successfully Deposited ${sessionScope.amount } in Account Number ${sessionScope.number }</h2>
<input type="submit" value="Home">
</form></body>
</html>