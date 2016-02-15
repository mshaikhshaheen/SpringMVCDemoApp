<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Patient Information Application</title>
	    <link rel="text/javascript" href="${pageContext.request.contextPath}/resources/js/passwordvalidator.js" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/logincommon.css" />	
	</head>
	<body>
	<h1><center>Patient Information Base</center></h1>
		<div class="signin-card" id="signin-card">
				<h4><center>Welcome.Please login.</center></h4>
				
				<form name = "login" action="ServiceLoginAuth" method ="POST" onsubmit="return checklogin(this);">
					<fieldset>
						<input type="email" id="userid" name="userid" placeholder="Email" spellcheck="false" required/><br/>
						<p><a href="RecoverUsername">Forgot your username?</a></p>
						<input type="password" id="pswd" name="pswd" placeholder="Password" required/><br/> 
						<p><a href="RecoverPassword">Forgot your password?</a></p>
						<input type="submit" id="signin" value="Sign-in now"/><br/>
					</fieldset>
				</form>
				
				<input type="checkbox" name="rememberme" value="Remember me"> Remember me</input><br/>
				<p><a href="CreateNewUser">Not registered?Create an account!</a></p>
				<p><span class="btn-round">or</span></p>
				<p><a class="facebook-before"></a><button class="facebook">Login Using Facebook</button></p>
				<p><a class="twitter-before"></a><button class="twitter">Login Using Twitter</button></p>
		</div>
	</body>
</html>