<%--
  Created by IntelliJ IDEA.
  User: harryjin
  Date: 18/5/6
  Time: 下午3:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>get tasks</title>
</head>
<body>
<table border="1">
    <tr>
        <th>Task Id</th>
        <th>Task Name</th>
    </tr>
    <c:forEach items="${tasks}" var="task">
        <tr>
            <td>${task.id}</td>
            <td>${task.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
