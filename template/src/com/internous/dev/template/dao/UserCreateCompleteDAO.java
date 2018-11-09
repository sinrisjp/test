package com.internous.dev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internous.dev.template.util.DBConnector;
import com.internous.dev.template.util.DateUtil;

public class UserCreateCompleteDAO {
	private DateUtil dateUtil = new DateUtil();

	private String sql = "INSERT INTO login_user_transaction(login_id,login_pass,user_name,insert_date) VALUES(?,?,?,?)";

	public void createUser(String loginUserId, String loginUserPassword, String userName)
	throws SQLException {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ps.setString(2, loginUserPassword);
			ps.setString(3, userName);
			ps.setString(4, dateUtil.getDate());

			ps.execute();

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
	}
}
