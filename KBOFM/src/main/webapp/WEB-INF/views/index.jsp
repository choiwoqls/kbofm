<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/index.css">
<meta charset="UTF-8">
<title>KBO_FM</title>
</head>
<body>
<!-- <div class="back"> -->
	<div class="main" align="center"> 
		<div class="title">
			KBO FM LOGIN
		</div>
		<form action="${pageContext.request.contextPath }/user/login/loginFrom" method="post">
			<div>
				<div>
					<div class="info">
						<input type="text" placeholder="ID" name="user_id">
					</div>	
					<div class="info">
						<input type="text" placeholder="PASSWORD" name="user_password">				
					</div>				
				</div>
				<div>
					<span class="menu"><a href="${pageContext.request.contextPath }/user/login/findId">아이디 찾기</a></span>
					<span class="menu"><a href="${pageContext.request.contextPath }/user/login/findPw">비밀번호 찾기</a></span>
					<span class="menu"><a href="${pageContext.request.contextPath }/user/login/signIn">회원가입</a></span>
				</div>
				<div class="login">
					<button class="loginBtn">L O G I N</button>
				</div>
			</div>
		</form>
	</div>
<!-- </div> -->
</body>
</html>