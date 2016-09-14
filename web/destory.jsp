<%--
  Created by IntelliJ IDEA.
  User: lisa
  Date: 2016/9/14
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  request.removeAttribute("requestName");
  request.getSession().removeAttribute("sessionName");
  request.getSession().getServletContext().removeAttribute("ContextName");

  request.getSession().removeAttribute("currentUser");
%>
<html>
<head>
    <title></title>
</head>
<body>
销毁界面
<button onclick="location.href='<%=request.getContextPath()%>/init.jsp';">Init</button>
<button onclick="location.href='<%=request.getContextPath()%>/destory.jsp';">Destory</button>
</body>
</html>
