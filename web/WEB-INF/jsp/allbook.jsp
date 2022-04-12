<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: mazhi
  Date: 2022/3/29
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<table class="table table-hover table-striped">
    <a href="/bookservice/toaddbook">添加书籍</a>
    <thead>
    <tr>
        <th>名称</th>
        <th>作者</th>
        <th>数量</th>
        <th>描述</th>
        <th>位置</th>
        <th>借书日期</th>
        <th>还书日期</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="book" items="${list}">
        <tr>
            <td>${book.name}</td>
            <td>${book.author}</td>
            <td>${book.counts}</td>
            <td>${book.detial}</td>
            <td>${book.location}</td>
            <td>${book.outdate}</td>
            <td>${book.returndate}</td>
            <td>
                <!--?name=$book.name}author=$book.author}-->
                <a href="${pageContext.request.contextPath}/bookservice/toupdatebook/${book.name}/${book.author}">修改</a>
                &nbsp; | &nbsp;
                <a href="${pageContext.request.contextPath}/bookservice/deletebook/${book.name}">删除</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
