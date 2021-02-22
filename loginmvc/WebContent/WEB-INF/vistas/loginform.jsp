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
			<div class="col-6 offset-3 card">
			<c:url value="/login" var="loginpage" />
				<form action="${loginpage}" method="post">
					<div class="card-title bg-info text-white">
						<h3>Identificarse</h3>						
					</div>
					<fieldset class="card-body text-info ">
						<c:if test="${param.error != null}">
							<%-- solo se vera, si en la url existe el parametro
								/localhost/loginmvc/login?error
							 --%>
							<div class="alert alert-danger">
								<h3>Error: usuario o password incorrectos</h3>
							</div>
						</c:if>
						
						<div class="form-group">
							<label>Nombre Usuario:</label>
							<input type="text" name="username" class="form-control">
						</div>
						<div class="form-group">
							<label>Password:</label>
							<input type="password" name="password" class="form-control">
						</div>						
					</fieldset>
					<div class="card-footer bg-light" >
						<button type="submit" class="btn btn-outline-info">Entrar</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<c:url value="/content/js/jquery.js" var="jqueryjs"></c:url>		
	<script type="text/javascript" src="${jqueryjs}"></script>
	<c:url value="/content/js/bootstrap.js" var="bootstrapjs"></c:url>
	<script type="text/javascript" src="${bootstrapjs}"></script>
</body>
</html>