function ajaxGet()
{
	$.ajax({
		type : "get",
		url : "demo/ajaxGetReq.do",
		dataType : "json",
		success : function(msg) {
			$("#content").append('<p>'+msg.code+'</p>');
		},
		error:function(msg)
		{
			
		}
	});
}

function ajaxPost()
{
	$.ajax({
		type : "post",
		data : data,
		url : "pheQuery.do",
		dataType : "json",
		success : function(msg) {
			
		}
	});
}