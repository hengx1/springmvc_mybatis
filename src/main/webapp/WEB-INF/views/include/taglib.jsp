<%--<%@ taglib prefix="shiro" uri="/WEB-INF/tlds/shiros.tld" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--<%@ taglib prefix="fns" uri="/WEB-INF/tlds/fns.tld" %>--%>
<%--<%@ taglib prefix="sys" tagdir="/WEB-INF/tags/sys" %>--%>
<%--<%@ taglib prefix="sec" tagdir="/WEB-INF/tags/sec" %>--%>
<%--<c:set var="ctx" value="${pageContext.request.contextPath}${fns:getAdminPath()}"/>--%>
<c:set var="ctxStatic" value="${pageContext.request.contextPath}/static"/>
<link  href="${ctxStatic}/bootstrap-3.3.7-dist/css/bootstrap.css"  type="text/css" rel="stylesheet"></link>

<script src="${ctxStatic}/bootstrap-3.3.7-dist/js/bootstrap.js" type="text/javascript"></script>
<script src="${ctxStatic}/bootstrap-3.3.7-dist/js/jquery-3.5.1.min.js" type="text/javascript"></script>
<%--<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>--%>
