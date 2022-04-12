<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: mazhi
  Date: 2022/4/1
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>allstudent</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<table class="table table-hover table-striped">
    <a href="${pageContext.request.contextPath}/bookservice/toaddstudent">添加学生</a>

    <thead>
        <tr>
            <th>学生账号</th>
            <th>密码</th>
            <th>操作</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach var="student" items="${list}">
        <tr>
            <td>${student.id}</td>
            <td>${student.password}</td>
            <td>
                <a href="${pageContext.request.contextPath}/bookservice/resetpassword/${student.id}">重置密码</a>
                 &nbsp; | &nbsp;
                <a href="${pageContext.request.contextPath}/bookservice/deletestudent/${student.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
