<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: mazhi
  Date: 2022/4/2
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>bookshow</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<table class="table table-hover table-striped">
    <thead>
    <tr>
        <th>名称</th>
        <th>作者</th>
        <th>数量</th>
        <th>描述</th>
        <th>位置</th>
        <th>借书|还书</th>
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
            <td>
                <a href="${pageContext.request.contextPath}/bookservice/borrowbook/${book.name}/${book.author}">借书</a>
                &nbsp; | &nbsp;
                <a href="${pageContext.request.contextPath}/bookservice/returnbook/${book.name}/${book.author}">还书</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
