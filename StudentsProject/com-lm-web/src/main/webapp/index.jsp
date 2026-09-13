
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>学生管理系统登录界面</title>
  </head>
  <body>
  <h1>学生管理系统登录界面</h1>
<form method="post">
  <div>
    <input type="text" name="username" id="usernameInput">
  </div>
  <div>
    <input type="password" name="password" id="passwordInput">
  </div>
  <div>
    <input type="button" value="登录" id="searchBtn">
  </div>
</form>
  </body>
  <script type="text/javascript" src="js/jquery-3.6.0.js"></script>
  <script type="text/javascript">
    $(function (){
      $("#searchBtn").click(function (){
        $.ajax({
          url:'login',
          type:'post',
          contentType:'application/x-www-form-urlencoded;charset=UTF-8',
          data:{
            username:$("#usernameInput").val(),
            password:$("#passwordInput").val(),
          },
          success:function (resp){
            if(resp==="1"){
              window.location.href="first.jsp"   //JavaScript 中用于页面跳转的代码。
            }else if (resp==="-1") {
              alert("账号不存在")
            }else {
              alert("账号或密码错误")
            }
          }
        })
      })
    })

  </script>

</html>
