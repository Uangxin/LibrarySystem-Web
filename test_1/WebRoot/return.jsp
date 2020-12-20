<!-- <%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>还书</title>
		<link rel="stylesheet" type="text/css" href="css/search.css"/>
	</head>
	<body>
		<div id="searchDivall">
			<div id="searchhead">
				<div id="searchLogo">
					<img src="./img/LogoSmall.png" >
				</div>
				<div id="searchUser">
					当前用户，<span>${currentUser.chrName}</span> &nbsp;[<a href="logout.do">安全退出</a>]
				</div>
			</div>
			
			<div id="searchsbody">
				<div id="searchinput">
					<form action="returncheck.do" method="post">
						<p><input type="text" name="searchtext" id="searchtext" placeholder="输入要归还书籍ID" /></p>
						<br>
						<p><input type="submit" value="还&nbsp书" id="searchbutton" /></p>
					</form>
				</div>
				<div id="searchimgshow">
					<img src="img/searchimgshow.jpg" >
				</div>
			</div>
			
			
		</div>
		<div id="searchtail">
				<p></p>
		</div>	
	</body>
</html>
