<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="i" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" href="/css/styles.css"> 
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>ADCWA Final Project</title>
</head>
	<body>
	    <h1>List of Loans</h1>
	    <table>
	        <tr>
	            <th>Loan ID</th>
	            <th>Customer ID</th>
	            <th>Book ID</th>
	           	<th>Book Title</th>
	            <th>Book Author</th>
	            <th>Due Date</th>
	        </tr>
	        <tr>
	            <i:forEach items="${loans}" var="l">
	                <tr>
	                    <td>${l.lid}</td>
	                    <td>${l.cust.cId}</td>
	                    <td>${l.cust.cName}</td>
	                    <td>${l.book.title}</td>
						<td>${l.book.author}</td>
						<td>${l.dueDate}</td>
	                </tr>
	            </i:forEach>
	        </tr>
		</table>
		<a href="/">Home</a> <a href="/addBook">Add Book</a> <a href="showCustomers">List Customers</a> <a href="showLoans">List Loans</a> <a href="deleteLoan">Delete Loan</a> <a href="/logout">Logout</a>
	</body>
</html>