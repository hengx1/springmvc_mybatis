<%--
  Created by IntelliJ IDEA.
  User: xiecp33912
  Date: 2021/3/13
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<link  href="${ctxStatic}/bootstrap-3.3.7-dist/css/bootstrap.css"  type="text/css" rel="stylesheet"></link>

<script src="${ctxStatic}/bootstrap-3.3.7-dist/js/bootstrap.js" type="text/javascript"></script>
<script src="${ctxStatic}/bootstrap-3.3.7-dist/js/jquery-3.5.1.min.js" type="text/javascript"></script>
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="<%=request.getContextPath()%>/user/list1">hengx</a>
        </div>
        <div>
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">test1</a></li>
                <li class="active"><a href="#">SVN</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        Sec
                        <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="<%=request.getContextPath()%>/sec/index">目录扫描</a></li>
                        <li><a href="<%=request.getContextPath()%>/sec/urllist">扫描结果</a></li>
                        <li><a href="#">Jasper Report</a></li>
                        <li class="divider"></li>
                        <li><a href="#">分离的链接</a></li>
                        <li class="divider"></li>
                        <li><a href="#">另一个分离的链接</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>
