<%-- 
    Document   : index
    Created on : 15 may 2023, 16:58:32
    Author     : villo
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="funciones.funciones"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Animales</title>
<link rel="stylesheet" type="text/css" href="estilo.css" />
</head>
    <body>
        <h1>Formulario nombre animales</h1>
    <hr>
    <form method="post" action="nombre.jsp">
        Primer Nombre:
        <input type="text" name="nombre1"><br>
        Segundo Nombre:   
        <input type="text" name="nombre2"><br>
        Tercer Nombre:
        <input type="text" name="nombre3"><br>
        <input type="submit" value="Guardar">
    </form>
    </body>
</html>
