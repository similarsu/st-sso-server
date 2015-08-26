<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/includes/taglibs.inc.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
<title>登录页</title>
</head>
<body>
<form method="post" action="${ctx }/login">
	<c:if test="${not empty redirectUrl}">
		<input type="hidden" name="redirectUrl" value="${redirectUrl }"/>
	</c:if>
	用户名：<input type="text" name="loginName"/><br/>
	密码：<input type="password" name="password"/><br/>
	<input type="submit" value="登陆" /><br/>
	<c:if test="${not empty message_error }">
		<spring:message code="${ message_error}"/>
	</c:if>
	<c:remove var="message_error" />
</form>

</body>
</html>