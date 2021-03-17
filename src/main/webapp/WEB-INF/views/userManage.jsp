<%--
  Created by IntelliJ IDEA.
  User: xcp
  Date: 2020/11/30
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">用户管理系统</div><br>
<div style="margin-left: 63%"><button id="in" onclick="into()">办理入职</button></div>
<table border="1" align="center">
    <tr>
        <td>姓名</td>
        <td>年龄</td>
        <td>密码</td>
    </tr>
<c:forEach items="${users}" var="user">
<tr>
<td width="50">${user.name}</td>
<td width="50">${user.age}</td>
<td width="50">${user.password}</td>
    <td  width="200"><button id="out" onclick="out(${user.id})">办理离职</button>
        <button id="update" onclick="info(${user.id})">信息更新</button></td>
</tr>
</c:forEach>
</table>
</body>
<script>
        function into(){
            var url ="http://localhost:8080/demo/user/in";
            window.open(url,'_self');
        }
        function out(id) {
            var userId = id;
            var url ="http://localhost:8080/demo/user/out?id="+userId;
            window.open(url,'_self');
        }
        function indo(id) {
            var userId = id;
            var url ="http://localhost:8080/demo/user/updateInfo?id="+userId;
            window.open(url,'_self');
        }
</script>
</html>
