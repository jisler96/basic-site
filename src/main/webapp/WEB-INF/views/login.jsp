<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>



<body>
<h1>Login</h1>
<form:form modelAttribute="userDO" method="post">
    <div>
        <label>Username:</label>
        <form:input type="text" name="username" path="username"/>
    </div>
    <div>
        <label>Password:</label>
        <form:input type="password" name="password" path="password"/>
    </div>
    
    <div>
        <button type="submit">Login</button>
    </div>
</form:form>
</body>
</html>
