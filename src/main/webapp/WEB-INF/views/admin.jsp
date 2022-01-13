<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>Id</th>
        <th>First Name</th>
        <th>Email</th>
    </tr>
    <c:forEach items="${list}" var="user" >
        <tr>
            <td>${user.getId() }</td>
            <td>${user.getUsername() }</td>
            <td>${user.getEmail() }</td>
        </tr>
    </c:forEach>
</table>
<a href="logout.jsp">logout</a>
</body>
</html>