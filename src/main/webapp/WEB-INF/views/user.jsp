<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 13.01.2022
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
<table>
    <tr>
        <th>Id</th>
        <th>First Name</th>
    </tr>
    <c:forEach items="${list}" var="user" >
        <tr>
            <td>${user.getId() }</td>
            <td>${user.getUsername() }</td>
        </tr>
    </c:forEach>
</table>
<a href="logout.jsp">logout</a>
</body>
</html>
