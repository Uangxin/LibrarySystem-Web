<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<link rel="stylesheet" type="text/css" href="css/main.css"/>
		
		<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
		<script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
		<script src="https://cdn.staticfile.org/popper.js/1.15.0/umd/popper.min.js"></script>
		<script src="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
		
		<title>My图书馆</title>
	</head>
	<body>
		<div id="container">
			<div id="header">
				<div id="rightTop">
					当前用户：<span>${currentUser.chrName}</span> &nbsp;[<a href="logout.do">安全退出</a>]
					
				</div>
				<div id="mainLogo">
					<img src="./img/LogoSmall.png" >
				</div>
				<div id="menu">
					<ul>
						<li><a href="#">概括</a></li>
						<li class="menuDiv"></li>
						<li><a href="search.jsp">资源</a></li>
						<li class="menuDiv"></li>
						<li><a href="#">帮助</a></li>
						<li class="menuDiv"></li>
						<li><a href="user.jsp">我的主页</a></li>
						<li class="menuDiv"></li>
						<li><a href="#">导航</a></li>
						<li class="menuDiv"></li>
						<li><a href="#">关于</a></li>
					</ul>
				</div>
				
				
			</div>
			<div id="banner">
					<div id="lunbo">
						<div id="demo" class="carousel slide" data-ride="carousel">
						 
						  <!-- 指示符 -->
						  <ul class="carousel-indicators">
							<li data-target="#demo" data-slide-to="0" class="active"></li>
							<li data-target="#demo" data-slide-to="1"></li>
							<li data-target="#demo" data-slide-to="2"></li>
						  </ul>
						 
						  <!-- 轮播图片 -->
						  <div class="carousel-inner">
							<div class="carousel-item active">
							  <img src="img/lunbo1.jpg">
							  
							</div>
							<div class="carousel-item">
							  <img src="img/lunbo2.jpg">
							</div>
							<div class="carousel-item">
							  <img src="img/lunbo3.jpg">
							</div>
						  </div>
						 
						  <!-- 左右切换按钮 -->
						  <a class="carousel-control-prev" href="#demo" data-slide="prev">
							<span class="carousel-control-prev-icon"></span>
						  </a>
						  <a class="carousel-control-next" href="#demo" data-slide="next">
							<span class="carousel-control-next-icon"></span>
						  </a>
						 
						</div>
					
					</div>
					<div id="mainThree">
						<div id="Three1search">
							<p><a href="search.jsp" font-size="20">检索</a></p>
						</div>
						<div id="Three2return">
							<p><a href="return.jsp" font-size="20">还书</a></p>
						</div>
						<div id="Three3message">
							<p><p><a href="search.jsp" font-size="20">通知</a></p></p>
						</div>
					</div>
			</div>
			<div id="mainTail">
				
			</div>
			<div id="notneed">
				<p>Copyright © 2015-2017 武汉纺织大学图书馆.All Rights Reserved.</p>
				<p> 南湖校区：湖北省武汉市洪山区纺织路1号      电话：027-59363591 邮编：430073</p>     
				<p>阳光校区：湖北省武汉市江夏区阳光大道特1号      电话、传真：027-59367241 邮编：430200</p>
				<p>东湖校区：武汉市武昌区东湖梨园渔光村1号      电话：027-59367183  邮政编码：430077</p>
			</div>
		</div>
		
	</body>
</html>
