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

//�� ���� ������ DAO
public class CustomerDAO {

	// ȸ�� ��� �޼ҵ�
	public boolean MemberReg(CustomerVO cvo) {
		Connection con = null;
		PreparedStatement pstm = null;
		boolean success = false;
		String dml = "insert into customer values(customer_seq.nextval,?,?,0,sysdate)";// 4��° 0�� ȸ�� ������ �ʱ� ����Ʈ ���� �ǹ�

		try {
			con = DBUtill.getConnection();
			pstm = con.prepareStatement(dml);
			pstm.setString(1, cvo.getC_name());
			pstm.setString(2, cvo.getC_phone());

			int i = pstm.executeUpdate();
			System.out.println(i + "�� ����Ǿ����ϴ�.");
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

	// �˻��� ȸ���̸��� �Է��Ͽ� ã�� �޼ҵ�
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
	}// �޼ҵ� ����

	// ȸ�� ���� ���� �޼ҵ�
	public void Memberdelete(CustomerVO cvo) {
		String dml = "delete from customer where c_name=?";
		Connection con = null;
		PreparedStatement psmt = null;
		try {
			con = DBUtill.getConnection();
			psmt = con.prepareStatement(dml);
			psmt.setString(1, cvo.getC_name());

			int i = psmt.executeUpdate();
			System.out.println(i + "�� �����Ǿ����ϴ�.");
			if (i == 1) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("ȸ�� ����");
				alert.setHeaderText("ȸ�� ���� �Ϸ�.");
				alert.setContentText("ȸ�������� �����Ǿ����ϴ�.");
				alert.showAndWait();
			} else {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("ȸ�� ����");
				alert.setHeaderText("ȸ�� ���� ����.");
				alert.setContentText("ȸ�������� �������� �ʾҽ��ϴ�.");
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
	}// �޼ҵ� ����

	// ȸ�� ����Ʈ ���� �޼ҵ�
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

			System.out.println(i + "�� ����");
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

	// ȸ�� ����Ʈ ��� �޼ҵ�
	public void useMemberPoint(CustomerVO cVo) {
		String dml = "update customer set c_point=c_point-10 where c_no=?";
		Connection con = null;
		PreparedStatement psmt = null;
		try {
			con = DBUtill.getConnection();
			psmt = con.prepareStatement(dml);
			psmt.setInt(1, cVo.getC_no());

			int i = psmt.executeUpdate();

			System.out.println(i + "�� ����");
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

	// Į���̸��� �ҷ��� ���̺� �信 ����ϴ� �޼ҵ�
	public ArrayList<String> getColumnName() {
		ArrayList<String> columnName = new ArrayList<>();

		String sql = "select * from customer";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// ResultSetMetaData ��ü ���� ����
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
	}// �޼ҵ� ����

	// ���̺� �ִ� �ڷ��� ������ �� ������ �ִ´�� �ҷ����� �޼ҵ�
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
