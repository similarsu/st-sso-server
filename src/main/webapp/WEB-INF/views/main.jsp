<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/includes/taglibs.inc.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=9" />
<title><spring:message code="title"/></title>
<!--框架必需start-->
<link href="${ctx}/libs/css/import_basic.css" rel="stylesheet" type="text/css"/>
<link href="${ctx}/libs/skins/flatBlue/style.css" rel="stylesheet" type="text/css" id="theme"  themeColor="flatBlue" positionTarget="positionContent" selInputHeight="32" selButtonWidth="35" defaultSelWidth="200" fileBtnWidth="60" defaultFileInputWidth="200" defaultGridHeaderHeight="34" defaultGridRowHeight="38" defaultFontSize="14" defaultPageSelWidth="55" defaultFilterItemHeight="32" dialogWidthFix="0" defaultSelItemHeight="32" defaultFontFamily="宋体"/>
<link href="${ctx}/libs/skin_frame/style.css" rel="stylesheet" type="text/css" id="skin"  skinPath="/libs/skin_frame/"/>
<script type="text/javascript" src="${ctx}/libs/js/jquery.js"></script>
<script type="text/javascript" src="${ctx}/libs/js/language/cn.js"></script>
<script type="text/javascript" src="${ctx}/libs/js/main.js"></script>
<!--框架必需end-->

<!--引入弹窗组件start-->
<script type="text/javascript" src="${ctx}/libs/js/popup/drag.js"></script>
<script type="text/javascript" src="${ctx}/libs/js/popup/dialog.js"></script>
<!--引入弹窗组件end-->

<!--分隔条start-->
<script type="text/javascript" src="${ctx}/libs/js/nav/spliter.js"></script>
<!--分隔条end-->
<script>
function bookmarksite(title, url){
    if (window.sidebar) // firefox
        window.sidebar.addPanel(title, url, "");
    else 
        if (window.opera && window.print) { // opera
            var elem = document.createElement('a');
            elem.setAttribute('href', url);
            elem.setAttribute('title', title);
            elem.setAttribute('rel', 'sidebar');
            elem.click();
        }
        else 
            if (document.all)// ie
                window.external.AddFavorite(url, title);
}
function exitHandler(){

	top.Dialog.confirm("确定要退出系统吗",function(){});
}
function lockScreen(){
	top.Dialog.confirm("确定要锁屏吗，锁屏后只有重新输入密码才能解除。",function(){
		openLockWindow();
	});
}
function openLockWindow(){
	var diag = new top.Dialog();
		diag.Title = "系统锁屏";
		diag.ID = "a1";
		diag.URL="${ctx}/sample/fullform/lock.jsp";
		diag.Width=350;
		diag.Height=150;
		diag.ShowCloseButton=false;
		diag.ShowCancelButton=false;
		diag.ShowOkButton=false;
		diag.ButtonAlign="center";
		diag.AllowChangeIndex=false;
		diag.show();
		diag.addButton("btn1","注销系统",function(){
			top.Dialog.confirm("确定要退出系统吗",function(){window.location="${ctx}/userAction.do?method=logout"});
		})
		diag.addButton("btn2","确定解锁",function(){
			top.document.getElementById("_DialogFrame_a1").contentWindow.validateForm();
		})
		$.post("${ctx}/userAction.do?method=lockScreen");
}

function validate(){
	
}
function changeSkin(themeColor,skinName){
	top.Dialog.confirm("确定应用该皮肤吗？",function(){
		document.getElementById("sessionSkin").src="${ctx}/system/layout/skin.jsp?skinName="+skinName+"&themeColor="+themeColor;
	})
}
$(function(){
/*
	if(broswerFlag!="IE6"){
		var cookTip=jQuery.jCookie('closeTip');
		if(!cookTip){
			$("#lbox").tip({content: "分隔条现在可以左右拖拽啦！<span class='red'><a onclick='closeTip()'>我知道了</a></span>。",distanceY:100,distanceX:10,arrowDirection:"left",width:160,showCloseBtn:true,onClose:function(){
				jQuery.jCookie('closeTip',"sure");
			}});
		}
	}
	*/
})
function closeTip(){
	jQuery.jCookie('closeTip',"sure");
	$("#lbox").hideTip();
}
function backHome(){
	document.getElementById("frmleft").contentWindow.homeHandler();
}
</script>
</head>
<body onload="validate()">
<div id="mainFrame">
<!--头部与导航start-->
<div id="hbox">
	<div id="bs_bannercenter">
	<div id="bs_bannerright">
	<div id="bs_bannerleft">	
		<div class="bs_function">
			<a href="${ctx }/index/default" target="frmright" onclick="backHome()"><span class="icon_home hand">首页</span></a>
			<span class="icon_exit hand" onclick='top.Dialog.confirm("确定要退出系统吗",function(){window.location="${ctx}/logout"});'>退出</span>
		</div>
		<div class="bs_userinfo">
			欢迎用户 guest 访问测试
		</div>
	</div>
	</div>
	</div>
	<div id="bs_navcenter">
	<div id="bs_navleft">
	<div id="bs_navright">
		<div class="bs_nav">
			<div class="float_left padding_top2 padding_left5 white">
				今天是
				<script>
					var weekDayLabels = new Array("星期日","星期一","星期二","星期三","星期四","星期五","星期六");
					var now = new Date();
				    var year=now.getFullYear();
					var month=now.getMonth()+1;
					var day=now.getDate()
				    var currentime = year+"年"+month+"月"+day+"日 "+weekDayLabels[now.getDay()]
					document.write(currentime)
				</script>
			</div>	
			<div class="float_left" style="padding:2px 0 0 20px;" id="positionContent"></div>	
			<div class="float_right padding_top2 padding_right5">
				<div class="bs_navleft">
					<li class="fontTitle">字号:</li>
					<li class="fontChange"><span><a href="javascript:;" setFont="16">大</a></span></li>
					<li class="fontChange"><span><a href="javascript:;" setFont="14">中</a></span></li>
					<li class="fontChange"><span><a href="javascript:;" setFont="12">小</a></span></li>
					<div class="clear"></div>	
				</div>	
				
				<div class="bs_navleft" style="padding-right:10px;">
					<li class="fontTitle">字体:</li>
					<li class="fontFamily"><span><a href="javascript:;" setFont="宋体">宋</a></span></li>
					<li class="fontFamily"><span><a href="javascript:;" setFont="微软雅黑">雅</a></span></li>
					<div class="clear"></div>	
				</div>	
				
				<span class="icon_fullscreen hand" id="fullSrceen" hideNav="true">全屏模式</span>
			</div>
			<div class="clear"></div>
		</div>
	</div>
	</div>
	</div>
</div>
<!--头部与导航end-->

 <div id="mainLayout" leftWidth="180">
    <div position="left">
			<div id="lbox">
				<div id="lbox_topcenter">
				<div id="lbox_topleft">
				<div id="lbox_topright">
					<div class="lbox_title">
						操作菜单
					</div>
				</div>
				</div>
				</div>
				<div id="lbox_middlecenter">
				<div id="lbox_middleleft">
				<div id="lbox_middleright">
						<div id="bs_left" style="width:100%;">
						<IFRAME height="100%" width="100%"  frameBorder=0 id=frmleft name=frmleft src="${ctx }/index/left"  allowTransparency="true"></IFRAME>
						</div>
						<!--更改左侧栏的宽度需要修改id="bs_left"的样式-->
				</div>
				</div>
				</div>
				<div id="lbox_bottomcenter">
				<div id="lbox_bottomleft">
				<div id="lbox_bottomright">
					<div class="lbox_foot"></div>
				</div>
				</div>
				</div>
			</div>
    </div>
    <div position="center">
   		<div class="ali01 ver01"  width="100%">
			<div id="rbox">
				<div id="rbox_topcenter">
				<div id="rbox_topleft">
				<div id="rbox_topright">
				</div>
				</div>
				</div>
				<div id="rbox_middlecenter">
				<div id="rbox_middleleft">
				<div id="rbox_middleright">
					<div id="bs_right">
					       <IFRAME height="100%" width="100%" frameBorder=0 id=frmright name=frmright src="${ctx }/index/default"  allowTransparency="true"></IFRAME>
					</div>
				</div>
				</div>
				</div>
				<div id="rbox_bottomcenter" >
				<div id="rbox_bottomleft">
				<div id="rbox_bottomright">

				</div>
				</div>
				</div>
			</div>
		</div>
    </div>
</div> 

<!--尾部区域start-->
<div id="fbox">
	<div id="bs_footcenter">
	<div id="bs_footleft">
	<div id="bs_footright">
		版权所有：<span class="underLine"><a href="http://www.quickui.net" target="_blank">http://www.quickui.net</a></span>
	</div>
	</div>
	</div>
</div>
</div>
<!--尾部区域end-->


<!--窗口任务栏区域start-->
<div id="dialogTask" class="dialogTaskBg" style="display:none;"></div>
<!--窗口任务栏区域end-->

<!--浏览器resize事件修正start-->
<div id="resizeFix"></div>
<!--浏览器resize事件修正end-->

<!--载进度条start-->
<div class="progressBg" id="progress" style="display:none;"><div class="progressBar"></div></div>
<!--载进度条end-->

<iframe id="sessionSkin" src="" width="0" height="0" style="display:none;"></iframe>
</body>
</html>
