<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
	<head>
		<!-- 标题的内容需要在web.xml中进行更改 -->
		<title>${initParam.MyTitle}</title>
		
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
		
		<link rel="stylesheet" href="css/demo.css">
		<link rel="stylesheet" href="css/sky-forms.css">
		<link rel="stylesheet" href="css/sky-forms-ie8.css">
		<script src="javascripts/jquery-1.9.1.min.js"></script>
		<script src="javascripts/jquery.validate.min.js"></script>
		<script src="javascripts/jquery.placeholder.min.js"></script>
		<!-- <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script> -->
		<script src="javascripts/sky-forms-ie8.js"></script>
		<style type="text/css">
			#tologin{
				margin-left: 220px;
				font-size: 14px; 
				text-decoration: none;
			}
			a:HOVER {
				color:red;
				font-size: 15px; 
				text-decoration: underline;
			}
		</style>
	</head>
	
	<body class="bg-cyan">
		<div class="body body-s">		
			<form action="${pageContext.request.contextPath}/UserServlet?method=regist" method="post" id="sky-form" class="sky-form">
				<header>请填写表单</header>
				<fieldset>					<!--  -->
					<a id="tologin" href="${pageContext.request.contextPath}/UserServlet?method=tologin">已有账号，去登录</a>
					<br />
					<br />
					<section>
						<label class="input">
							<i class="icon-append icon-user"></i>
							<input type="text" name="username" placeholder="用户名">
							<b class="tooltip tooltip-bottom-right">请输入用户名</b>
						</label>
					</section>
					
					<section>
						<label class="input">
							<i class="icon-append icon-envelope-alt"></i>
							<input type="email" name="email" placeholder="Email">
							<b class="tooltip tooltip-bottom-right">请输入您的Email地址</b>
						</label>
					</section>
					
					<section>
						<label class="input">
							<i class="icon-append icon-lock"></i>
							<input type="password" name="password" placeholder="密码" id="password">
							<b class="tooltip tooltip-bottom-right">请输入您的密码</b>
						</label>
					</section>
					
					<section>
						<label class="input">
							<i class="icon-append icon-lock"></i>
							<input type="password" name="passwordConfirm" placeholder="请再次输入您的密码">
							<b class="tooltip tooltip-bottom-right">请再次输入您的密码</b>
						</label>
					</section>
			
					<section>
						<label class="select">
							<select name="sex">
								<option value="0" selected disabled>请选择性别</option>
								<option value="1">男性</option>
								<option value="2">女性</option>
					
							</select>
							<i></i>
						</label>
					</section>
				</fieldset>
				<fieldset>
					
					<section>
						<label class="checkbox"><input type="checkbox" name="subscription" id="subscription"><i></i>I 
					我愿意接受汕头大学最新动态</label>
						<label class="checkbox"><input type="checkbox" name="terms" id="terms"><i></i>I 
					我同意注册许可</label>
					</section>
				</fieldset>
				<footer>
					<button type="submit" class="button">提交注册</button>
				</footer>
			</form>			
		</div>
		
		<script type="text/javascript">
			$(function()
			{
				// Validation		
				$("#sky-form").validate(
				{					
					// Rules for form validation
					rules:
					{
						username:
						{
							required: true
						},
						email:
						{
							required: true,
							email: true
						},
						password:
						{
							required: true,
							minlength: 3,
							maxlength: 20
						},
						passwordConfirm:
						{
							required: true,
							minlength: 3,
							maxlength: 20,
							equalTo: '#password'
						},
						firstname:
						{
							required: true
						},
						lastname:
						{
							required: true
						},
						gender:
						{
							required: true
						},
						terms:
						{
							required: true
						}
					},
					
					// Messages for form validation
					messages:
					{
						login:
						{
							required: 'Please enter your login'
						},
						email:
						{
							required: 'Please enter your email address',
							email: 'Please enter a VALID email address'
						},
						password:
						{
							required: 'Please enter your password'
						},
						passwordConfirm:
						{
							required: 'Please enter your password one more time',
							equalTo: 'Please enter the same password as above'
						},
						firstname:
						{
							required: 'Please select your first name'
						},
						lastname:
						{
							required: 'Please select your last name'
						},
						gender:
						{
							required: 'Please select your gender'
						},
						terms:
						{
							required: 'You must agree with Terms and Conditions'
						}
					},					
					
					// Do not change code below
					errorPlacement: function(error, element)
					{
						error.insertAfter(element.parent());
					}
				});
			});			
		</script>
 <div style="width:960px;margin:10px auto; clear:both; text-align:center;  ">
<script src="/statics/js/ad/96090.js" type="text/javascript"></script>
</div>
<div style="width:960px;margin:20px auto; clear:both; text-align:center; font-size:12px; line-height:25px;    ">
    <!-- <script src="/statics/js/inc_share.js"  type="text/javascript"></script> -->
    <!-- <script src="/statics/js/inc_statistics.js"  type="text/javascript"></script> -->
    <!-- <script src="/statics/js/inc_monitor.js"  type="text/javascript"></script> -->
</div>
	</body>
</html>