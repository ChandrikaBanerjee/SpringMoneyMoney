<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="fundtransfer.app" method="get">
<table>
<tr>
<th>
<h2>Fund Transfer</h2>
</th>
</tr>

<tr>
<th>
From Account Number
</th>
<th><input type="number" name="typedFromAccount"></th>
</tr>

<tr>
<th>
To Account Number
</th>
<th><input type="number" name="typedToAccount"></th>
</tr>

<tr>
<th>
Amount
</th>
<th><input type="number" name="amount"></th>
</tr>
<tr>

<th><input type="submit" name="Transfer"></th>
</tr>
</table>