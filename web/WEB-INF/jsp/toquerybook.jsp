<%--
  Created by IntelliJ IDEA.
  User: mazhi
  Date: 2022/3/28
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>querybook</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/bookservice/querybook" method="post">
    <input type="text" name="query" placeholder="请输入">
    <br/>书名<input type="radio" name="key" value="name">
    作者<input type="radio" name="key" value="author">
    <br/><button type="submit">查询</button>
</form>
<h1>欢迎登录，赶快查找自己感兴趣的图书吧！</h1>

</body>
</html>
