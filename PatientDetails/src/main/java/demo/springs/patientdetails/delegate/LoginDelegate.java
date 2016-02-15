package demo.springs.patientdetails.delegate;

import java.sql.SQLException;

import demo.springs.patientdetails.service.UserService;

public class LoginDelegate {

    private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public int isValidUser(String  username, String  password) throws SQLException {
		return userService.isValidUser(username, password);
	}

}
