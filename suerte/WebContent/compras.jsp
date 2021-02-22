<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link href="content/css/bootstrap.css" rel="stylesheet">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
<body class="bg-success">
	<div class='container '>
		<div class="row">
			<div class="col-12 text-white">
				<form action="carrito" method="post">
					<div class="card">
						<div class="card-header bg-secondary">
							<h1 class="cart-title">Lista de compras</h1>
						</div>
						<div class="card-body text-primary">
							<div class="form-row">
								<label>Nombre del articulo</label>
								<input type="text" class="form-control" name="nombre">
							</div>
							<div class="form-row">
								<label>Precio</label>
								<input type="number" class="form-control" name="precio">
							</div>
							<div class="form-row">
								<label>Cantidad</label>
								<input type="number" class="form-control" name="cantidad">
							</div>
							<button type="submit" class="btn btn-primary" >Comprar</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>		
	<script type="text/javascript" src=""></script>
	<script type="text/javascript" src=""></script>
</body>
</html>