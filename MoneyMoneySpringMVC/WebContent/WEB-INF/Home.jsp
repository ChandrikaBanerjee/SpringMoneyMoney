<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="alfa" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>


<meta charset="ISO-8859-1">
<title>Money Money Bank</title>
</head>
<body>

	<form action=".app" method="get">

		<div>
			<table >
				<tr>
					<th><h2>Money Money Bank</h2></th>
				</tr>
				
				<tr>
				
					<th><a href = "searchAccount.jsp"> Search for a Account</a></th>
				</tr>
				
				<tr>
					<th ><a href = "viewAllAccount.app"> View All Customers</a></th>
					<th ><a href = "Deposit.jsp"> Deposit into a Account</a></th>
				</tr>
				
				<tr>
					<th><a href = "withdrawForm.jsp"> Withdraw from a Account</a></th>
					<th><a href = "fundTransfer.jsp"> Fund Transfer</a></th>
				</tr>
			</table>	
		</div>

	</form>
	

</body>
</html>