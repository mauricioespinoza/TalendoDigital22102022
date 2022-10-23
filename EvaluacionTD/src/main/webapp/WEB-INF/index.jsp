<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<title>World-Parts Tech Catalog & Inventory</title>
</head>
<body>
	<div class="container">
		<h1>Monitor de Productos</h1>
		<form action="" method="post">
			<div class="row row-cols-2">
				<div class="column">
					<label class="form-label">Almacén</label>
				</div>
				<div class="column">
					<label class="form-label">Categoría</label>
				</div>
				<div class="column"></div>

			</div>
			<div class="row">
				<div class="column">
					<select class="form-select" aria-label="Almacen">
						<option selected>Seleccione Almacén</option>
						<c:forEach items="${warehouse}" var="almacenes">
							<option value="${almacenes.warehouse_id}">${almacenes.warehouse_name}</option>
						</c:forEach>
					</select>
				</div>
				<div class="column">
					<select class="form-select" aria-label="Categoría">
						<option selected>Seleccione Categoría</option>
						<!--<c:forEach>
  							<option value="1">One</option>
  						</c:forEach>-->
					</select>
				</div>
			</div>
		</form>
	</div>

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
		integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
		integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
		crossorigin="anonymous"></script>
</body>
</html>