package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.CustomerVO;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

//고객 정보 관리용 DAO
public class CustomerDAO {

	// 회원 등록 메소드
	public boolean MemberReg(CustomerVO cvo) {
		Connection con = null;
		PreparedStatement pstm = null;
		boolean success = false;
		String dml = "insert into customer values(customer_seq.nextval,?,?,0,sysdate)";// 4번째 0은 회원 생성시 초기 포인트 값을 의미

		try {
			con = DBUtill.getConnection();
			pstm = con.prepareStatement(dml);
			pstm.setString(1, cvo.getC_name());
			pstm.setString(2, cvo.getC_phone());

			int i = pstm.executeUpdate();
			System.out.println(i + "행 변경되었습니다.");
			if (i == 1) {
				success = true;
			}

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
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2);
			}
		}
		return success;
	}

	// 검색시 회원이름을 입력하여 찾는 메소드
	public CustomerVO getCustomerCheck(String name) {
		String dml = "select * from customer where c_name like ?";
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		CustomerVO retval = null;
		try {
			con = DBUtill.getConnection();
			pstm = con.prepareStatement(dml);
			pstm.setString(1, name);
			rs = pstm.executeQuery();
			if (rs.next()) {
				retval = new CustomerVO(rs.getString(2), rs.getString(3), rs.getInt(4) + "");
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

	// 회원 정보 삭제 메소드
	public void Memberdelete(CustomerVO cvo) {
		String dml = "delete from customer where c_name=?";
		Connection con = null;
		PreparedStatement psmt = null;
		try {
			con = DBUtill.getConnection();
			psmt = con.prepareStatement(dml);
			psmt.setString(1, cvo.getC_name());

			int i = psmt.executeUpdate();
			System.out.println(i + "행 삭제되었습니다.");
			if (i == 1) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("회원 삭제");
				alert.setHeaderText("회원 삭제 완료.");
				alert.setContentText("회원정보가 삭제되었습니다.");
				alert.showAndWait();
			} else {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("회원 삭제");
				alert.setHeaderText("회원 삭제 실패.");
				alert.setContentText("회원정보가 삭제되지 않았습니다.");
				alert.showAndWait();
			}
		} catch (SQLException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
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
	}// 메소드 종료

	// 회원 포인트 적립 메소드
	public void addMemberPoint(int amount, CustomerVO cVo) {
		String dml = "update customer set c_point=c_point+? where c_no=?";
		Connection con = null;
		PreparedStatement psmt = null;
		try {
			con = DBUtill.getConnection();
			psmt = con.prepareStatement(dml);
			psmt.setInt(1, amount);
			psmt.setInt(2, cVo.getC_no());

			int i = psmt.executeUpdate();

			System.out.println(i + "행 변경");
		} catch (SQLException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (psmt != null)
					psmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
	}

	// 회원 포인트 사용 메소드
	public void useMemberPoint(CustomerVO cVo) {
		String dml = "update customer set c_point=c_point-10 where c_no=?";
		Connection con = null;
		PreparedStatement psmt = null;
		try {
			con = DBUtill.getConnection();
			psmt = con.prepareStatement(dml);
			psmt.setInt(1, cVo.getC_no());

			int i = psmt.executeUpdate();

			System.out.println(i + "행 변경");
		} catch (SQLException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (psmt != null)
					psmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
	}

	// 칼럼이름을 불러와 테이블 뷰에 사용하는 메소드
	public ArrayList<String> getColumnName() {
		ArrayList<String> columnName = new ArrayList<>();

		String sql = "select * from customer";
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
			for (int i = 1; i <= cols; i++) {
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
	}// 메소드 종료

	// 테이블에 있는 자료의 정보와 행 갯수를 있는대로 불러오는 메소드
	public ArrayList<CustomerVO> getCustomerTotal() {
		ArrayList<CustomerVO> list = new ArrayList<>();
		String dml = "select * from customer";

		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		CustomerVO cvo = null;

		try {
			con = DBUtill.getConnection();
			pstm = con.prepareStatement(dml);
			rs = pstm.executeQuery();
			while (rs.next()) {
				cvo = new CustomerVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4) + "",
						rs.getString(5));
				list.add(cvo);
			}
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
				// TODO: handle exception
			}

		}
		return list;

	}
}
