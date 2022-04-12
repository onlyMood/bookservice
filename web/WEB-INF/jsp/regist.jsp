<%--
  Created by IntelliJ IDEA.
  User: mazhi
  Date: 2022/3/28
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>regist</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/bookservice/registverify" method="post">
    账号<input type="text" name="id" placeholder="学号">
    <br/>密码<input type="password" name="password" placeholder="密码">
    <br/>确认密码<input type="password" name="passwordagain" placeholder="确认密码">
    <br/><button type="submit">注册</button>

</form>
</body>
</html>
