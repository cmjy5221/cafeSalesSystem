package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.CustomerVO;
//현재 현금 시재를 저장하는 DAO
public class CofferDAO {

	//시재 입력 칸에서 입력하는 초기 시재값 설정 메소드
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
			System.out.println(q + "행 변경되었음");
			if (q == 1) {
				result = true;
			} else {
				System.out.println("시재 입력 실패");
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
	//현금 결제시 현재 시재 변경
	public void nowSijae(int i) {
		String dml="update coffer set sijae=sijae+?,nowdate=sysdate";
		Connection con = null;
		PreparedStatement psmt = null;

		try {
			con = DBUtill.getConnection();
			psmt = con.prepareStatement(dml);
			psmt.setInt(1, i);
			int q = psmt.executeUpdate();
			System.out.println(q + "행 변경되었음");
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
	}// 메소드 종료
	
}
