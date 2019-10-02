<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>IBS</title>
</head>
<style>
    table {
        font-family: Arial, sans-serif;
        border-collapse: collapse;
        width: 50%;
    }
    tr, td {
        border: 1px solid #000000;
        padding: 4px;
    }
    th{
        font-weight: bold;
        text-transform: uppercase;
    }
    tr:hover {
        background-color: #e0f5e0;
        color:black;
    }
    button.add{
        font-weight: 700;
        color: white;
        text-decoration: none;
        padding: .8em 1em calc(.8em + 3px);
        border-radius: 3px;
        background: rgb(64,199,129);
        box-shadow: 0 -3px rgb(53,167,110) inset;
        transition: 0.2s;
    }
    button.add:hover { background: rgb(53, 167, 110); }
    button.add:active {
        background: rgb(33,147,90);
        box-shadow: 0 3px rgb(33,147,90) inset;
    }
    button.delete{
        background-color: #d41c00;
        border: 1px solid #ffffff;
        font-family: arial,sans-serif;
        font-size: 11px;
        font-weight: bold;
        color: #ffffff;
        height: 25px;
        border-radius: 3px;
        padding: 0px 6px;
    }
    button.edit{
        background-color: #9c910e;
        border: 1px solid #ffffff;
        font-family: arial,sans-serif;
        font-size: 11px;
        font-weight: bold;
        color: #ffffff;
        height: 25px;
        border-radius: 3px;
        padding: 0px 6px;
    }

</style>
<body>

<br>
<form>
    <p><button class="add" type="button"  onClick='location.href="/webapp_war/addUser"'>CreateUser</button></p>
</form>
<table>
    <thead>
    <tr>
    <th>ID</th>
    <th>Email</th>
    <th>First</th>
    <th>Last</th>
    </tr>
    </thead>

<#list users as user>
    <tr>
        <td>${user.id}</td>
        <td>${user.email}</td>
        <td>${user.first}</td>
        <td>${user.last}</td>
        <td><button class="delete" type="button"  onClick='location.href="/webapp_war/delete/${user.id}"'>delete</button></td>
        <td><button class="edit" type="button"  onClick='location.href="/webapp_war/update/${user.id}"'>edit</button></td>
    </tr>
</#list>
</table>
</body>
</html>