<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <div  align="center">
       <form action="${pageContext.request.contextPath }/test/testList.action"  method="post">
          
          name:<input type="text" name="bookList[0].name">
           price:<input type="text" name="bookList[0].price">
            author:<input type="text" name="bookList[0].author">
            <hr>
            name:<input type="text" name="bookList[1].name">
           price:<input type="text" name="bookList[1].price">
            author:<input type="text" name="bookList[1].author">
            <hr>
            name:<input type="text" name="bookList[2].name">
           price:<input type="text" name="bookList[2].price">
            author:<input type="text" name="bookList[2].author">
       
           <br>
           <input type="submit">
       </form>
    
    </div>

</body>
</html>