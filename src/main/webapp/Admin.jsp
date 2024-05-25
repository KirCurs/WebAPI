<%--
  Created by IntelliJ IDEA.
  User: New
  Date: 25.05.2024
  Time: 3:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin</title>
</head>
<body>
<h1>Пользователи</h1>
<p>Логин Пароль</p>
<p><%= request.getAttribute("users") %></p>
<form action="start.jsp">
    <button type="submit">Назад</button>
</form>
</body>
</html>
