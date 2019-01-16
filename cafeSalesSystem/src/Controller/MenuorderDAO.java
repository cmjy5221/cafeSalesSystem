package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sun.javafx.scene.layout.region.RepeatStruct;

import Model.MenuorderVO;

//메뉴판 관련 DAO
public class MenuorderDAO {
	// 주문내역 테이블 뷰에 표시할 자료를 입력하는 메소드
	public void MenuViewInsert(MenuorderVO tvo) {
		String dml = "insert into menuorder values (menuorder_seq.nextval,?,?,?,?,?,?)";
		Connection con = null;
		PreparedStatement pstm = null;

		try {
			con = DBUtill.getConnection();
			pstm = con.prepareStatement(dml);
			pstm.setString(1, tvo.getM_name());
			pstm.setInt(2, tvo.getM_price());
			pstm.setInt(3, tvo.getM_amount());
			pstm.setInt(4, tvo.getM_allprice());
			pstm.setString(5, tvo.getM_hotorice());
			pstm.setString(6, tvo.getM_takeout());

			int i = pstm.executeUpdate();
			System.out.println(i + "행 입력됨");
		} catch (SQLException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (pstm != null)
					pstm.close();
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
	}

	// 선택한 주문 내역의 상품의 갯수를 증가시키는 메소드
	public void setMenuAmountPlus(MenuorderVO mVo) {
		String dml = "update menuorder set m_amount=m_amount+1,m_allprice=(m_amount+1)*m_price where m_code=?";
		Connection con = null;
		PreparedStatement pstm = null;

		try {
			con = DBUtill.getConnection();
			pstm = con.prepareStatement(dml);
			pstm.setInt(1, mVo.getM_code());
			int i = pstm.executeUpdate();
			System.out.println(i + "행 변경됨");
		} catch (SQLException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (pstm != null)
					pstm.close();
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
	}

	// 선택한 주문 내역의 상품의 갯수를 감소시키는 메소드
	public void setMenuAmountMinus(MenuorderVO mVo) {
		String dml = "update menuorder set m_amount=m_amount-1,m_allprice=(m_amount-1)*m_price where m_code=?";
		Connection con = null;
		PreparedStatement pstm = null;

		try {
			con = DBUtill.getConnection();
			pstm = con.prepareStatement(dml);
			pstm.setInt(1, mVo.getM_code());
			int i = pstm.executeUpdate();
			System.out.println(i + "행 변경됨");
		} catch (SQLException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (pstm != null)
					pstm.close();
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
	}

	// 현재 주문내역에 등록된 상품들의 총갯수의 합과 가격의 총합을 구해 int배열로 반환하는 메소드
	public int[] setTextCalculation() {
		String dml = "select sum(m_amount),sum(m_allprice) from menuorder";
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		int[] sum = null;
		try {
			con = DBUtill.getConnection();
			pstm = con.prepareStatement(dml);
			rs = pstm.executeQuery();
			while (rs.next()) {
				sum = new int[] { rs.getInt(1), rs.getInt(2) };
			}
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
		return sum;
	}

	// 선택한 주문내역의 상품을 한 행 취소하는 메소드
	public void setOneMenuListDelete(MenuorderVO mVo) {
		String dml = "delete from menuorder where m_code=?";
		Connection con = null;
		PreparedStatement pstm = null;

		try {
			con = DBUtill.getConnection();
			pstm = con.prepareStatement(dml);
			pstm.setInt(1, mVo.getM_code());

			int i = pstm.executeUpdate();
			System.out.println(i + "행 제거되었습니다.");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			try {
				if (pstm != null)
					pstm.close();
				if (con != null)
					con.close();
			} catch (SQLException e2) {

			}
		}
	}

	// 모든 주문내역을 삭제하는 메소드
	public void setTotalMenuListDelete() {
		String dml = "delete from menuorder";
		Connection con = null;
		PreparedStatement pstm = null;

		try {
			con = DBUtill.getConnection();
			pstm = con.prepareStatement(dml);

			int i = pstm.executeUpdate();
			System.out.println(i + "행 제거되었습니다.");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			try {
				if (pstm != null)
					pstm.close();
				if (con != null)
					con.close();
			} catch (SQLException e2) {

			}
		}

	}

	// 주문내역 테이블 뷰에 중복된 상품의 여부를 확인하는 메소드
	public boolean getMenuName(String name, String hOrI, String takeOut) {
		String dml = "select * from menuorder where m_name=? and m_hotorice=? and m_takeout=?";
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		boolean menuExist = false;
		try {
			con = DBUtill.getConnection();
			pstm = con.prepareStatement(dml);
			pstm.setString(1, name);
			pstm.setString(2, hOrI);
			pstm.setString(3, takeOut);
			rs = pstm.executeQuery();
			if (rs.next()) {
				menuExist = true;
			}
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
		return menuExist;
	}

	// 주문내역의 중복된 상품이 있을 경우 해당 상품의 갯수를 하나 증가 시키는 메소드
	public void setAmountOnePlus(String name, String hOrI, String takeOut) {
		String dml = "update menuorder set m_amount=m_amount+1,m_allprice=(m_amount+1)*m_price where m_name=? and m_hotorice=? and m_takeout=? ";
		Connection con = null;
		PreparedStatement pstm = null;
		try {
			con = DBUtill.getConnection();
			pstm = con.prepareStatement(dml);
			pstm.setString(1, name);
			pstm.setString(2, hOrI);
			pstm.setString(3, takeOut);

			int i = pstm.executeUpdate();
			System.out.println(i + "행 변경");
		} catch (SQLException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (pstm != null)
					pstm.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	//테이블 뷰에 표시할 열의 갯수를 불러오는 메소드
	public ArrayList<String> getColumnName() {
		ArrayList<String> columnName = new ArrayList<>();

		String sql = "select * from menuorder";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// ResultSetMetaData 객체 변수 선언
		ResultSetMetaData rsmd = null;
		try {
			con = DBUtill.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rsmd = rs.getMetaData();
			int cols = rsmd.getColumnCount();
			for (int i = 2; i <= cols; i++) {
				columnName.add(rsmd.getColumnName(i));

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
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return columnName;
	}
	//테이블 뷰에 표시할 데이터의 목록을 배열(리스트)로 받아오는 메소드
	public ArrayList<MenuorderVO> getMenuViewTotal() {
		ArrayList<MenuorderVO> list = new ArrayList<>();
		String dml = "select * from menuorder";

		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		MenuorderVO tvo = null;

		try {
			con = DBUtill.getConnection();
			pstm = con.prepareStatement(dml);
			rs = pstm.executeQuery();
			while (rs.next()) {
				tvo = new MenuorderVO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5),
						rs.getString(6), rs.getString(7));
				list.add(tvo);
			}
			System.out.println(tvo.toString());
		} catch (SQLException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstm != null)
					pstm.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
		return list;

	}
}
