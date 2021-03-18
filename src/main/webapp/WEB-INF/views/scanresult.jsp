



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
        <caption>扫描结果</caption>
        <thead>
            <tr>
                <td>urlid</td>
                <td>url</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${dirlist}" var="c" varStatus="st">
                <tr>
                    <td>${c.urlid}</td>
                    <td>${c.dirurl}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
