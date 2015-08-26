<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/includes/taglibs.inc.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!--框架必需start-->
<script type="text/javascript" src="${ctx}/libs/js/jquery.js"></script>
<script type="text/javascript" src="${ctx}/libs/js/language/cn.js"></script>
<script type="text/javascript" src="${ctx}/libs/js/framework.js"></script>
<link href="${ctx}/libs/css/import_basic.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" type="text/css" id="skin" prePath="${ctx}/" />
<link rel="stylesheet" type="text/css" id="customSkin"/>
<!--框架必需end-->

<!-- 树start-->
<script type="text/javascript" src="${ctx}/libs/js/tree/ztree/ztree.js"></script>
<link href="${ctx}/libs/js/tree/ztree/ztree.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="${ctx}/libs/js/nav/treeAccordion_normal.js"></script>
<style>
	.ztree li span.zbutton.diy01_ico_open, .ztree li span.zbutton.diy01_ico_close{width:18px!important;height:18px!important;padding-top:0;}
</style>
<script type="text/javascript">

    var zNodes = [

		{ id:3000, parentId:0, name:"常用资源索引",icon:"${ctx}/libs/skin_frame/menuicons/01.png",iconSkin:"diy01"},
		{ id:002, parentId:3000, name:"CSS库索引",url:"${ctx}/sample_html/index/css.html", target:"frmright",iconOpen:"${ctx}/libs/icons/tree_close.gif",iconClose:"${ctx}/libs/icons/tree_open.gif",icon:"${ctx}/libs/skin_frame/titlebar_arrow.gif"},
		{ id:003, parentId:3000, name:"小图标索引",url:"${ctx}/sample_html/index/icons.html", target:"frmright",iconOpen:"${ctx}/libs/icons/tree_close.gif",iconClose:"${ctx}/libs/icons/tree_open.gif",icon:"${ctx}/libs/skin_frame/titlebar_arrow.gif"},
		{ id:004, parentId:3000, name:"中图标索引",url:"${ctx}/sample_html/index/icons-m.html", target:"frmright",iconOpen:"${ctx}/libs/icons/tree_close.gif",iconClose:"${ctx}/libs/icons/tree_open.gif",icon:"${ctx}/libs/skin_frame/titlebar_arrow.gif"},
		{ id:005, parentId:3000, name:"大图标索引-1",url:"${ctx}/sample_html/index/icons-l-1.html", target:"frmright",iconOpen:"${ctx}/libs/icons/tree_close.gif",iconClose:"${ctx}/libs/icons/tree_open.gif",icon:"${ctx}/libs/skin_frame/titlebar_arrow.gif"},
		{ id:006, parentId:3000, name:"大图标索引-2",url:"${ctx}/sample_html/index/icons-l-2.html", target:"frmright",iconOpen:"${ctx}/libs/icons/tree_close.gif",iconClose:"${ctx}/libs/icons/tree_open.gif",icon:"${ctx}/libs/skin_frame/titlebar_arrow.gif"},
		{ id:007, parentId:3000, name:"大图标索引-3",url:"${ctx}/sample_html/index/icons-l-3.html", target:"frmright",iconOpen:"${ctx}/libs/icons/tree_close.gif",iconClose:"${ctx}/libs/icons/tree_open.gif",icon:"${ctx}/libs/skin_frame/titlebar_arrow.gif"},
		
		{ id:3001, parentId:0, name:"多功能容器",icon:"${ctx}/libs/skin_frame/menuicons/02.png",iconSkin:"diy01"},
		{ id:101, parentId:3001, name:"box1",url:"${ctx}/sample_html/box/box1.html", target:"frmright",iconOpen:"${ctx}/libs/icons/tree_close.gif",iconClose:"${ctx}/libs/icons/tree_open.gif",icon:"${ctx}/libs/skin_frame/titlebar_arrow.gif" ,title:"box1"},
		{ id:102, parentId:3001, name:"box2",url:"${ctx}/sample_html/box/box2.html", target:"frmright",iconOpen:"${ctx}/libs/icons/tree_close.gif",iconClose:"${ctx}/libs/icons/tree_open.gif",icon:"${ctx}/libs/skin_frame/titlebar_arrow.gif", title:"box2"}
	];

    
</script>
<!-- 树end -->
</head>

<body leftFrame="true">
	<div>
		<ul id="treeDemo" class="ztree ztree_accordition"></ul>
	</div>				
</body>				
</body>
</html>