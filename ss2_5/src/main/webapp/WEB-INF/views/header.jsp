<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<div class="header">

    <div class="nav">
        <a href="<c:url value='/employees'/>">Danh sách nhân viên</a>
        <c:if test="${sessionScope.role == 'hr_manager'}">
            <a href="#">Quản lý hệ thống</a>
        </c:if>
    </div>

    <div>
        Xin chào:
        <b><c:out value="${sessionScope.loggedUser}"/></b> |
        <a style="color:white"
           href="<c:url value='/login'/>">Đăng xuất</a>
    </div>
</div>
