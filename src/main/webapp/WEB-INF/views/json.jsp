<%--
  Created by IntelliJ IDEA.
  User: xiecp33912
  Date: 2021/4/20
  Time: 19:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="include/taglib.jsp"%>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <script src="${ctxStatic}/bootstrap-3.3.7-dist/js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script>
    function testJson(){
        var name = $('#name').val();
        var password = $('#password').val();
        $.ajax({
<%--            ${pageContext.request.contextPath}--%>
            url:"${pageContext.request.contextPath}/user/testJson",
            type:"POST",
            data:JSON.stringify({name:name,password:password}),
            contentType:"application/json;charset=UTF-8",
            dataType:"json",
            success:function (data){
                if(data != null){
                    alert("您输入的用户名为："+data.name+"密码为："+data.password);
                }
            }
        });
    }
</script>
</head>

<body>
    <form >
        用户名：<input type="text" name="name" id="name" /><br/>
        密&nbsp;码:<input type="passwod" name="password" id="password" /><br/>
        <input type="button" value="测试JSON交互" onclick="testJson()">
    </form>
</body>
</html>