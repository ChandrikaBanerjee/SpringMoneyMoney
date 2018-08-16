<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib prefix="alfa" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" type="text/css" href="mystyle.css">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



		<form action="fundTransferTransact" method="get">

			<div>
				<table>
					<tr>
						<th><h2>Fund Transfer</h2></th>
					</tr>
					<tr>
						<th>From Account Number : </th>
						<th > <input type="number" name="typedFromAccount"  placeholder=" From Account Number " required="required"></th>
					</tr>
					<tr>
						<th >To Account Number : </th>
						<th> <input type="number" name="typedToAccount"  placeholder=" To Account Number " required="required"></th>
					</tr>
					<tr>
						<th>Amount : </th>
						<th > <input type="number" name="typedAmount"  placeholder="Enter Amount" required="required"></th>
					</tr>
					
 					<tr>
						<th><input type="submit" value="Transfer"></th>
					</tr>
				</table>
			</div>

		</form>
	

</body>
</html>