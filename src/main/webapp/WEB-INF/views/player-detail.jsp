<%--
  Created by IntelliJ IDEA.
  User: 1034511
  Date: 06-10-2022
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Player Detail</title>
</head>
<body>
<h1>Player Detail </h1>

<%--model.addAttribute("pName",player.getName());--%>
<%--model.addAttribute("pId",player.getId());--%>
<%--model.addAttribute("pAge",player.getAge());--%>
<%--model.addAttribute("pNationality",player.getNationality());--%>

<p> Player Id : ${pId}</p>
<p> Player Name : ${pName}</p>
<p> Player Age : ${pAge}</p>
<p> Player Nationality : ${pNationality}</p>


</body>
</html>
