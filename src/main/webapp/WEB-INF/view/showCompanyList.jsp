<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/mystyle.css">
<script src="/js/myscript.js"></script>
<meta charset="ISO-8859-1">
<title>Customer List</title>
</head>
<body>

	<h2>Customer Account Created Successfully...</h2>

	<table>

		<tr>
			<td><a href="/">Home</a></td>
			<td><a href="showCustomerForm">Show Customer Form</a></td>
		</tr>
	</table>



	<p>Search Customer by Customer Name</p>

	<form:form name="searchCompanyForm" method="POST"
		action="/searchBYCompanyName" modelAttribute="companyPojo">
             <table>
			<tr>
				<td><form:label path="cname">Search by Customer Name :</form:label></td>
				<td><form:input path="cname" /></td>
				<td><input type="submit" value="Search" /></td>
			</tr>
		</table>
        </form:form>




	  
	<table border="1" cellpadding="5">
		<tr>
			            
			<th>Customer ID</th>             
			<th>Customer First Name</th>             
			<th>Customer Last Name</th> 
			<th>Customer Mobile No</th> 
			<th>Customer Email Id</th>            
		</tr>
		<c:forEach items="${companyPojoListObj}" var="companypo">
        <tr>
				<td>${companypo.id}</td>             
				<td>${companypo.cname}</td>   
				<td>${companypo.cname1}</td>           
				<td>${companypo.no}</td> 
				<td>${companypo.cname2}</td>            
				<td>               
				 <a href="/showEditForm?id=${companypo.id}">Edit</a>
					                &nbsp;&nbsp;&nbsp;                
	 <a href="/deleteCompany?id=${companypo.id}">Delete</a>             
				</td>         
			</tr>
        </c:forEach>
</table>
</body>
</html>