<%--
  Created by IntelliJ IDEA.
  User: 84580
  Date: 2019/12/25
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link rel="stylesheet" href="css/new_file.css">
  </head>
  <body id="back">
  <div style="height:150px;"></div>
  <form enctype="multipart/form-data">
    <div style="width:500px;margin:0 auto;">
      <div style="font-size:28px;">注册新用户</div>
      <br />
      <span class="p">*</span>
      <label for="username" class="l">用户名:&nbsp;</label>
      <div style="height:35px;width:300px;position:relative;display:inline;">
        <input id="username" type="text" style="height:30px;width:250px;padding-right:50px;">
        <span style="position:absolute;right:18px;top:2px;height:16px;width:16px;display:inline-block;"></span>
      </div>
      <br /><br />

      <label for="username" class="l">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;性&nbsp;&nbsp;&nbsp;别：</label>
      <input type="radio" name="sex" value="1" checked="" style="height:20px;width:20px;padding-right:20px; margin-top:10px; ">男
      &nbsp;&nbsp;&nbsp;<input name="sex" value="0" type="radio" style="height:20px;width:20px;padding-right:20px; margin-top:10px;">女<br>
      <br />
      <label for="username" class="l">&nbsp;&nbsp;&nbsp;&nbsp;选择身份:</label>
      <input name="h" type="radio" value="老师" style="height:20px;width:20px;padding-right:20px; margin-top:10px;">老师
      <input name="h" type="radio" value="学生" style="height:20px;width:20px;padding-right:20px; margin-top:10px;">学生
      <input name="h" type="radio" value="家长" style="height:20px;width:20px;padding-right:20px; margin-top:10px;">家长
      <input name="h" type="radio" value="司机" style="height:20px;width:20px;padding-right:20px; margin-top:10px;">司机
      <br /><br />
      <span class="c">*</span>
      <label for="login_password" class="l">登录密码:</label>
      <div class="d">
        <input id="login_password" type="password" class="i">
      </div>
      <br /><br />
      <span class="c">*</span>
      <label >身份证:&nbsp;&nbsp;&nbsp;&nbsp;</label>
      <div class="d">
        <input id="confirm_password1" type="text" maxlength="18"  class="i">
      </div>
      <br /><br />
      <span class="c">*</span>
      <label  >电话号码:</label>
      <div class="d">
        <input id="confirm_password2" type="text" maxlength="11" class="i"
               name="phoneNum" />
      </div>
      <br /><br />
      <span class="c">*</span>
      <label >车牌号码:</label>
      <div class="d">
        <input id="confirm_password3" type="text" class="i">
      </div>
      <br /><br />
      <span class="c">*</span>

      <label >邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱:</label>
      <div class="d">
        <input type="email" id="confirm_password4" class="i" />
      </div>
      <br /><br />
      <label>&nbsp;&nbsp;&nbsp;年&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;龄:</label>
      <div class="d">
        <input type="number" id="confirm_password5" class="i" max="90" min="0" step="1"   />
      </div>
      <br /><br />
      上传头像：<input type="file" value=""  ><br>
      <br /><br />
      <input type="checkbox" name="agree" style="margin-left:100px;display:inline-block;" value="1" />
      <span style="font-size:10px;">我已阅读并同意《用户注册协议》</span>
      <br /><br />
      <input type="submit" value="同意以上协议并注册" style="margin-left:100px;height:30px;width:300px;background-color:red;display:inline-block;" />
    </div>
  </form>

<%@include file="buttom.html"%>
  </body>

</html>
