<%--
  Created by IntelliJ IDEA.
  User: wumd
  Date: 2020/4/28
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>编辑</title>
</head>
<body>
<form action="/resume/save" method="post">
    <p id="ids"> id<input id="id" type="text" name="id" /></p>
    <p>name<input id="name" type="text"  name="name"/></p>
    <p>address<input id="address" type="text"  name="address"/></p>
    <p>phone<input id="phone" type="text" name="phone"/></p>
    <p><input  type="submit" value="保存"/></p>
</form>
</body>
</html>
<script>
    window.onload=function () {
        var href = decodeURIComponent(window.location.href) ;
        var params = href.split("?");
        if(params.length>1){
            var param = params[1];
            var id = param.split("&")[0].split("=")[1];
            var name = param.split("&")[1].split("=")[1];
            var address = param.split("&")[2].split("=")[1];
            var phone = param.split("&")[3].split("=")[1];
            document.getElementById("id").setAttribute("value",id);
            document.getElementById("name").setAttribute("value",name);
            document.getElementById("address").setAttribute("value",address);
            document.getElementById("phone").setAttribute("value",phone);
        }else {
            document.getElementById("ids").style.display="none";
        }

    }

</script>