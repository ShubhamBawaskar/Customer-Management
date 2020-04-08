<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/mystyle.css">
<script src="/js/myscript.js"></script>

<meta charset="ISO-8859-1">
<title>edit form</title>
</head>
<body>


<header class="headerblock">
		<%@ include file="header.jsp"%>
	</header>

	<section class="bodyblock">


		<h2>Edit Customer Detail Form</h2>

		<form:form name="customerRegistrationForm"
			onsubmit="return validateCustomerRegistrationForm()" method="POST"
			action="/editCompanyDetails" modelAttribute="companyPojo">
             <table>
				<tr>
					<td><form:label path="id">Customer Id</form:label></td>
					<form:hidden path="id" />
					<td>${companyPojo.id}</td>
				</tr>
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
					<td><input type="submit" value="Edit Customer details" /></td>
				</tr>
			</table>
        </form:form>
	</section>

	<footer class="footerblock">
		<%@ include file="footer.jsp"%>
	</footer>

</body>
</html>