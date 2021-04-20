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
<%--    <form  method="post" action="/demo/sec/fileUpload" enctype="multipart/form-data">--%>
<%--        <h1>采用multipart提供的file.transfer 方法上传文件</h1>--%>
<%--        <input class="form-control" type="file" name="file" />--%>
<%--        <input type="submit" value="上传" />--%>
<%--    </form>--%>

    <form role="form" method="post" action="/demo/sec/fileUpload" enctype="multipart/form-data">
        <div class="form-group">
            <label for="name">名称</label>
            <input type="text" class="form-control" id="name" placeholder="请输入名称">
        </div>
        <div class="form-group">
            <label for="inputfile">文件输入</label>
            <input type="file" name="file" id="inputfile">
            <p class="help-block">这里是块级帮助文本的实例。</p>
        </div>
        <div class="checkbox">
            <label>
                <input type="checkbox">请打勾
            </label>
        </div>
        <button type="submit" class="btn btn-default">提交</button>
    </form>

</div>



</body>
</html>
