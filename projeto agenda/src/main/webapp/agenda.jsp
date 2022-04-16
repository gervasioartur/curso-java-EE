<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.JavaBeans"%>
<%@ page import="java.util.ArrayList"%>

<%
ArrayList<JavaBeans> contacts = (ArrayList<JavaBeans>) request.getAttribute("contacts");
%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<link rel="icon" href="img/favicon.png">
<link rel="stylesheet" href="style.css">
<title>Agenda de contatos</title>
</head>
<body>
	<h1>Agenda de contatos</h1>
	<a href="novo.html" class="botao-1">Novo contato</a>
	<table id="tabela">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Phone</th>
				<th>E-mail</th>
				<th>Opcoes</th>
			</tr>
		</thead>
		<tbody>
			<%for (JavaBeans contact : contacts) {%>
			<tr>
				<td><%=contact.getId()%></td>
				<td><%=contact.getName()%></td>
				<td><%=contact.getName()%></td>
				<td><%=contact.getPhone()%></td>
				<td><a class="botao-1" href="editOP?id=<%=contact.getId()%>">Editar</a></td>
			</tr>
			<%}%>
		</tbody>
	</table>
</body>
</html>