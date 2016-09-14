<%--
  Created by IntelliJ IDEA.
  User: lisa
  Date: 2016/9/14
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  request.setAttribute("requestName","requestValue");
  request.getSession().setAttribute("sessionName", "sessionValue");
  request.getSession().getServletContext().setAttribute("ContextName","ContextValue");
  request.setAttribute("requestName", "requestValue");

  request.getSession().setAttribute("currentUser", new com.cn.entity.User());
%>
<html>
<head>
    <title></title>
</head>
<body>
初始化参数界面
<button onclick="location.href='<%=request.getContextPath()%>/init.jsp';">Init</button>
<button onclick="location.href='<%=request.getContextPath()%>/destory.jsp';">Destory</button>
</body>
</html>
