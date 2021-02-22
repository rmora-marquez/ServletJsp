<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="com.mpersd.servlet.modelo.ArticuloTo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<link href="content/css/bootstrap.css" rel="stylesheet">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
<%! private int contador = 0;
	
	public String getFecha(){
		SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMM 'del' yyyy hh:mm:ss a");
		return df.format( new Date() );
	}

%>	
</head>
<body class="bg-primary">
	<div class='container'>
		<%@ include file="/WEB-INF/plantilla/header.jsp" %>
		<div class="row">
			<div class="col-12 bg-white text-danger">
				<h1>Ejemplos con JSP</h1>
				<% int x = 8;
				for(int i = 1; i<10;i++){
					out.println(x + " * " + i + " = " + x * i + "<br>");
				}
				%>
				
				<h3>Ofertas de productos</h3>
				<% 
				
				double precio = 15;
				int cantidad = 1;
				if(request.getParameter("cantidad") != null){
					cantidad = new Integer( request.getParameter("cantidad") );
				}
				ArticuloTo art = new ArticuloTo("Jabón",precio,cantidad, precio*cantidad); %>
				<ol class="list-group">
					<li class="list-group-item">
						Nombre: <% out.println(art.getNombre()); %>
					</li>
					<li class="list-group-item">
						Precio: $<%= art.getPrecio() %>
					</li>
					<li class="list-group-item">
						<form>
							Cantidad:: <%= art.getCantidad() %>								
							<input type="text" class="form-control" name="cantidad"
								value="<%= art.getCantidad() %>"  >							
						</form>											
					</li>
					<li class="list-group-item">
						Total: <%= art.getTotal() %>
					</li>
				</ol>
				<div class="alert alert-success">
					La pagina ha sido vistada <%= ++contador %> veces.
					<br>
					La fecha actual es: <%= this.getFecha() %>
				</div>
				<div class="alert alert-warning">
					<c:out value="Mensajes desde las JSTL"></c:out>
					<br>
					<jsp:useBean id="msj" class="com.mpersd.servlet.modelo.Mensaje"></jsp:useBean>
					<c:out value="${msj.texto}" default="Texto es nulo"></c:out>
					<br>
					<jsp:setProperty property="texto" name="msj" value="Mensaje programado"/>
					<c:out value="${msj.texto}" default="Texto es nulo"></c:out>
				</div>
				<jsp:useBean id="lista" class="com.mpersd.servlet.modelo.Lista"></jsp:useBean>
				<ol class="list-group">
					<c:forEach var="nombreActual" items="${lista.listaDeNombres}">
						<li class="list-group-item">
							<c:out value="${nombreActual}"></c:out>
						</li>
					</c:forEach>
				</ol>
			</div>
		</div>
	</div>		
	<script type="text/javascript" src=""></script>
	<script type="text/javascript" src=""></script>
</body>
</html>