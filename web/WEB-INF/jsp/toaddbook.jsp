<%--
  Created by IntelliJ IDEA.
  User: mazhi
  Date: 2022/3/31
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>toaddbook</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<form action="${pageContext.request.contextPath}/bookservice/addbook" method="post">
    <div class="form-group">
        <label>书籍名称</label>
        <input type="text" name="name" class="form-control" required>
    </div>
    <div class="form-group">
        <label>书籍作者</label>
        <input type="text" name="author" class="form-control" required>
    </div>
    <div class="form-group">
        <label>书籍数量</label>
        <input type="text" name="counts" class="form-control" required>
    </div>
    <div class="form-group">
        <label>书籍描述</label>
        <input type="text" name="detial" class="form-control" required>
    </div>
    <div class="form-group">
        <label>书籍位置</label>
        <input type="text" name="location" class="form-control" required>
    </div>
    <div class="form-group">
        <input type="submit" class="form-control" value="添加" >
    </div>

</form>
</body>
</html>
