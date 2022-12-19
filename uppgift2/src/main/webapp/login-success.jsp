<%@page import="model.LoginBean"%>
<p>You are successfully logged in!</p>
<%
LoginBean bean=(LoginBean)session.getAttribute("bean");
out.print("Welcome, "+bean.getName());
%>
