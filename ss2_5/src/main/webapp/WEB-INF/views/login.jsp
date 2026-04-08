<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div class="login-container">
        <h2>HR Portal Login</h2>
        <c:if test="${not empty errorMessage}">
            <div class="error"> <c:out value="${errorMessage}"/> </div>
        </c:if>
        <form method="post" action="<c:url value='/login'/>">
            <label>Username</label>
            <input type="text" name="username" required />
            <label>Password</label>
            <input type="password" name="password" required />
            <button type="submit">Đăng nhập</button>
        </form>
    </div>
</body>
</html>
