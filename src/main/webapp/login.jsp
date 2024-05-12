<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 10.05.2024
  Time: 12:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Авторизация</title>
</head>
<body>
<h1>Вход в систему</h1>

<form action="auth" method="post">
    <label for="username">Имя пользователя:</label><br>
    <input type="text" id="username" name="username" required><br><br>

    <label for="password">Пароль:</label><br>
    <input type="password" id="password" name="password" required><br><br>

    <input type="submit" value="Войти">
</form>

</body>
</html>
