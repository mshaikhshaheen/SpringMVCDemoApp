package demo.springs.patientdetails.service;

import java.sql.SQLException;

public interface UserService {
		public int isValidUser(String username, String password) throws SQLException;
}
