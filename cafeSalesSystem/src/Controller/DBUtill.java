package Controller;

import java.sql.Connection;
import java.sql.DriverManager;

//�����ͺ��̽� ����� ��ƿ
public class DBUtill {

	static final String driver = "oracle.jdbc.driver.OracleDriver";
	static final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static String id = "scott";
	private static String pw = "tiger";

	public static Connection getConnection() throws Exception {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, id, pw);
		System.out.println("DB���� ����");

		return con;
	}
}
