<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <form action="${pageContext.request.contextPath }/test/testArr.action" method="post">
     <input type="checkbox" name="ids"  value="1">1
      <input type="checkbox" name="ids"  value="2">2
       <input type="checkbox" name="ids"  value="3">3
        <input type="checkbox" name="ids"  value="4">4
        <input type="submit"  value="提交">
   </form>
</body>
</html>