function checklogin(login)
{
	if(login.userid.value == "") {
		alert("Error: Username cannot be blank!");
		login.userid.focus();
		return false;
	}
	if(login.pswd.value != "") {
		if(login.pswd.value.length < 6) {
			alert("Error: Password must contain at least six characters!");
			login.pswd.focus();
			return false;
		}
		if(login.pswd.value == login.userid.value) {
			alert("Error: Password must be different from Username!");
			login.pswd.focus();
			return false;
		}
		re = /[0-9]/;
		if(!re.test(login.pswd.value)) {
			alert("Error: password must contain at least one number (0-9)!");
			login.pswd.focus();
			return false;
		}
		re = /[a-z]/;
		if(!re.test(login.pswd.value)) {
			alert("Error: password must contain at least one lowercase letter (a-z)!");
			login.pswd.focus();
			return false;
		}
		re = /[A-Z]/;
		if(!re.test(login.pswd.value)) {
			alert("Error: password must contain at least one uppercase letter (A-Z)!");
			login.pswd.focus();
			return false;
		}
	} else {
		alert("Error: Please check that you've entered and confirmed your password!");
		login.pswd.focus();
		return false;
	}
	return true;
}