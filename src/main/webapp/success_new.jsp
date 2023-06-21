<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 21.06.2023
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%! String getLoginWithDots(String parameter){
    if (parameter.length()<=3){
        return parameter;
    }
    return parameter.substring(0, 3) + "...";
}%>
<head>
    <title>Success new</title>
</head>
<body>
<h1>Hello world</h1>
<h1>Login: <%=request.getParameter("login")%></h1>
<h1>Login: <%=session.getAttribute("login")%></h1>
<h1>Login: <%=application.getInitParameter("login")%></h1>
<h2>Password: <%=getLoginWithDots(request.getParameter("password"))%></h2>
<%
    for (int i=0;i<10;i++){
        out.println("<h5>" + i + "<h5>");
    }
%>
</body>
</html>
