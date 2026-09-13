
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%-- isELIgnored="false" 启用 EL 表达式，${student.id} 会被解析并替换为实际值--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学生管理系统</title>
</head>
<body>
<a href="show">展示所有学生</a>
<a href="addStudent.jsp">添加学生</a>
<a href="updateStudent.jsp">修改学生</a>
</body>
</html>
