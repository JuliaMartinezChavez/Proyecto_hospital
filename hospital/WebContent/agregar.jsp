<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Agregar un nuevo paciente</h3>
<form action="Controller" method="POST">
Nombre: <input type="text" name="txtNombre" maxlength="50" required>
Edad: <input type="text" name="txtEdad" maxlength="3" required>
Genero: <input type="text" name="txtGenero" maxlength="1" required>
Telefono:  <input type="text" name="txtTelefono" maxlength="10" required>
Alergia: <input type="text" name="txtalergia" maxlength="30" required>
<br><br>
<input type="submit" value="Guardar" name = "accion">
<input type="submit" value="Regresar" name = "accion">
</form>
</body>
</html>