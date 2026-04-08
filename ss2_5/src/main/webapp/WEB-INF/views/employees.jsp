<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>

<%@ include file="header.jsp" %>

<h2 style="text-align:center">Danh sách nhân viên</h2>

<table>
    <tr>
        <th>STT</th>
        <th>Mã</th>
        <th>Họ tên</th>
        <th>Phòng ban</th>
        <th>Lương</th>
        <th>Ngày vào làm</th>
        <th>Trạng thái</th>
        <th>Action</th>
    </tr>

    <c:forEach var="emp" items="${employees}" varStatus="loop">
        <tr>
            <td>${loop.count}</td>
            <td><c:out value="${emp.code}"/></td>
            <td><c:out value="${emp.name}"/></td>
            <td><c:out value="${emp.department}"/></td>
            <td><fmt:formatNumber value="${emp.salary}" type="currency"/></td>
            <td><fmt:formatDate value="${emp.joinDate}" pattern="dd/MM/yyyy"/></td>
            <td>
                <c:choose>
                    <c:when test="${emp.status == 'Đang làm'}"><span class="badge green">Đang làm</span></c:when>
                    <c:when test="${emp.status == 'Nghỉ phép'}"><span class="badge orange">Nghỉ phép</span></c:when>
                    <c:otherwise><span class="badge blue">Thử việc</span></c:otherwise>
                </c:choose>
            </td>
            <td><a href="<c:url value='/employees/${emp.code}'/>">Xem chi tiết</a></td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="4"><b>Tổng lương phòng Kỹ thuật</b></td>
        <td colspan="4"><fmt:formatNumber value="${totalIT}" type="currency"/></td>
    </tr>

</table>

