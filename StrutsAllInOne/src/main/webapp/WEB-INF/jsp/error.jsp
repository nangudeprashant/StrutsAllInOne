<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error page</title>
</head>
<body>
	<center>
		<%-- <h1>Sorry, unexpected exception occurred:</h1>
        <h2>Exception name: ${exception}</h2> --%>
        <h1>Sorry, unexpected exception occurred:</h1>
		Exception name:
		<s:property value="exception" />
		<%-- Exception stack trace:
		<s:property value="exceptionStack" /> --%>
	</center>
</body>
</html>