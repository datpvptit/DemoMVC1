<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="Tooplate">
<link
	href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&display=swap"
	rel="stylesheet">

<title><decorator:title default="Choose your seats"/></title>

<!-- Additional CSS Files -->
<link rel="stylesheet" type="text/css"
	href='<c:url value="/assets/user/css/bootstrap.min.css"/>'>

<link rel="stylesheet" type="text/css"
	href='<c:url value="/assets/user/css/font-awesome.css"/>'>

<link rel="stylesheet" type="text/css"
	href='<c:url value="/assets/user/css/owl-carousel.css"/>'>

<link rel="stylesheet"
	href='<c:url value="/assets/user/css/tooplate-artxibition.css"/>'>
</head>

<body>



	<!-- Header Section Begin -->
	<%@include file="/WEB-INF/views/layouts/user/header.jsp"%>
	<!-- Hero Section Begin -->
	<decorator:body />
	<!-- Product Section End -->
	<%@include file="/WEB-INF/views/layouts/user/footer.jsp"%>


	<!-- jQuery -->
	<script src="assets/js/jquery-2.1.0.min.js"></script>

	<!-- Bootstrap -->
	<script src="assets/js/popper.js"></script>
	<script src="assets/js/bootstrap.min.js"></script>

	<!-- jQuery -->
	<script src="assets/js/jquery-2.1.0.min.js"></script>

	<!-- Bootstrap -->
	<script src='<c:url value="/assets/user/js/popper.js"/>'></script>
	<script src='<c:url value="/assets/user/js/bootstrap.min.js"/>'></script>


	<!-- Plugins -->
	<script src='<c:url value="/assets/user/js/scrollreveal.min.js"/>'></script>
	<script src='<c:url value="/assets/user/js/waypoints.min.js"/>'></script>
	<script src='<c:url value="/assets/user/js/jquery.counterup.min.js"/>'></script>
	<script src='<c:url value="/assets/user/js/imgfix.min.js"/>'></script>
	<script src='<c:url value="/assets/user/js/mixitup.js"/>'></script>
	<script src='<c:url value="/assets/user/js/accordions.js"/>'></script>
	<script src='<c:url value="/assets/user/js/owl-carousel.js"/>'></script>

	<!-- Global Init -->
	<script src='<c:url value="/assets/user/js/custom.js"/>'></script>

</body>
</html>
