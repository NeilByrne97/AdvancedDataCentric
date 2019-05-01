<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="i" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<link rel="stylesheet" href="/css/styles.css"> 
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>ADCWA Final Project</title>
	</head>
	<body>
	    <h1>Customers</h1>
	         <i:forEach items="${customers}" var="c">
	                <h2>${c.cId} ${c.cName}</h2>
	              	<p>Loan Period: ${c.loanPeriod}</p>
	              	
	              	
	              	<h3>${c.cName}'s Loan</h3>
	            <table>
		         	<tr>
		         		<th>Loan ID</th>
		         		<th>Book ID</th>
		         		<th>Title</th>
		         		<th>Author</th>
		         	</tr>
	         		<j:forEach items="${c.loans}" var="l">
						<tr>
							<td>${l.lid}</td>
							<td>${l.book.bid}</td>
							<td>${l.book.title}</td>
							<td>${l.book.author}</td>
						</tr>
	         		</j:forEach>
	        	</table>
	         </i:forEach>
		<a href="/">Home</a> <a href="/showBooks">List Book</a> <a href="showCustomers">List Customers</a> <a href="showLoans">List Loans</a> <a href="/logout">Logout</a>
	</body>
</html>