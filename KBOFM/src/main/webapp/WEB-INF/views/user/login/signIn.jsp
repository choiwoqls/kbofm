<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/signIn.css">
<meta charset="UTF-8">
<title>KBOFM</title>
</head>
<body>
<div class="main">
<div>
	<div>회원 가입</div>
	<div class="mid">
		<form action="${pageContext.request.contextPath }" method="post">
			<div class="info">
				<div class="infoName">닉네임</div>
				<div><input type="text" name="nickname" id="nickName"><span id="idCheck"></span></div>
			</div>
			<div class="info">
				<div class="infoId">ID</div>
				<div><input type="text" name="member_id" id="member_id"></div>
			</div>
			<div class="info">
				<div class="infoPassword">PASSWORD</div>
				<div><input type="password" name="password" id="password"></div>
			</div>
			<div class="info">
				<div class="infoRePassword">PASSWORD</div>
				<div><input type="password" name="password" id="password"></div>
			</div>
			<div class="info">
				<div class="infoEmail">E-MAIL</div>
				<div><input type="email" name="email" id="email"></div>
			</div>
			<div class="info">
				<div class="infoPhoto">PHOTO</div>
				<div><input type="file" name="profile_img" id="profile_img"></div>
			</div>
			<div class="info">
			<div class="infoMyTeam">TEAM</div>
			<!--team for -->
			<c:forEach items="${teamList }" var="team">
				<input type="radio" name="team" value="${team.team_seq }">${team.team_name }
			</c:forEach>
			<!--team for -->			
			</div>
		</form>
	</div>
</div>
</div>
</body>
</html>