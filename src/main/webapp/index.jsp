<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br>
<%
    int a = 10, b = 20;
    out.print(a + b);
    out.print("<br>");
%>

<br/>
<a href="hello-servlet">Hello Servlet</a>

<form action="hello-servlet" method="get">
    <input type="text" name="name"><br>
    <input type="submit" value="form의 method를 get으로 지정하여 실행 시키기">

</form>
</body>
</html>