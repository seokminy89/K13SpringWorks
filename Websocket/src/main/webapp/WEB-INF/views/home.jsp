<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	
	<h1>Notification 이용한 알림받기</h1>
	<ul>
		<li>
			<a href="./Notification/01WebNoti.do" target="_black">웹노티</a>
		</li>
		<li>
			<a href="./Notification/02WebSocket.do" target="_black">웹소켓</a>
		</li>
		<li>
			<a href="./Notification/03SendMain.do" target="_black">쪽지보내기</a>
		</li>
	</ul>
</body>
</html>
