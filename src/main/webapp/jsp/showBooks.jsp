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
	    <h1>List of Books</h1>
	    <table>
	        <tr>
	            <th>Book ID</th>
	            <th>Title</th>
	            <th>Author</th>
	        </tr>
	        <tr>
	            <i:forEach items="${books}" var="b">
	                <tr>
	                    <td>${b.bid}</td>
	                    <td>${b.title}</td>
	                    <td>${b.author}</td>
	                </tr>
	            </i:forEach>
	        </tr>
		</table>
		<a href="/">Home</a> <a href="/addBook">Add Book</a> <a href="showCustomers">List Customers</a> <a href="showLoans">List Loans</a> <a href="/logout">Logout</a>
	</body>
</html>