<%--
  Created by IntelliJ IDEA.
  User: xcp
  Date: 2020/11/22
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>用户列表</title>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
</head>
<body>
<p>${cs1}</p>
<table align="center" border="1" cellspacing="0">
    <tr>
        <td>id</td>
        <td>age</td>
        <td>name</td>
        <td>password</td>
    </tr>
    <c:forEach items="${cs}" var="c" varStatus="st">
        <tr>
            <td>${c.id}</td>
            <td>${c.age}</td>
            <td>${c.name}</td>
            <td>${c.password}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
