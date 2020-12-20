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
				<div id="uesebar">
					<form action="" method="" id="userform" >
					<br>
					<p><a href="user.jsp" >我的信息</a></p>
					<p><a href="history.jsp">历史记录</a></p>
					<p><a href="ChangePassword.jsp">修改密码</a></p>
					</form>
					
				</div>
				<div id="userinform">
					
				</div>
				
			</div>
			
			
		</div>
		
	</body>
</html>
