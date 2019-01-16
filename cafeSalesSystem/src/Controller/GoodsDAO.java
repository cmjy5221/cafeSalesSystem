package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.GoodsVO;

//상품정보 관리용 DAO
public class GoodsDAO {

	// 상품정보를 저장하는 메소드
	public void GoodsMenuRegiste(GoodsVO gvo) {
		Connection con = null;
		PreparedStatement psmt = null;
		String dml = "update goods set g_name=?,g_price=? where g_no=?";

		try {
			con = DBUtill.getConnection();
			psmt = con.prepareStatement(dml);
			psmt.setString(1, gvo.getG_name());
			psmt.setInt(2, gvo.getG_price());
			psmt.setInt(3, gvo.getG_no());

			int i = psmt.executeUpdate();
			System.out.println(i + "행 변경되었습니다.");
		} catch (SQLException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (psmt != null)
					psmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	//버튼을 통해 상품 번호를 받아 상품 이름과 가격을 불러오는 메소드
	public String GoodsMenuNameRead(int i) {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String dml = "select * from goods where g_no=?";
		GoodsVO gvo = null;
		String menu = null;
		try {
			con = DBUtill.getConnection();
			pstm = con.prepareStatement(dml);
			pstm.setInt(1, i);
			rs = pstm.executeQuery();
			while (rs.next()) {
				gvo = new GoodsVO(rs.getInt(1), rs.getString(2), rs.getInt(3));
			}
			menu = gvo.getG_name() + "\n" + gvo.getG_price();
		} catch (SQLException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstm != null)
					pstm.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return menu;
	}

	//주문내역에 추가하기 위한 상품 정보를 불러오는 메소드
	public GoodsVO goodsMenuView(int i) {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String dml = "select * from goods where g_no=?";
		String retStr = null;
		GoodsVO gvo = null;
		try {
			con = DBUtill.getConnection();
			pstm = con.prepareStatement(dml);
			pstm.setInt(1, i);
			rs = pstm.executeQuery();
			while (rs.next()) {
				gvo = new GoodsVO(rs.getString(2), rs.getInt(3));
			}
			retStr = gvo.getG_name();
		} catch (SQLException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstm != null)
					pstm.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return gvo;
	}
}
