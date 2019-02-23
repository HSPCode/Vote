<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<body>
<form action="${pageContext.request.contextPath}/user/login" method="post">
    请输入账号：<input type="text" name="vuUserName"/>
    请输入密码：<input type="text" name="vuPassword"/>
    <input type="submit" value="Submit"/>
</form>
</body>
</html>
