<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>success page</title>
</head>
<body>
	<h1>Success!!!</h1>
	商品：${good}
	 
<table class="table table-hover">
     <thead>
      <tr>
       <th>ID</th>
       <th>名称</th>
       <th>库存</th>
       <th>价格</th>
       <th>操作</th>
      </tr>
     </thead>
      
     <tbody>
      <c:forEach var="sk" items="${good}">
       <tr>
        <td>${sk.id}</td>
        <td>${sk.name}</td>
        <td>${sk.price}</td>
        <td>${sk.quantity}</td>
        <td><a href="<%=request.getContextPath() %>/deletebyid?id=${sk.id}">删除</a></td>
        
       </tr>
      
      </c:forEach>
     </tbody>
    </table>

</body>
</html>