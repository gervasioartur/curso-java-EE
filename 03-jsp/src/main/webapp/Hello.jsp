<%@ 
	page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>
<%@
 	page import="java.util.Date"
 %>
 
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Hello world, i'm jsp</title>
</head>
<body>
<h1>Hello world, i'm jsp!</h1>
<p>
	<%out.println("Gervasio Artur Dombo"); %>
</p>
<%-- Uso do elemento expressao --%>
<p>Data: <%=new Date()%></p>

<%! int contador = 0; %>
<p>Visitas: <%=contador++ %></p>
</body>
</html>