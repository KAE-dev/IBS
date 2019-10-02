<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>IBS</title>
</head>
<body>

<form name="user" action="/webapp_war/updateUser" method="post">
    <p>Email</p>
    <input title="Email" type="text" name="email" value="${user.email}">
    <p>First</p>
    <input title="First" type="text" name="first" value="${user.first}">
    <p>Last</p>
    <input title="Last" type="text" name="last" value="${user.last}">
    <input type="submit" value="OK">
</form>


</body>
</html>