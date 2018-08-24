<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <form action="${pageContext.request.contextPath }/BookController/addBookByPojoVo.action"  method="post">
       name:<input name="book.name"><br>
       price:<input name="book.price"><br>
       author:<input name="book.author"><br>
       <input type="submit"  value="添加">
    
    </form>

</body>
</html>