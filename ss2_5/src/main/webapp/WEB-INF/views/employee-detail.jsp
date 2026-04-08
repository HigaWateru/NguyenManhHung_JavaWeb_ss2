<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<%@ include file="header.jsp" %>
<div class="container">
    <h2>Chi tiết nhân viên</h2>
    <div class="row">
        <b>Mã:</b>
        <c:out value="${emp.code}"/>
    </div>
    <div class="row">
        <b>Họ tên:</b>
        <c:out value="${emp.name}"/>
    </div>
    <div class="row">
        <b>Phòng ban:</b>
        <c:out value="${emp.department}"/>
    </div>
    <div class="row">
        <b>Lương:</b>
        <c:choose>
            <c:when test="${sessionScope.role == 'hr_manager'}"><c:out value="${emp.salary}"/></c:when>
            <c:otherwise>***</c:otherwise>
        </c:choose>
    </div>
    <div class="row">
        <b>Trạng thái:</b>
        <c:out value="${emp.status}"/>
    </div>
    <br/>
    <a href="<c:url value='/employees'/>">← Quay lại</a>
</div>
