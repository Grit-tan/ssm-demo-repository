<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<h1>SSM网站开发演示案例</h1>

	<table>
		<c:forEach var="tr" items="${list}" varStatus="status">
			<tr>
				<td>${tr.id}</td>
				<td>${tr.text1}</td>
				<td>${tr.text2}</td>
				<td>${tr.text3}</td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>