<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
</head>
<body>
    <button onclick="f1();">按钮</button>
</body>
 <script type="text/javascript">
 
      function f1(){
    	  $.ajax({
    		  type:"post",
    		  uri:"${pageContext.request.contextPath}//userController/findUser.action",
    		  contentType:"application/josn;charset=utf-8",
    		  data:'{"name":"张三","age":20}',
   		       success:function(returnData){
   			   alert(returnData.id);
   			   alert(returnData.address);
   		   }
    	  })
    	  
    	  
      }
 
 
 </script>
 
</html>