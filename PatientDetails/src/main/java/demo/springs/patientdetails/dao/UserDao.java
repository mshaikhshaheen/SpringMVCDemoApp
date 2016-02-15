package demo.springs.patientdetails.dao;

import java.sql.SQLException;

public interface UserDao {

	int isValidUser(String username, String password) throws SQLException;
}
