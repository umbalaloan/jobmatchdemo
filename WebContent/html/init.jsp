<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="constants.TSConstants"%>
<%@page import="util.TSUtil"%>
<%@page import="util.StringPool"%>

<%@page import="model.User"%>
<%@page import="model.Account"%>
<%@page import="model.AccountRoleMap"%>
<%@page import="model.Permission"%>
<%@page import="model.Role"%>
<%@page import="model.RolePermissionMap"%>

<%@page import="dao.UserDao"%>
<%@page import="dao.AccountDao"%>
<%@page import="dao.impl.UserDaoImpl"%>
<%@page import="dao.impl.AccountDaoImpl"%>

<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.Set" %>
<%@page import="java.text.SimpleDateFormat"%>

<link rel="stylesheet" type="text/css" href="<%=TSConstants.JQUERY_CSS%>"/>

<script type="text/javascript" src="/TestingSystem/js/jquery.js"></script>
<script type="text/javascript" src="/TestingSystem/js/jquery-ui.min.js"></script>
<script type="text/javascript" src="<%=TSConstants.TESTING_SYSTEM_JS%>"></script>