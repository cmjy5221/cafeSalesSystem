package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.CustomerVO;
//���� ���� ���縦 �����ϴ� DAO
public class CofferDAO {

	//���� �Է� ĭ���� �Է��ϴ� �ʱ� ���簪 ���� �޼ҵ�
	public boolean setSijae(int i) {
		String dml = "update coffer set sijae=?,nowdate=sysdate";
		Connection con = null;
		PreparedStatement psmt = null;

		boolean result = false;
		try {
			con = DBUtill.getConnection();
			psmt = con.prepareStatement(dml);
			psmt.setInt(1, i);
			int q = psmt.executeUpdate();
			System.out.println(q + "�� ����Ǿ���");
			if (q == 1) {
				result = true;
			} else {
				System.out.println("���� �Է� ����");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (psmt != null)
					psmt.close();
				if (con != null)
					con.close();

			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}
	//���� ������ ���� ���� ����
	public void nowSijae(int i) {
		String dml="update coffer set sijae=sijae+?,nowdate=sysdate";
		Connection con = null;
		PreparedStatement psmt = null;

		try {
			con = DBUtill.getConnection();
			psmt = con.prepareStatement(dml);
			psmt.setInt(1, i);
			int q = psmt.executeUpdate();
			System.out.println(q + "�� ����Ǿ���");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (psmt != null)
					psmt.close();
				if (con != null)
					con.close();

			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}
	public int selectSijae() {
		String dml = "select * from coffer";
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		int retval = 0;
		try {
			con = DBUtill.getConnection();
			pstm = con.prepareStatement(dml);
			rs = pstm.executeQuery();
			if (rs.next()) {
				retval=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstm != null)
					pstm.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO: handle exception
			}
		}
		return retval;
	}// �޼ҵ� ����
	
}
