<%@page isELIgnored="false" pageEncoding="UTF-8"
        contentType="text/html; UTF-8" %>
<html>
<body>
<h2>Hello World!</h2>
<form action="${pageContext.request.contextPath}/user/regist" method="post">
    <input type="text" name="vuUserName">
    <input type="text" name="vuPassword">
    <input type="submit" value="regist">
</form>
</body>
</html>
