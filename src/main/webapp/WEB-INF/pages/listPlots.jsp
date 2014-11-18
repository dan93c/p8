<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="sources.jsp" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="container">
		<%@include file="menu.jsp"%>
		<div id="center">
			<table border="1">
				<thead>
					<tr>
						<th>#</th>
						<th>Id</th>
						<th>Nume</th>
						<th>Suprafata</th>
						<th>Cimitir</th>
						<th></th>
					</tr>
				</thead>
				<c:forEach var="plot" items="${plots}" varStatus="lineInfo">
					<tr>
						<td>${lineInfo.count}</td>
						<td>${plot.id}</td>
						<td>${plot.name}</td>
						<td>${plot.surface}</td>
						<td>${plot.cemetery.name}</td>
						<td><a href="${CONTEXT_PATH}/plot/edit/${plot.id}"><button>Modifica</button></a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>