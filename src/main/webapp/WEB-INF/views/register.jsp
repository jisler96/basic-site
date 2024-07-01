<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<script type=text/javascript>
</script>


<body>
<h1>Register</h1>
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
        <label>Confirm Password:</label>
        <input type="password" name="conf_password"/>
    </div>

    <div>
        <button type="submit">Register</button>
    </div>
</form:form>
</body>
</html>
