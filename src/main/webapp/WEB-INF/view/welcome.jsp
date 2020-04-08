<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/mystyle.css">
<script src="/js/myscript.js"></script>
<meta charset="ISO-8859-1">
<title>Customer Management Portal</title>
</head>
<body>

    <header class="headerblock">
		<%@ include file="header.jsp"%>
			
	</header>
	
	<section class="bodyblock">
	Welcome to Customer Management Portal
		<a href="showCustomerForm">Register New Customer</a>
		 <a href="listCustomer">List Customer</a>
	</section>
	
	<footer class="footerblock">
		<%@ include file="footer.jsp"%>
	</footer>

</body>
</html>