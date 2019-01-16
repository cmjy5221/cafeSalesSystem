package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.PurchaseVO;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.DatePicker;

//���� ���� ���� DAO
public class PurchaseDAO {
	// ���ų����� �߰��ϴ� �޼ҵ�
	public void insertPurchase(PurchaseVO pVo) {
		String dml = "insert into purchase values (purchase_seq.nextval,?,sysdate,?,?,?,?,?,?)";

		Connection con = null;
		PreparedStatement pstm = null;

		try {
			con = DBUtill.getConnection();
			pstm = con.prepareStatement(dml);
			pstm.setInt(1, pVo.getC_no());
			pstm.setInt(2, pVo.getTotal());
			pstm.setInt(3, pVo.getAmount());
			pstm.setString(4, pVo.getWay());
			pstm.setInt(5, pVo.getRmoney());
			pstm.setInt(6, pVo.getCmoney());
			pstm.setInt(7, pVo.getTmoney());

			int i = pstm.executeUpdate();
			System.out.println(i + "�� �ԷµǾ����ϴ�.+");
			if (i == 1) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("�Ǹų��� ��� ����");
				alert.setHeaderText("��� �Ϸ�");
				alert.setContentText("��� ����!!");
				alert.showAndWait();
			} else {
				Alert alert = new Alert(AlertType.WARNING);
				alert.setTitle("�Ǹų��� ��� ����");
				alert.setHeaderText("��� ����");
				alert.setContentText("��� ����!!");
				alert.showAndWait();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null)
					pstm.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	// ���ų������̺��� ���� ������ �޾ƿ��� �޼ҵ�
	public ArrayList<String> getColumnName() {
		ArrayList<String> columnName = new ArrayList<>();

		String sql = "select * from purchase";
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
	}

	// ���ų��� ���̺��� �����͸� �޾� �迭�� ��ȯ�ϴ� �޼ҵ�
	public ArrayList<PurchaseVO> getPurchaseTotal() {
		ArrayList<PurchaseVO> list = new ArrayList<>();
		String dml = "select * from purchase";

		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		PurchaseVO pVo = null;

		try {
			con = DBUtill.getConnection();
			pstm = con.prepareStatement(dml);
			rs = pstm.executeQuery();
			while (rs.next()) {
				pVo = new PurchaseVO(rs.getInt(1), rs.getInt(2), rs.getDate(3) + "", rs.getInt(4), rs.getInt(5),
						rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getInt(9));
				list.add(pVo);
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
				e2.printStackTrace();
			}

		}
		return list;

	}

	// Ư�� ��¥�� ���ų����� �޾ƿ������� �޼ҵ�
	public ArrayList<PurchaseVO> salesDateSearch(DatePicker dpDate) {
		String dml = "select * from purchase where sdate>=to_date(?) and sdate<((to_date(?))+1)";
		PurchaseVO pVo = null;
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		ArrayList<PurchaseVO> list = new ArrayList<>();
		try {
			con = DBUtill.getConnection();
			pstm = con.prepareStatement(dml);
			pstm.setString(1, dpDate.getValue().toString());
			pstm.setString(2, dpDate.getValue().toString());
			rs = pstm.executeQuery();
			while (rs.next()) {
				pVo = new PurchaseVO(rs.getInt(1), rs.getInt(2), rs.getDate(3) + "", rs.getInt(4), rs.getInt(5),
						rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getInt(9));
				list.add(pVo);
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
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
		return list;
	}

	// �ٱ׷����� �׸������� ��¥�� �ش��� �� ���� �����͸� �޾ƿ��� �׷���
	public ArrayList<PurchaseVO> barChart() {
		PurchaseVO pVo = null;
		ArrayList<PurchaseVO> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "select * from (select to_date(sdate,'yyyy-mm-dd'),sum(tmoney) from purchase group by to_date(sdate,'yyyy-mm-dd') order by to_date(sdate,'yyyy-mm-dd') desc)";

		try {
			con = DBUtill.getConnection();
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();

			while (rs.next()) {
				pVo = new PurchaseVO(rs.getDate(1) + "", rs.getInt(2));
				list.add(pVo);
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
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
		return list;
	}
}
