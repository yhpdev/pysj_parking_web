<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Insert title here</title>
</head>
<body>
	<p>this is home page!</p>
	<!-- boostrap的div布局样式，栅格 -->
	<div class="container">
		<div class="row">
			<div class="col-md-2">
				<div >
					<button id="ajaxButton" onclick="ajaxGet()">Ajax Get例子</button>
				</div>
				<div id="content">
				</div>
			</div>
			<div class="col-md-2">
				<button id="ajaxButton" onclick="ajaxGet()">Ajax Post例子</button>
			</div>
			<div class="col-md-8"></div>
		</div>
	</div>

</body>

<!-- 注意引用顺序 -->
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/ajax.js"></script>
</html>