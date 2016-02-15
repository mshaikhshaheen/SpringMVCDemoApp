<%@include file="include.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Create account</title>
		<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" />
  		<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
  		<script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>
 	</head>
<body>
	<div class="signup-card" id="signup-card">
		<h4><center>Create your account.</center></h4>
		<font color="red">${randomError}</font>
			<form:form id="signUp" modelAttribute="newUserBean" name = "signUp" action="SignUp" method ="POST">
				<fieldset>
				<p>Name:</p>
				<form:input id="firstName" name="firstName" placeholder="First Name" required="" path="firstName" />
				<form:input id="lastName" name="lastName" placeholder="Last Name" required="" path="lastName" /><br/>
				<font color="red">${nameError}</font>
				<form:input type="email" id="username" name="username" placeholder="Username" required="" path="username" /><br/>
				<form:input type="password" id="pswd" name="pswd" placeholder="Password" required="" path="password" /><br/>
				<form:input type="password" id="confirmPswd" name="confirmPswd" placeholder="Confirm Password" required="" path="confirmPassword" /><br/>
				<form:input type="text" id="birthDate" name="birthDate" placeholder="Birth Date" required="" path="birthDate" class="datepicker"/><br/>
				<form:select id="gender" name="gender" placeholder="Gender" required="" path="gender">
					<form:option value="Male" label="Male" />
					<form:option value="Female" label="Female" />
                </form:select><br/>
				<form:input id="mobileNumber" name="mobileNumber" placeholder="Mobile Number" required="" path="mobileNumber" />
				<form:input id="location" name="location" placeholder="First Name" required="" path="location" />
				<TEXTAREA NAME="currentAddress" COLS=50 ROWS=10></TEXTAREA>
				<TEXTAREA NAME="permanentAddress" COLS=50 ROWS=10></TEXTAREA>
				</fieldset>
			</form:form>				
	</div>
</body>
</html>