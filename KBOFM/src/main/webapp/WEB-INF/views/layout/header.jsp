<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
	
	body{
		margin: 0%;	
	}
	
	a{
		font-weight:bold;
		color:black;
		text-decoration :none; 		
	}
	.header{
		width: 100%; 
		height: 3vh; 
		display: flex;
		justify-content: space-between;
		background-color: silver;
	}
	
	.logo{
		font-weight:bold;
		cursor: pointer;
		text-align: center;
		width: 10vw;
	}
	
	.content{
		width: auto;
		display: flex;
	}
	
	.click{
		width: 5vw;
		padding-left: 1%;
		border-radius: 9px; 
	}
	
</style>
<head>
<meta charset="UTF-8">
<title>KBO_FM</title>
</head>
<body>
<div class="header">
	<div class="logo">
		<span>KBOFM</span>
	</div>
	<div class="content">
		<div class="click">
			<a href="">로그인</a>
		</div>
		<div class="click">
			<a href="">회원가입</a>
		</div>
		<div class="click">
			<a href="">마이페이지</a>
		</div>
	</div>
</div>

</body>
</html>