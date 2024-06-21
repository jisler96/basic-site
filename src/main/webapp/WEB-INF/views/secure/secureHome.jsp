<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>



<body>
<title>Welcome</title>
<form:form modelAttribute="userDO" method="post">
    <div>
        <h1>Welcome ${userDO.username}</h1>
    </div>


    <div>
        <button type="submit">Login</button>
    </div>
</form:form>
</body>
</html>
