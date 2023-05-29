<%-- 
    Document   : index
    Created on : 22 may 2023, 16:47:49
    Author     : villo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="funciones.funcion"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Juego</title>
    </head>
    <body>
        <h1>Piedra, papel y tijera</h1>
        <table>
            <tr>
                <td>Jugador 1</td><td>Jugador 2</td>   
            </tr>
            <%
             
                out.print(juego1());
                out.print(juego2());
              
            %>
        </table>
    </body>
</html>
