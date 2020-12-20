<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>图书检索</title>
		<link rel="stylesheet" type="text/css" href="css/search.css"/>
	</head>
	<body>
		<div id="searchDivall">
			<div id="searchhead">
				<div id="searchLogo">
					<img src="./img/LogoSmall.png" >
				</div>
				<div id="searchUser">
					当前用户，<span>${currentUser.chrName}</span>&nbsp;[<a href="logout.do">安全退出</a>]
				</div>
			</div>
			
			<div id="searchsbody">
				<div id="searchinput">
					<form action="searchtext.do" method="post">
						<p><input type="text" name="searchtext" id="searchtext" value="" placeholder="检索词关键词" /></p>
						<br>
						<p><input type="submit" value="检&nbsp索" id="searchbutton"/></p>
					</form>
					${info}
				</div>
				<div id="searchimgshow">
					<img src="img/searchimgshow.jpg" >
				</div>
			</div>
			
			
		</div>
		<div id="searchtail">
				<p>热门图书展示</p>
		</div>	
	</body>
</html>
