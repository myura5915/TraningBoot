package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.annotation.WebServlet;

import bean.AccountBean;

@WebServlet("/RegistrationDao")

public class RegistrationDao {
	public void accountRegistration(AccountBean registration) {

		Connection conn = null;
		LocalDateTime ld = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd/HH:mm:ss");

		String url = "jdbc:mysql://localhost/lesson";
		String user = "root";
		String password = "collabo2017";
			try {
			//JDBCドライバを読み込む
			Class.forName("com.mysql.jdbc.Driver");

			//データベースに接続
			conn = DriverManager.getConnection(url, user, password);

			//INSERT文の準備
			String sql = "INSERT INTO LOGIN_USER ( USER_NAME, PASSWORD, INSERT_DATE) VALUES(?, ?, ?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//INSERT文内の?に使用する値を設定しSQLを登録
			pStmt.setString(1, registration.getUser_name());
			pStmt.setString(2, registration.getPass());
			pStmt.setString(3, ld.format(dtf));

			//INSERT文を実行
			pStmt.executeUpdate();

			}catch(SQLException e) {
				e.printStackTrace();
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}finally {
				//データベースを切断
				if(conn != null) {
					try {
						conn.close();
					}catch(SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
