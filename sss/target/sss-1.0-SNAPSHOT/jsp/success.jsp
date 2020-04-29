<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: wumd
  Date: 2020/4/27
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px" align="center">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>address</td>
        <td>phone</td>
        <td><input type="button" value="新增" onclick="window.location='/jsp/edit.jsp'"/></td>
    </tr>
    <c:forEach items="${resumes}" var="resume" varStatus="varstatus">
        <form action="/resume/delete" method="post">
        <tr>
            <td ><input name="id" value="${resume.id}" readonly/></td>
            <td> <input name="name" value="${resume.name}" readonly/></td>
            <td><input name="address" value="${resume.address}" readonly/></td>
            <td><input name="phone"value="${resume.phone}" readonly/></td>
            <td><input type="button" onclick="window.location='/jsp/edit.jsp?id=${resume.id}&name=${resume.name}&address=${resume.address}&phone=${resume.phone}'" value="编辑" /><input type="submit" value="删除" /></td>
<%--            <td><input type="button" value="编辑"/><a href="/resume/delete?id=${resume.id}&name=${resume.name}&address=${resume.address}&phone=${resume.phone}">删除</a></td>--%>
        </tr>
        </form>
    </c:forEach>
</table>

</body>

</html>

<%--<script>--%>
<%--    function toEdit(id) {--%>
<%--        location.href--%>
<%--    }--%>
<%--</script>--%>