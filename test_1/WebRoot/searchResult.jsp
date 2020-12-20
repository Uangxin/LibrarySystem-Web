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
				<table border="2" cellspacing="" cellpadding="" width="95%"  height="200px" id="resulttable">
					<thead>
						<tr>
							<th width="12%">流水号</th>
							<th width="12%">ID</th>
							<th width="12%">书名</th>
							<th width="12%">类别</th>
							<th width="12%">简介</th>
							<th width="12%">操作</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							
							<td><span>${currentBook.bookID-1}</span></td>
							<td><span>${currentBook.bookID}</span></td>
							<td><span>${currentBook.bookName}</span></td>
							<td><span>${currentBook.bookCategory}</span></td>
							<td><span>${currentBook.bookIntroduction}</span></td>
							<td><a href="borrow.jsp"  >借阅</a></td>
						</tr>	
					</tbody>
					
				</table>
				
				
				<div id="searchResulttail">
					
					<div id="pageSize">每页
						<select>
							<option value ="">5</option>
							<option value ="">10</option>
							<option value ="">20</option>
						</select>条,共
						<span id="total">
							
						</span>条数据,
						<span id="pageNumber">
							1
						</span>页/
						<span id="pageCount"></span>页
					</div>
					<div id="pageNav">
						<a href="#" id="first">首页</a>
						<a href="#" id="back">上一页</a>
						<a href="#" id="next">下一页</a>
						<a href="#" id="last">尾页</a>
					</div>
					
				</div>
			</div>
			
		</div>
	</body>
</html>


