<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>

<head>
<link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
<title>예외 처리</title>
</head>

<body>

	<div class="jumbotron">
		<div class="container">
			<h2 class="alert alert-danger">해당 도서가 존재하지 않습니다.<br>도서ID : ${invalidBookId}</h2>
		</div>
	</div>

	<div class="container">
		<p>${url}</p>
		<p>${exception}</p>
	</div>
	
	<div class="container">
		<p>
			<a href="<c:url value="/books"/>" class="btn btn-secondary">도서목록 &raquo;</a>
		</p>
	</div>

</body>
</html>