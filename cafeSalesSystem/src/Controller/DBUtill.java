package Controller;

import java.sql.Connection;
import java.sql.DriverManager;

//테이터베이스 연결용 유틸
public class DBUtill {

	static final String driver = "oracle.jdbc.driver.OracleDriver";
	static final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static String id = "scott";
	private static String pw = "tiger";

	public static Connection getConnection() throws Exception {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, id, pw);
		System.out.println("DB연결 성공");

		return con;
	}
}
