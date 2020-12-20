function changeImg(){
	document.getElementById("vcodeImg").src = "createVerifyImage.do?t=" + Math.random();
}
//
//var xmlHttp;
//function creativeXml(){
//	if(window.XMLHttpRequest){
//		xmlHttp = new XMLHttpRequest();
//	}
//	else {
//		xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
//	}
//}
//
//var userName_correct = false;
//var paaaword_correct = false;
//var vcode_correct = false;
//
//function ajaxCheckLogin(){
//	if(!userName_correct || !password_correct || !vcode_correct){
//		$("#userName").blur();
//		$("#password").blur();
//		$("#vcode").blur();
//		return;
//	}
//	
//	var userName = document.getElementById("userName").value;
//	var password = document.getElementById("paaword").value;
//	var vcode = document.getElementById("vcose").value;
//	var data = "userName=" + userName +"&password=" + password + "&vcode=" + vcode;
//	if(document.getElementById("autoLogin").checked)
//		data = data +"&autoLogin=y";
//	
//	createXmlHttp();
//	
//	xmlHttp.open("post", "ajaxLoginCheck.do",true);
//	xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
//	xmlHttp.send(data);
//	
//	xmlHttp.onreadystatechange = function(){//回调函数
//		if(xmlHttp.readyState = 4 && xmlHttp.status == 200){
//			var response = xmlHttp.responseText;
//			var json = JSON.parse(response);//调用系统函数将字符串转化为json对象
//			if(json.code == 0){//登录成功
//				window.location.href = "main.jsp";
//			}
//			else{
//				document.getElementById("checkError").innerText = json.info;
//			}
//		}
//	}
//}
//
//function jqAjaxCheckLogin(){
//	$.ajax({
//		type:"post",
//		url:"ajacLoginCheck.do",
//		data:{ uesrName: $("#userName").val(), password: $("#password").val(), vcode:$("#vcode").val  },
//		dataType:"json",
//		success: function(response){
//			if(response.code == 0){
//				window.location.href = "main.jsp";
//			}
//			else{
//				$("#checkError").text(response.info);
//			}
//		}
//	});
//}