<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Player Form</title>
</head>
<body>
<h1>Player Form</h1>



<form action="/springmvc/showPlayerDetail" method="POST">
    <label>Player Name:</label>
    <input type="text" name="playerName" />
    <input type="submit" value="Enter" />
</form>

</body>
</html>
