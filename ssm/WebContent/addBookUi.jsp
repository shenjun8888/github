<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <form action="${pageContext.request.contextPath }/BookController/addBookByPojo.action"  method="post">
       name:<input name="name"><br>
       price:<input name="price"><br>
       author:<input name="author"><br>
       <input type="submit"  value="添加">
    
    </form>

</body>
</html>