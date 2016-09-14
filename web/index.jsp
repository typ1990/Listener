<%--
  Created by IntelliJ IDEA.
  User: lisa
  Date: 2016/9/14
  Time: 13:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
  <%= request.getSession().getAttribute("currentUser") %>
  初始界面
  <button onclick="location.href='<%=request.getContextPath()%>/init.jsp';">Init</button>
  <button onclick="location.href='<%=request.getContextPath()%>/destory.jsp';">Destory</button>

  </body>
</html>
