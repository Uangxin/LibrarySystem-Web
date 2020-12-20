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
		<title>我的</title>
		<link rel="stylesheet" type="text/css" href="css/user.css"/>
		<link rel="stylesheet" type="text/css" href="css/search.css"/>
	</head>
	<body>
		
		<div id="userallDiv">
			<div id="userhead">
				<div id="searchhead">
					<div id="searchLogo">
						<img src="./img/LogoSmall.png" >
					</div>
					<div id="searchUser" >
						当前用户，<span>${currentUser.chrName}</span> &nbla;[a <a href="logout.do">安全退出</a>]
					</div>
					
				</div>
			</div>
			
			<div id="userbody">
				<form action="changepassword.do" method="post">
					<p><input type="text" name="userName" id="userName" value="" placeholder="学号" /></p>
					<p><input type="text" name="oldpassword" id="oldpassword" value="" placeholder="原密码" /></p>
					<p><input type="text" name="newpassword" id="newpassword" value="" placeholder="新密码" /></p>
					<p><input type="submit" name="" id="" value="提交" /></p>
					<p><button onclick="javascript:window.location.href='main.jsp';">返回</button></p>
					${info}
				</form>
				
			</div>
			
			
		</div>
		
	</body>
</html>
