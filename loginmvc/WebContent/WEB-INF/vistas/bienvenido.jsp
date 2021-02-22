<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
	<c:url value="/content/css/bootstrap.css" var="bootstrap"></c:url>
	<link href="${bootstrap}" rel="stylesheet">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
<body class="bg-info">
	<div class='container'>
		<div class="row">
			<div class="col-10 offset-1">
				<div class="alert alert-success">
					<h1>Bienvenido usuario: 
						<c:out value="${usuario.nombre}" />
					</h1>
					<h2>Tu username es: <c:out value="${usuario.username}"></c:out> </h2>
					
				</div>				
				<a href="salir" class="btn btn-danger btn-lg btn-block">Cerrar sesión</a>
			</div>
		</div>
	</div>
	<c:url value="/content/js/jquery.js" var="jqueryjs"></c:url>		
	<script type="text/javascript" src="${jqueryjs}"></script>
	<c:url value="/content/js/bootstrap.js" var="bootstrapjs"></c:url>
	<script type="text/javascript" src="${bootstrapjs}"></script>
</body>
</html>