<%@page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" isELIgnored="false" %>
<%request.setCharacterEncoding("utf-8");%>
<%@include file="include/taglib.jsp"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>修改用户信息</title>
    <!-- 必须的 meta 标签 -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link  href="${ctxStatic}/bootstrap-4.6.0-dist/css/bootstrap.css"  type="text/css" rel="stylesheet"></link>

    <script src="${ctxStatic}/bootstrap-4.6.0-dist/js/bootstrap.js" type="text/javascript"></script>
    <script src="${ctxStatic}/bootstrap-4.6.0-dist/js/bootstrap.bundle.js" type="text/javascript"></script>
</head>
<body>
<div style="width: 500px;margin: 0px auto; text-align: center">


    <form role="form"  method="post" action="/demo/user/update" style="align">
        <input id="id" name="id" value="${user.id}" type="hidden">

        <div class="form-group">
            <label for="name" >姓名</label>
                <input type="text" class="form-control" id="name" name="name" value="${user.name}">
        </div>
        <div class="form-group">
            <label for="password" >密码</label>
                <input type="text" class="form-control" id="password" name="password" value="${user.password}">
        </div>
        <div class="form-group">
            <label for="age" >年龄</label>
                <input type="text" class="form-control" id="age" name="age" value="${user.age}">
        </div>


<%--        <div class="form-group">--%>
<%--            <label for="name">姓名</label>--%>
<%--            <input id="name" type="text" name="name" class="form-control" value="${user.name}" >--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <label for="password">密码</label>--%>
<%--            <input type="text" id="password" name="password" value="${user.password}" >--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <label for="age">年龄</label>--%>
<%--            <input id="age" name="age" value="${user.age}" type="text">--%>
<%--        </div>--%>
        <div class="form-group">

                <button type="submit" class="btn btn-default">提交</button>

        </div>
<%--        <button type="submit" class="btn btn-default">提交</button>--%>
    </form>

</div>
<script>

    <%--document.getElementById("name").value = ${user.name};--%>
    <%--document.getElementById("password").value = ${user.password};--%>
    <%--document.getElementById("age").value = ${user.age};--%>


</script>

</body>
</html>

