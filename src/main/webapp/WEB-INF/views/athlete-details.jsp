<%--
  Created by IntelliJ IDEA.
  User: 1034511
  Date: 07-10-2022
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="ISO-8859-1" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <title>Athlete Detail</title>
</head>
<body>
<h2>Athlete Details added</h2>
<p>Name: ${athlete.name}</p>
<p>Country: ${athlete.country}</p>
<p>Rank: ${athlete.rank}</p>
<p>Designation: ${athlete.designation}</p>
<b>Dob: </b><fmt:formatDate value="${athlete.dob}" type="date" pattern="dd-MM-YYYY"/>
<p>Email:${athlete.email}</p>
<p>
    Tournaments List:
    <c:forEach var="tournament" items="${athlete.tournaments}">
        <li>${tournament}</li>
    </c:forEach>
</p>


</body>
</html>
