package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.StaffVO;

//로그인 창과 관련된 DAO
public class LoginDAO {
	// 아이디와 비밀번호를 입력해 등록된 직원이 있는지 확인하는 메소드
	public boolean getLogin(StaffVO svo) {
		String dml = "select * from staff where s_id=? and s_pw=?";
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		boolean loginResult = false;

		try {
			con = DBUtill.getConnection();
			psmt = con.prepareStatement(dml);
			psmt.setString(1, svo.getS_ID());
			psmt.setString(2, svo.getS_PW());
			rs = psmt.executeQuery();

			if (rs.next()) {
				loginResult = true;

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
		return loginResult;
	}

	// 로그인할 떄 사용한 아이디를 통해 직책을 구한후 판매관리창에 보내는 용도의 메소드
	public String toWorkPage(String id) {
		String dml = "select s_job from staff where s_id=?";
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String retStr = null;
		try {
			con = DBUtill.getConnection();
			psmt = con.prepareStatement(dml);
			psmt.setString(1, id);
			rs = psmt.executeQuery();

			while (rs.next()) {
				retStr = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
		return retStr;
	}
}
