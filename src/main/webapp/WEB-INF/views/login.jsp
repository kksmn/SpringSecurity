<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 13.01.2022
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<form method="POST"
action="${PageContext.request.ContextPath}/j_spring_security_check">
    <c:if
    test="${not empty sessionScope['SPRING_SECURITY_LAST_EXCEPTION'].message}">
        <div style="color:red">
            ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
        </div>
    </c:if>
    <input type="text" name='j_username'/>
    <input type="password" name='j_password'/>
    <input type="submit"/>
</form>
</body>
</html>
