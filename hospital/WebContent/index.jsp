<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>

<div>
<form action="Controller" method="post">
<input type="submit"  name="accion" value="Listar">
<input type="submit"  name="accion" value="Nuevo"></form>
	<table>
	<thead>
	<tr >
		<th>Nombre</th>
		<th>Edad</th>
		<th>Genero</th>
		<th>Telefono</th>
		<th>Alergia</th>
		</tr>
	</thead>
	<tbody>
	
	<c:forEach var="dato" items="${lista}">
	<tr>
		<td>${dato.getNombre()}</td>
		<td>${dato.getEdad()}</td>
		<td>${dato.getGenero()}</td>
		<td>${dato.getTelefono()}</td>
		<td>${dato.getAlergia()}</td>
		</tr>
		</c:forEach>
	
	</tbody>
	</table>
	</div>
</body>
</html>