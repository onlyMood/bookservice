<%--
  Created by IntelliJ IDEA.
  User: mazhi
  Date: 2022/3/31
  Time: 22:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>toaddmanager</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<form action="${pageContext.request.contextPath}/bookservice/addmanager" method="post">
    <div class="form-group">
        <label>管理员账号</label>
        <input type="text" name="id" class="form-control" required>
    </div>
    <div class="form-group">
        <label>管理员密码</label>
        <input type="text" name="password" class="form-control" required>
    </div>
    <div class="form-group">
        <input type="submit" class="form-control" value="添加" >
    </div>

</form>
</body>
</html>
