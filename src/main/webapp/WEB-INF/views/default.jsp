<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/includes/taglibs.inc.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="text/javascript" src="${ctx}/libs/js/jquery.js"></script>
<script type="text/javascript" src="${ctx}/libs/js/language/cn.js"></script>
<script type="text/javascript" src="${ctx}/libs/js/framework.js"></script>
<link href="${ctx}/libs/css/import_basic.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" type="text/css" id="skin" prePath="${ctx}/"/>
<link rel="stylesheet" type="text/css" id="customSkin"/>
</head>
<body>
	<div class="welcome" id="openContent">
		 <div class="welcomeTitle"></div>
	</div>	
<script>
function customHeightSet(contentHeight){
		$("#openContent").height(contentHeight);
	}
</script>
</body>
</html>