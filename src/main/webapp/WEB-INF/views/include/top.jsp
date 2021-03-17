<%--
  Created by IntelliJ IDEA.
  User: xiecp33912
  Date: 2021/3/13
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="<%=request.getContextPath()%>/user/list1">hengx</a>
        </div>
        <div>
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">IOS</a></li>
                <li class="active"><a href="#">SVN</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        Java
                        <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="#">jmeter</a></li>
                        <li><a href="#">EJB</a></li>
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
