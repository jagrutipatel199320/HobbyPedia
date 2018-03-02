<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<c:set var="baseUrl" value="http://localhost:8080/hobbypedia" />


<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="${baseUrl}/resources/css" />
<spring:url var="js" value="${baseUrl}/resources/js" />
<spring:url var="images" value="${baseUrl}/resources/images" />

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>HobbyPedia - ${title}</title>
<script type="text/javascript">
	window.menu = '${title}';
</script>
<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap Readable theme -->
<link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>
	<div class="wrapper">

		<!-- Navigation -->
		<%@include file="./shared/navbar.jsp"%>

		<!--  Page Content -->
		<div class="content">
			<!-- loading home page -->
			<c:if test="${userClickHome == true}">
				<%@include file="home.jsp"%>
			</c:if>

			<!-- loading only when user clicks about -->
			<c:if test="${userClickAbout == true}">
				<%@include file="about.jsp"%>
			</c:if>

			<!-- loading only when user clicks contact -->
			<c:if test="${userClickContact == true}">
				<%@include file="contact.jsp"%>
			</c:if>

			<!-- loading only when user clicks events -->
			<c:if test="${userClickAllEvents == true or userClickCategryEvents == true}">
				<%@include file="listEvents.jsp"%>
			</c:if>

		</div>


		<!-- Footer -->
		<%@include file="./shared/footer.jsp"%>


		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.js"></script>
		<script src="${js}/bootstrap.bundle.min.js"></script>
		<script src="${js}/myapp.js"></script>
	</div>

</body>

</html>
