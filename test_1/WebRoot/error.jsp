<%@ page language="java"  pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>出错了</title>
		<link rel="stylesheet" href="css/error.css" />
		<script  src="js/error.js"></script>
		<style type="text/css">
			
			#error2{
				background-color: #738856;
			}
		</style>
	</head>
	<body>
		<div id="errorDiv">
			<div id="errorHit">
				<p id="errorInfo">${info}</p>
				<p><span id="leaveTime">10</span>秒后自动返回到登录页面</p>
				<p>不能跳转，请<a href="login.html">点击这里</a></p>
			</div>
			<div align="center" margin="200px">
			<img alt="" src="img/error.png">
			</div>
			
		</div>
	</body>
</html>
