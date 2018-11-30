<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title></title>
	<link rel="stylesheet" href="css/reset.css" />
	<link rel="stylesheet" href="css/login.css" />
        <script type="text/javascript" src="javascripts/jquery.min.js"></script>
	<style type="text/css">
		#err{
			color: red;
			margin-left: 115px;
			margin-top: 25px;
			padding-top: 22px;
		}
		#toregist{
				margin-left: 280px;
				font-size: 14px; 
				text-decoration: none;
				color:deepskyblue;
		}
		a:HOVER {
			color:red;
			font-size: 15px; 
			text-decoration: underline;
		}
	</style>
</head>
<body>
<div class="page">
	<div class="loginwarrp">
		<div class="logo">管理员登陆</div>
		<br />
		<span id="err">${msg }</span><!-- 错误信息提示  -->
		<a id="toregist" href="${pageContext.request.contextPath}/UserServlet?method=toregist">没有账号，去注册</a>
        <div class="login_form">
			<form id="Login" name="Login" method="post"  action="${pageContext.request.contextPath}/UserServlet?method=login">
				<li class="login-item">
					<span>用户名：</span>
					<input type="text" id="username" name="username" class="login_input" >
                                        <span id="count-msg" class="error"></span>
				</li>
				<li class="login-item">
					<span>密　码：</span>
					<input type="password" id="password" name="password" class="login_input" >
                                        <span id="password-msg" class="error"></span>
				</li>
				<!--
				<li class="login-item verify">
					<span>验证码：</span>
					<input type="text" name="CheckCode" class="login_input verify_input">
				</li>
				<img src="images/verify.png" border="0" class="verifyimg" />
				-->
				<div class="clearfix"></div>
				<li class="login-sub">
					<input type="submit" name="Submit" value="登录" />
                                        <input type="reset" name="Reset" value="重置" />
				</li>                      
           </form>
		</div>
	</div>
</div>
<script type="text/javascript">
		window.onload = function() {
			var config = {
				vx : 4,
				vy : 4,
				height : 2,
				width : 2,
				count : 100,
				color : "121, 162, 185",
				stroke : "100, 200, 180",
				dist : 6000,
				e_dist : 20000,
				max_conn : 10
			}
			CanvasParticle(config);
		}
	</script>
	<script type="text/javascript" src="javascripts/canvas-particle.js"></script>
</body>
</html>
