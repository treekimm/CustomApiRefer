<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
</head>
<body>

</body>
<script>
var result ;
	$(document).ready(function(){
		$.ajax({
		  method: "POST",
		  url: "/controllerList",
		  data: "",
		  dataType : "json"
		})
		  .success(function(data) {
			  result = data;
		  });
	});
</script>
</html>