<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="/js/jquery-3.1.1.min.js"></script>
<title>Insert title here</title>
</head>
<body>

</body>
</html>
<script>
	$(document).ready(function() {
		$.ajax({
			url: 'user/regist',
			type: 'POST',
			// dataType: 'default: Intelligent Guess (Other values: xml, json, script, or html)',
			data: {userName: 'qwe',pwd:'ppp'},
		})
		.done(function() {
			console.log("success");
		})
		.fail(function() {
			console.log("error");
		})
		.always(function(e) {
			console.log(e);
		});
		
	});
</script>