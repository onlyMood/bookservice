<%--
  Created by IntelliJ IDEA.
  User: mazhi
  Date: 2022/3/31
  Time: 19:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>toupdatebook</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<form action="${pageContext.request.contextPath}/bookservice/updatebook" method="post">
    <input type="hidden" name="name" value="${book.name}">
    <div class="form-group">
    <label>书籍名称</label>
        <input type="text" name="name" class="form-control" value="${book.name}" disabled>
    </div>
    <div class="form-group">
        <label>书籍作者</label>
        <input type="text" name="author" class="form-control" value="${book.author}" disabled>
    </div>
    <div class="form-group">
    <label>书籍数量</label>
        <input type="text" name="counts" class="form-control" value="${book.counts}" required>
    </div>
    <div class="form-group">
        <label>书籍描述</label>
        <input type="text" name="detial" class="form-control" value="${book.detial}" required>
    </div>
    <div class="form-group">
        <label>书籍位置</label>
        <input type="text" name="location" class="form-control" value="${book.location}" required>
    </div>
    <div class="form-group">
        <input type="submit" class="form-control" value="修改" >
    </div>

</form>
</body>
</html>
