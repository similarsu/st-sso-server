<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/includes/taglibs.inc.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
<title>错误页面</title>
</head>
<body>
出错了<br/> 
<c:if test="${not empty message_error }">
	<spring:message code="${message_error }"/>
</c:if>
<c:if test="${empty message_error }">
	<spring:message code="error.sys.interior"/>
</c:if>
<c:remove var="message_error" scope="session"/>
<br />
<a href="javascript:history.go(-1)">返回上一页</a>
</body>
</html>