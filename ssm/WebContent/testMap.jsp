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
       <form action="${pageContext.request.contextPath }/test/testMap.action"  method="post">
          
          name:<input type="text" name="map['name']">
           price:<input type="text" name="map['price']">
            author:<input type="text" name="map['author']">
       
           <br>
           <input type="submit">
       </form>
    
    </div>

</body>
</html>