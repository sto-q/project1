
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生</title>
</head>
<body>
<h2>添加学生</h2>
<form action="addStudent" method="post">
    <div>
        学号:<input type="number" name="student_no" required>
    </div>
    <div>
        姓名:<input type="text" name="name" required> <%--required表示必填项--%>
    </div>
    <div>
        性别:
        <select name="gender">
            <option value="男">男</option>
            <option value="女">女</option>
        </select>
    </div>
    <div>
        年龄：<input type="number" name="age" required>
    </div>
    <div>
        班级：<input type="text" name="class_name" required>
    </div>
    <div>
        专业：<input type="text" name="major" required>
    </div>
    <div>
        <input type="submit" value="提交">
        <a href="show">返回列表</a>
    </div>
</form>
</body>
</html>
