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
		<link rel="stylesheet" type="text/css" href="css/searchResult.css"/>
		<link rel="stylesheet" type="text/css" href="css/borrow.css"/>
		<script src="js/table.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/jquery-3.5.0.min.js" type="text/javascript" charset="utf-8"></script>
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
			
				<form action="returnbook.do" method="post" id="borrowform">
					<input type="text" name="borrowbookID" id="borrowbookID" value=""   placeholder="借阅书籍ID"/>
					<input type="text" name="borrowuserName" id="borrowuserName" value="" placeholder="读者ID" />
					<br><br><br>
					<input type="submit" name="" id="jieyue" value="还回" />
					<p>${info}</p>
					
					
				</form>
				
			</div>
			
		</div>
	</body>
</html>


`<111>	</111>