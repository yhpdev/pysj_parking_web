
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<link rel="shortcut icon" href="../img/icon/favicon.ico">
<title>404|乎拉</title>
<link rel="stylesheet" type="text/css" />
<style>
*{margin:0;padding:0}
body{font-family:"微软雅黑";background:#DAD9D7}
img{border:none}
a *{cursor:pointer}
ul,li{list-style:none}
table{table-layout:fixed;}
table tr td{word-break:break-all; word-wrap:break-word;}

a{text-decoration:none;outline:none}
a:hover{text-decoration:underline}
.cf:after{content: ".";display: block;height: 0;font-size: 0;clear:both;visibility: hidden;}
.cf{zoom: 1;clear:both}

.bg{width:100%;background:url("/hula/StaticView/error/404/01.jpg") no-repeat center top #DAD9D7;position:absolute;top:0;left:0;height:600px;overflow:hidden}
.cont{margin:0 auto;width:500px;line-height:20px;}
.c1{height:360px;text-align:center}
.c1 .img1{margin-top:180px}
.c1 .img2{margin-top:165px}
.cont h2{text-align:center;color:#555;font-size:18px;font-weight:normal;height:35px}
.c2{height:70px;text-align:center}
.c2 a{display:inline-block;margin:0 4px;font-size:20px;height:50px;color:blue;padding-top:1px;text-decoration:none;text-align:left}
.c3{height:180px;text-align:center;color:#999;font-size:15px}
#bf{position:absolute;top:269px;left:0;width:100%}
.bf1{margin:0 auto;width:99px;padding-left:32px}
.bd{height:600px;overflow:hidden}
#box{position:absolute;top:165px;left:0;width:100%;text-align:center}
.bf1{margin:0 auto;width:99px;padding-left:32px} 
</style>
</head>
<body>
<div class="bg">
	<div class="cont">
		<div class="c1"><img src="../img/404/01.png" class="img1" /></div>
		<h2>您访问的页面出错了</h2>
		<div class="c2"><a href="/hula/index/home.do?uid=${sessionScope.userInfo.uid}" class="home">点击这里返回乎拉网主页</a></div>
		<BR>
		<div class="c3">您可能输入了错误的网址，或者该网页已删除或移动</div>
	</div>
</div>
</body>
</html>