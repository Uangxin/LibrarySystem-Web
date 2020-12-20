window.setInterval(changeLeavaTime,1000);

function changeLeavaTime()
{
	var time=parseInt(document.getElementById("leaveTime").innerText);
	time = time - 1;
	if (time==0)
	{
		window.location.href = "login.html";
	}
	else
	{
		document.getElementById("leaveTime").innerText=time;
	}
}