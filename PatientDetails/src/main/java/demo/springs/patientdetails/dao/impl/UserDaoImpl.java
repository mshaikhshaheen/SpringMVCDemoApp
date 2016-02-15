package demo.springs.patientdetails.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import demo.springs.patientdetails.dao.UserDao;
import javax.sql.DataSource;

public class UserDaoImpl implements UserDao{
	
	DataSource dataSource ;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public int isValidUser(String username, String password) throws SQLException {
		String query = "Select count(1) from users where user = ? and pswd = ?";
		PreparedStatement pstmt = dataSource.getConnection().prepareStatement(query);
		pstmt.setString(1, username);
		pstmt.setString(2, password);
		ResultSet resultSet = pstmt.executeQuery();
		if(resultSet.next())
			return (resultSet.getInt(1));
		else return 0;
	}

}
