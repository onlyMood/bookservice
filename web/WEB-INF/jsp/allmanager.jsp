<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: mazhi
  Date: 2022/3/30
  Time: 21:02
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
    <a href="${pageContext.request.contextPath}/bookservice/toaddmanager">添加管理员</a>
    <thead>
    <tr>
        <th>管理员账号</th>
        <th>密码</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="manager" items="${list}">
        <tr>
            <td>${manager.id}</td>
            <td>${manager.password}</td>
            <td>
                <a href="${pageContext.request.contextPath}/bookservice/deletemanager/${manager.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>