package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.StaffVO;

//�α��� â�� ���õ� DAO
public class LoginDAO {
	// ���̵�� ��й�ȣ�� �Է��� ��ϵ� ������ �ִ��� Ȯ���ϴ� �޼ҵ�
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

	// �α����� �� ����� ���̵� ���� ��å�� ������ �ǸŰ���â�� ������ �뵵�� �޼ҵ�
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
