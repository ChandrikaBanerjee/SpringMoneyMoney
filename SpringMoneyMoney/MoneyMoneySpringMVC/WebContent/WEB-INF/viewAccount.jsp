<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div style="align: center;">
		<h1>VIEW ACCOUNTS</h1>
		
			<table>
				<tr>
					<th>ACCOUNT NUMBER </th>
					<th>CUSTOMER NAME </th>
					<th>CUSTOMER ID</th>
					<th>ACCOUNT TYPE</th>
					<th>ACCOUNT BALANCE</th>
					<th>OVERDRAFT LIMIT</th>
					<th>SALARY ACCOUNT</th>
					
				</tr>
				
					<tr>
						<td>${sessionScope.search.accountNumber}</td>
						<td>${sessionScope.search.accountHolder.customerName}</td>
						<td>${sessionScope.search.accountHolder.customerId}</td>
						<td>${sessionScope.search.accountType}</td>
						<td>${sessionScope.search.accountBalance}</td>
						
						<jstl:choose>
						<jstl:when
							test='${sessionScope.search.accountType.equals("Current")}'>
							<td align="center">${sessionScope.search.odLimit}</td>
							<td align="center">NA</td>
						</jstl:when>
						<jstl:otherwise>
							<td align="center">NA</td>
							<td align="center">${sessionScope.search.salary}</td>
						</jstl:otherwise>
					</jstl:choose>
					</tr>
			<tr>	<th><input type="submit" value="Home"></th>
					</tr>		
						
						
						
						
						
						
						
						
					
			
			</table>

	
	</div>

</body>
</html>