<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.JavaBeans"%>

<%
JavaBeans contact = (JavaBeans) request.getAttribute("contact");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="icon" href="img/favicon.png">
<link rel="stylesheet" href="style.css">
<title>Agenda de contatos</title>
</head>
<body>
	<h1>Criar novo contato</h1>
	<form name="fomrContact" action="edit">
		<table>
		
			<tr>
				<td>
					<input 
						type="hidden" 
						name="id"
						class="caixa1"
						value="<%=contact.getId() %>"
					/>
				</td>
			</tr>
			<tr>
				<td>
					<input 
						type="text" 
						name="name" 
						class="caixa1"
						placeholder="Introduza o nome" 
						value=<%=contact.getName()%>
					/>
				</td>
			</tr>

			<tr>
				<td>
					<input 
						type="email" 
						name="email" 
						class="caixa1"
						placeholder="Introduza o email" 
						value=<%=contact.getEmail()%>
					/>
				</td>
			</tr>

			<tr>
				<td>
					<input 
						type="text" name="phone"
						placeholder="Introduza o nr de celular" class="caixa2"
						value=<%=contact.getPhone() %>
					/>
				</td>
			</tr>
		</table>
		<input class="botao-1" type="button" value="Editar"
			onclick="validate()">
	</form>
	<script src="scripts/validation.js"></script>
</body>
</html>