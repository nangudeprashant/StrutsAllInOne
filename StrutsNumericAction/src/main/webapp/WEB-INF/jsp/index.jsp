<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>Java Live Struts Example!!</title>
<s:head />
</head>

<body>
	<h1>
		<s:text name="Welcome to JavaLive!!!!!!!!!!!!!!!!!" />
	</h1>
	<s:form name="myForm">
		<s:textfield key="Please Enter Numer1   " name="number1" />
		<s:textfield key="Please Enter Numer2   " name="number2" />
		<s:submit action="add" value="add" />
		<s:submit action="sub" value="sub" />
		<s:submit action="mul" value="mul" />
		<s:submit action="div" value="div" />
	</s:form>
</body>
</html>