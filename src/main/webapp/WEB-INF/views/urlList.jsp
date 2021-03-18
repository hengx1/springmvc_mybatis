



<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*,java.text.*" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<%@include file="include/taglib.jsp"%>
<html>
<head>
    <title>URL列表</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
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
                <td>URL名称</td>
                <td>创建日期</td>
                <td>查看</td>
                <td>删除</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${urllist}" var="c" varStatus="st">
                <tr>
                    <td>${c.id}</td>
                    <td>${c.urlname}</td>
                    <td>${c.createdate}</td>
                    <td><a href="<%=path %>/user/edit/${c.id}">edit</a></td>
                    <td><a href="">delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <div style="text-align: center">
        <a href="?start=0">首页</a>
        <c:if test="${page.start-page.count >=0 }">
            <a href="<%=path %>/sec/urllist?start=${page.start-page.count}">上一页</a>
        </c:if>
        <c:if test="${page.last - page.start > 0 }">
            <a href="<%=path %>/sec/urllist?start=${page.start+page.count}">下一页</a>
        </c:if>

        <a href="<%=path %>/sec/urllist?start=${page.last}">末页</a>
    </div>

</div>


</body>
</html>
