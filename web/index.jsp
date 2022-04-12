<%--
  Created by IntelliJ IDEA.
  User: mazhi
  Date: 2022/3/23
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>stackroom</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/bookservice/login" method="post">
    账号<input type="text" name="id" placeholder="学号">
    <br/>密码<input type="password" name="password" placeholder="密码">
    <br/>学生<input type="radio" name="identity" value="student">
    管理员<input type="radio" name="identity" value="manager">
    <br/><button type="submit" >登录</button><a href="${pageContext.request.contextPath}/bookservice/regist">注册</a>
  </form>
  <!--

    String id =(String) request.getParameter("id");
    String password=(String) request.getParameter("password");
    session.setAttribute("id",id);
    session.setAttribute("password",password);
    out.print(id);
    out.print(password);
  -->




  </body>
</html>
