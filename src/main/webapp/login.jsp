<%--
  Created by IntelliJ IDEA.
  User: wallysmith
  Date: 3/31/21
  Time: 2:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
</head>
<body>


    <form action="login.jsp" method="post">
        <div class="container">
            <div>
                <label for="name"><b>Username</b></label>
                <input  id="name" type="text" placeholder="Enter Username" name="uname" required>
            </div>

            <div>
                <label for="password"><b>Password</b></label>
                <input  id="password" type="text" placeholder="Enter password" name="password" required>
            </div>

            <button type="submit">Login</button>

        </div>
    </form>

</body>
</html>
