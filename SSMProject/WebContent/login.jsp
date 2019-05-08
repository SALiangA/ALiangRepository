<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctxPath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Model Page</title>
</head>
<body>
	<form action="${ctxPath}/User/login" method="post">
		用户名：<input type="text" name="name"/><br>
		密码：<input type="text" name="pass"/><br>
		<input type="submit" name="submit" value="提交"/>
	</form>
</body>
</html>