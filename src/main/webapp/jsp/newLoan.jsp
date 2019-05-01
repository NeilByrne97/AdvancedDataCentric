<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>ADCWA Final Project</title>
	</head>
		<body>
			<h1>New Loan</h1>
			<form:form modelAttribute="loanNew">
				<table>
					<tr>
						<td>Customer ID: </td>
						<td><form:input path="cust.cId"></form:input></td>
						<td><form:errors path="cust.cId"></form:errors></td>
					</tr>
					<tr>
						<td>Book ID: </td>
						<td><form:input path="book.bid"></form:input></td>
						<td><form:errors path="book.bid"></form:errors></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="Add"/></td>
					</tr>
				</table>
			</form:form>
			<a href="/">Home</a> <a href="showBooks">List Books</a> <a href="showCustomers">List Customers</a> <a href="showLoans">List Loans</a>
		</body>
</html>