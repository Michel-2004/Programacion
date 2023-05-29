<%-- 
    Document   : nombre
    Created on : 16 may 2023, 15:52:52
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
        <h1>Animales</h1>
        <% 
        funciones g1 = new funciones(request.getParameter("nombre1"), "alcon.png");
        funciones g2 = new funciones(request.getParameter("nombre2"), "golondrina.png");
        funciones g3 = new funciones(request.getParameter("nombre3"), "murcielago.png");
        out.println(g1);
        out.println(g2);
        out.println(g3);
        out.println(g1.frase());
        out.println(g2.frase());
        out.println(g3.frase());
        %>
    </body>
</html>
