
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%-- isELIgnored="false" 启用 EL 表达式，${student.id} 会被解析并替换为实际值--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>学生管理信息</title>
</head>
<body>
<%--<c:forEach items="${show}" var="student">--%>
<%--  <li>--%>
<%--    学生ID:${student.id}&nbsp;&nbsp;学号:${student.student_no}&nbsp;&nbsp;名字:${student.name}&nbsp;&nbsp;--%>
<%--    性别:${student.gender}&nbsp;&nbsp;年龄:${student.age}&nbsp;&nbsp;专业班级:${student.class_name}&nbsp;&nbsp;&nbsp;专业:${student.major}--%>
<%--  </li>--%>
<%--</c:forEach>--%>
<c:forEach items="${show}" var="student">
  <tr>
    <td>${student.id}</td>
    <td>${student.student_no}</td>
    <td>${student.name}</td>
    <td>${student.age}</td>
    <td>${student.gender}</td>
    <td>${student.class_name}</td>
    <td>${student.major}</td>
    <td>
<%--        &lt;%&ndash; 修改：带着学生ID去查询，然后跳转到修改页面 &ndash;%&gt;--%>
<%--      <a href="updateStudent?id=${student.id}">修改</a>--%>

        <%-- 删除：带着学生ID去删除 --%>
      <a href="deleteStudent?id=${student.id}"
         onclick="return confirm('确定删除吗？')">删除</a>
    </td>
  </tr>
</c:forEach>
<div>
  <a href="first.jsp">返回列表</a>
</div>
</body>
</html>
