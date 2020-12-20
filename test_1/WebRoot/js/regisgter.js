function fillProvinnce(){
	$.ajax({
		type:"post",
		url:"queryProvinceCity.do",
		data:{},
		dataType:"json",
		success:function(response){
			var provinceElement = document.getElementById("province");
			
			provinceElement.options.length = 0;
			
			provinceElement.add(new Option("请选择省份",""));
			
			for(index = 0; index < response.length; index++){
				provinceElement.add(new Option(response[index].provinceName,
				response[index].provinceCode));
			}
		}
	});
}

$(document).ready(function(){
	fillProvinnce();
	$("#province").change(function(e){
		$("#city").empty();
		$("#city").append($("<option>").val("").text("请选择城市"));
		if ($(this).val() == "") {
			$("#provinceError").css("color","#c00202")
			$("#provinceError").text("必须选择省份！");
			return;
		}
		province_correct = true;
		$("#provinceError").text("");
		
	var provinceCode = $("#province").val();
		$.ajax({
			type:"post",
			url:"queryProvinceCity.do",
			data:{provinceCode:provinnceCode},
			dataType:"json",
			success:function(response){
				for(index=0; index<response; index++){//循环向下拉框中输出数据库中查询到返回的省份名字
					var option =$("<option>").val(response[index].cityCode).text(response[index].cityName);
					$("#city").append(option);
				}
			}
		});
	
	});
})

