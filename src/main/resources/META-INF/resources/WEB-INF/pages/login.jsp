<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
<style>
    * {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
    }
    form {
        margin: 20px;
        padding: 20px;
        border: 2px solid black;
        border-radius: 10px;
        width: 300px;
        background-color: white;
    }
    input[type="text"],
    input[type="password"] {
        width: 100%;
        padding: 10px;
        margin: 5px 0;
        box-sizing: border-box;
    }
    input[type="submit"] {
        width: 100%;
        padding: 10px;
        margin: 10px 0;
        box-sizing: border-box;
        background-color: #4CAF50;
        color: white;
        border: none;
        border-radius: 5px;
        cursor: pointer;
    }
    input[type="submit"]:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>
    <form action="login/submitform" method="post">
        Enter Username:
        <input type="text" name="username" id="username" required/>
        Enter Password:
        <input type="password" name="pass" id="pass" required/>
        
        <input type="submit" value=" Login ">
    
    </form>
</body>
</html>
