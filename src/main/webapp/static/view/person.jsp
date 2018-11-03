<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <button type="button">按钮001</button>
</body>

<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
  $(":button:first").click(function(){
	  $.ajax({
		  url:"${pageContext.request.contextPath}/demo/getPerson.action",
		  data:'{"userName":"向鹏飞","gender":"female"}',
		  type:"POST",
		  contentType:"application/json;charset=utf-8",
		  success:function(callData,status,xhr){
			  alert(callData.userName);
			  alert(status);
			  alert(xhr.status);
			  alert(xhr.responseText);
		  }
		  
		  
		  
	  })
	  
	  
	  
  })

</script>
</html>