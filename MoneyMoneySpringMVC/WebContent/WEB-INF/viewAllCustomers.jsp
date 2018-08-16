<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>


<meta charset="ISO-8859-1">
<title>View All Customers</title>
</head>
<body>

		<form action="viewAllAccount.app" method="get">

			<div>
				<table>
					<tr>
						<th><h2>All Account Details</h2></th>
					</tr>
					<tr>
						<th >Account Number</th>
						<th >Customer Name</th>
						<th >Customer ID</th>
						<th >Account Type</th>
						<th >Account Balance</th>
					
						<th>Phone No</th>
						<th>Date Of Birth</th>
					</tr>

					<jstl:forEach var="BankAccount" items="${sessionScope.BankAccounts }">
						<tr>
							<td align="center">${BankAccount.accountNumber }</td>
							<td align="center">${BankAccount.accountHolder.customerName }</td>
							<td align="center">${BankAccount.accountHolder.customerId }</td>
							<td align="center">${BankAccount.accountType }</td>
							<td align="center">${BankAccount.accountBalance }</td>
							
							<td align="center">${BankAccount.accountHolder.contactNumber }</td>
							<td align="center">${BankAccount.accountHolder.dateOfBirth }</td>
							

						</tr>
					</jstl:forEach>
					
					<tr>
						<th colspan="9"  height="40"><input type="submit" value="Home"></th>
					</tr>
				</table>
			</div>

		</form>
	
</body>
</html>