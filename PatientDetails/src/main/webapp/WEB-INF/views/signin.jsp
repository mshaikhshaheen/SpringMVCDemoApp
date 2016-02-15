<%@include file="include.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Patient Information Application</title>
	    <link rel="text/javascript" href="${pageContext.request.contextPath}/resources/js/passwordvalidator.js" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/logincommon.css" />	
	</head>
	<body>
		<div class="top_header">PATIENT INFORMATION BASE</div>
		<div class="signin-card" id="signin-card">
			<h4><center>Welcome.Please login.</center></h4>
			<font color="red">${message}</font>
			<form:form id="loginForm" modelAttribute="loginBean" name = "login" action="ServiceLoginAuth" method ="POST" onsubmit="return checklogin(this);">
				<fieldset>				
					<form:input type = "email" id="userid" name="userid" placeholder="Email" required="" path="username" /><br/>
					<p><a href="RecoverUsername">Forgot your username?</a></p>
					<form:input type = "password" id="pswd" name="pswd" placeholder="Password" required="" path="password" /><br/>
					<p><a href="RecoverPassword">Forgot your password?</a></p>
					<input type="submit" id="signin" value="Sign-in now"/><br/>
				</fieldset>
			</form:form>
			<input type="checkbox" name="rememberme" value="Remember me"> Remember me<br/>
			<p><a href="SignUp">Not registered?Create an account!</a></p>
			<p><span class="btn-round">or</span></p>
			<p><a class="facebook-before"></a><button class="facebook">Login Using Facebook</button></p>
			<p><a class="twitter-before"></a><button class="twitter">Login Using Twitter</button></p>
		</div>
	</body>
</html>