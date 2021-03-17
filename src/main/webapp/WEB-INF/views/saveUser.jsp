<%@page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" isELIgnored="false" %>
<%request.setCharacterEncoding("utf-8");%>
<!DOCTYPE HTML>
<html>
<head>
    <title>Getting Started: Serving Web Content</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>

</head>
<body>
<form method="post" action="/demo/user/insert">
    <table>
        <tr>
            <td>姓名：</td>
            <td><input id="name" name="name" type="text"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input id="password" name="password" type="text"></td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td><input id="age" name="age" type="text"></td>
        </tr>
        <tr>
            <td><input type="submit" value="保存"></td>
        </tr>
    </table>
</form>
<script>
function show(){
    var x= document.getElementById("name");
    alert(x.value);
}

</script>
</body>
</html>

