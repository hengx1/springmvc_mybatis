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
<%@include file="include/taglib.jsp"%>
<html>
<head>
    <title>用户列表</title>
<%--    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />--%>
    <!-- 必须的 meta 标签 -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<%--    <link  href="${ctxStatic}/bootstrap-4.6.0-dist/css/bootstrap.css"  type="text/css" rel="stylesheet"></link>--%>

<%--    <script src="${ctxStatic}/bootstrap-4.6.0-dist/js/bootstrap.js" type="text/javascript"></script>--%>
<%--    <script src="${ctxStatic}/bootstrap-4.6.0-dist/js/bootstrap.bundle.js" type="text/javascript"></script>--%>
</head>
<%
    String path = request.getContextPath();

%>
<body>
<%@include file="include/top.jsp"%>
<div style="width: 500px;margin: 0px auto; text-align: center">
    <table class="table table-striped" align="center" >
        <caption>用户信息表</caption>
        <thead>
            <tr>
                <td>id</td>
                <td>name</td>
                <td>password</td>
                <td>age</td>
                <td>编辑</td>
                <td>删除</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${userList}" var="c" varStatus="st">
                <tr>
                    <td>${c.id}</td>
                    <td>${c.name}</td>
                    <td>${c.password}</td>
                    <td>${c.age}</td>
                    <td><a href="<%=path %>/user/edit/${c.id}">edit</a></td>
                    <td><a href="">delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <div style="text-align: center">
        <a href="?start=0">首页</a>
        <c:if test="${page.start-page.count >=0 }">
            <a href="<%=path %>/user/list1?start=${page.start-page.count}">上一页</a>
        </c:if>
        <c:if test="${page.last - page.start > 0 }">
            <a href="<%=path %>/user/list1?start=${page.start+page.count}">下一页</a>
        </c:if>

        <a href="<%=path %>/user/list1?start=${page.last}">末页</a>
    </div>

</div>


</body>
</html>
