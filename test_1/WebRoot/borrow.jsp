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
			
				<form action="borrowbook.do" method="post" id="borrowform">
					<input type="text" name="borrowbookID" id="borrowbookID" value="${currentBook.bookID}"   placeholder="借阅书籍ID"/>
					<input type="text" name="borrowbookName" id="borrowbookName" value="${currentBook.bookName}" placeholder="借阅书籍名称" />
					<input type="text" name="borrowuserName" id="borrowuserName" value="${currentUser.userName}" placeholder="读者ID" />
					<input type="text" name="borrowchaName" id="borrowchaName" value="${currentUser.chrName}"  placeholder="读者姓名"/>
					<input type="date" name="borrowtime" id="borrowtime" value="date" placeholder="借书时间"/>
					
					<br><br><br>
					<input type="submit" name="" id="jieyue" value="借阅" />
					<p>${info}</p>
					
					
				</form>
				
			</div>
			
		</div>
	</body>
</html>


