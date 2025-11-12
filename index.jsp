<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mini Instagram</title>
</head>
<body>
<h1>Mini Instagram</h1>

<form method="post" action="app">
    <input type="text" name="post" placeholder="What's on your mind?" required>
    <button type="submit">Post</button>
</form>

<h2>Posts:</h2>
<ul>
    <c:forEach var="p" items="${posts}">
        <li>${p}</li>
    </c:forEach>
</ul>
</body>
</html>
