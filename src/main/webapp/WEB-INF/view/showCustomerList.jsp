<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/mystyle.css">
<script src="/js/myscript.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Customer Created Successfully...</h2>

	<a href="/">Home</a>
	<a href="showCustomerForm">Show Customer Form</a> 
	    
	<table border="1" cellpadding="5">
		     <tr><input type="text" placeholder="Search" name="search" size="100"></tr>    
		<tr>			         
			<th>Customer ID</th>             
			<th>Customer First Name</th>             
			<th>Customer Last Name</th> 
			<th>Customer Mobile no</th> 
			<th>Customer Email</th> 
			            
		</tr>
		<c:forEach items="${companyPojoListObj}" var="customerpo">
        <tr>
				<td>${customerpo.id}</td>             
				<td>${customerpo.cname}</td>   
				<td>${customerpo.cname1}</td>           
				<td>${customerpo.no}</td>    
				<td>${customerpo.email}</td>            
				<td>                
	<a href="/showEditForm?id=${customerpo.id}">Edit</a>
              &nbsp;&nbsp;&nbsp;                 
    <a href="/deleteCompany?id=${customerpo.id}">Delete</a>             
				</td>         
			</tr>
        </c:forEach>
</table>
</body>
</html>