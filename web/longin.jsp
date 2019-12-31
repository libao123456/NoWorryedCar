<%--
  Created by IntelliJ IDEA.
  User: 84580
  Date: 2019/12/30
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="utf-8"/>
    <title>登录界面</title>
    <link rel="stylesheet" type="text/css" href="css/login.css"/>

</head>
<body>
<div id="header">
    欢迎来到登录界面
</div>
<div id="section">
    <form action="dex" method="post">
        用户名：<input type="text" name="uname" class="uname"><br>
        密&nbsp;&nbsp;&nbsp;码：<input type="password" name="upwd" class="upwd">
        <br>
        <input type="radio" name="auto_login" value="1" /> 自动登录
        <a herf="#">忘记密码？</a>
        <a href="#">注册</a>
        <input type="submit" value="登录" class="submit"  />
    </form>
</div>
<%@include file="buttom.html"%>
</body>
</html>
