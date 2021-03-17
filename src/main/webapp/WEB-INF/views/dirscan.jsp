<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="include/taglib.jsp"%>
<html>
<link>
    <title>Dir Scan</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
 </head>
<body>
<%@include file="include/top.jsp"%>

<div style="width: 800px;margin: 0px auto; text-align: center">
    <form  method="post" action="/demo/sec/scaning">
        <input class="form-control" type="text" name="urlname" placeholder="请输入要探测的url...">
        <input type="submit" value="探测">

    </form>
</div>



</body>
</html>
