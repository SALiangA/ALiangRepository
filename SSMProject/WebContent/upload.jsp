<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctxPath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Model Page</title>
<style type="text/css">
#to_div{
	width: 300px;
	height: 200px;
	background-color: gray;
	margin-left: auto;
	margin-right: auto;
	text-align: center;
}
</style>
</head>
<body>
<div id="to_div" >
		<table id="tbl" border="1px" cellspacing="0">
		<form id="form-1" action="${ctxPath }/Cource/Upload"
		method="post"
		enctype="multipart/form-data">	
		<tr>
			<td>文件上传</td>
		</tr>
		<tr>
			<td>
		选择文件：<input type="file" name="picfile"/>
			</td>
		</tr>
		<tr>
			<td>
				<input type="submit" name="submit" value="确认上传"/>
			</td>
		</tr>
		</form>
		</table>
</div>
</body>
</html>