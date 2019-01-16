package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.StaffVO;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class StaffRegDAO {

	public boolean registeStaff(StaffVO svo){
		String dml = "insert into staff values (staff_seq.nextval,?,?,?,?,?)";

		Connection con = null;
		PreparedStatement pstm = null;
		boolean regSuccess = false;

		try {
			con = DBUtill.getConnection();
			pstm = con.prepareStatement(dml);
			pstm.setString(1, svo.getS_name());
			pstm.setString(2, svo.getS_phone());
			pstm.setString(3, svo.getS_ID());
			pstm.setString(4, svo.getS_PW());
			pstm.setString(5, svo.getS_job());
			int i = pstm.executeUpdate();

			if (i == 1) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("직원 등록 성공");
				alert.setHeaderText("등록 완료");
				alert.setContentText("등록 성공!!");
				alert.showAndWait();
				regSuccess = true;
			} else {
				Alert alert = new Alert(AlertType.WARNING);
				alert.setTitle("직원 등록 성공");
				alert.setHeaderText("등록 실패");
				alert.setContentText("등록 실패!!");
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
		return regSuccess;

	}// 등록 메소드 종료
	
	public boolean getIdOverlap(String id){
		String dml="select * from staff where s_id=?";
		Connection con=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		boolean idOver=false;
		
		try {
		con=DBUtill.getConnection();
		pstm=con.prepareStatement(dml);
		pstm.setString(1, id);
		rs=pstm.executeQuery();
		
		if(rs.next()) {
			idOver=true;
		}
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstm!=null)pstm.close();
				if(con!=null)con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
		return idOver;
	}//아이디 중복 확인 메소드 종료
}
