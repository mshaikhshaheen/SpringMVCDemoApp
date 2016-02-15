package demo.springs.patientdetails.service.impl;

import java.sql.SQLException;

import demo.springs.patientdetails.dao.UserDao;
import demo.springs.patientdetails.service.UserService;

public class UserServiceImpl implements UserService{

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	private UserDao userDao;
	
	public int isValidUser(String username, String password)
			throws SQLException {
		return userDao.isValidUser(username, password);
	}

}
