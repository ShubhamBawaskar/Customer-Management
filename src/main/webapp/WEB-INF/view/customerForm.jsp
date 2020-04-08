<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/mystyle.css">
<script src="/js/myscript.js"></script>
<meta charset="ISO-8859-1">
<title>Customer Registration Form</title>
</head>
<body>

	<header class="headerblock">
		<%@ include file="header.jsp"%>
	</header>


	<section class="bodyblock">


		<h2>Customer Registration Form</h2>
		<a href="/">Home</a> <a href="listCustomer">List Customer</a>


		<form:form name="customerRegistrationForm"
			onsubmit="return validateCustomerRegistrationForm()" method="POST"
			action="/registerCustomer" modelAttribute="companyPojo">
             <table>
				<tr>
					<td><form:label path="cname">First Name</form:label></td>
					<td><form:input path="cname" /></td>
					
				</tr>
				<tr>
					<td><form:label path="cname1">Last Name</form:label></td>
					<td><form:input path="cname1" /></td>
					
				</tr>
				<tr>
					<td><form:label path="no">Mobile No</form:label></td>
					<td><form:input path="no" /></td>
				</tr>
				<tr>
					<td><form:label path="cname2">Email</form:label></td>
					<td><form:input path="cname2" /></td>
				</tr>
				
				
				<tr>
					<td><input type="submit" value="Register New Customer" /></td>
				</tr>
			</table>
        </form:form>
	</section>

	<footer class="footerblock">
		<%@ include file="footer.jsp"%>
	</footer>

</body>
</html>