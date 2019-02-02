<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>

<%--
  Created by IntelliJ IDEA.
  User: Gang
  Date: 2019/2/2
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spitter</title>
    <link rel="stylesheet"
    type="text/css"
    href="<c:url value="/resources/style.css" />">
</head>
<body>
    <h1>Welcome to Spitter</h1>
    <a href="<c:url value="/spittles"/>">Spittles</a>
    <a href="<c:url value="/spitter/register"/>">Register</a>
</body>
</html>
