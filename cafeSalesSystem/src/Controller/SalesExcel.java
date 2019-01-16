package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Model.PurchaseVO;

public class SalesExcel {

	public boolean xlsxWiter(List<PurchaseVO> list, String saveDir) {
		// ��ũ�� ����
		XSSFWorkbook workbook = new XSSFWorkbook();
		// ��ũ��Ʈ ����
		XSSFSheet sheet = workbook.createSheet();
		// �� ����
		XSSFRow row = sheet.createRow(0);
		// �� ����
		XSSFCell cell;
		// ��� ���� ����
		cell = row.createCell(0);
		cell.setCellValue("��ȣ");
		cell = row.createCell(1);
		cell.setCellValue("�Ǹų�¥");
		cell = row.createCell(2);
		cell.setCellValue("�Ǻ��Ǹž�");
		cell = row.createCell(3);
		cell.setCellValue("�Ǻ��Ǹŷ�");
		cell = row.createCell(4);
		cell.setCellValue("�ǸŹ��");
		cell = row.createCell(5);
		cell.setCellValue("���ݸ���");
		cell = row.createCell(6);
		cell.setCellValue("ī�����");
		cell = row.createCell(7);
		cell.setCellValue("�Ѹ���");

		int amount = 0;
		int total=0;
		// ����Ʈ�� size ��ŭ row�� ����
		PurchaseVO vo;
		for (int rowidx = 0; rowidx < list.size(); rowidx++) {
			vo = list.get(rowidx);

			// �� ����
			row = sheet.createRow(rowidx + 1);

			cell = row.createCell(0);
			cell.setCellValue(vo.getNo());
			cell = row.createCell(1);
			cell.setCellValue(vo.getSdate());
			cell = row.createCell(2);
			cell.setCellValue(vo.getTotal());
			cell = row.createCell(3);
			cell.setCellValue(vo.getAmount());
			cell = row.createCell(4);
			cell.setCellValue(vo.getWay());
			cell = row.createCell(5);
			cell.setCellValue(vo.getRmoney());
			cell = row.createCell(6);
			cell.setCellValue(vo.getCmoney());
			cell = row.createCell(7);
			cell.setCellValue(vo.getTmoney());
			amount+=vo.getAmount();
			total+=vo.getTotal();
		}

		row=sheet.createRow(list.size()+2);
		cell=row.createCell(1);
		cell.setCellValue("���Ǹŷ� : ");
		cell=row.createCell(2);
		cell.setCellValue(amount);
		cell=row.createCell(3);
		cell.setCellValue("���Ǹž� : ");
		cell=row.createCell(4);
		cell.setCellValue(total);
		
		// �Էµ� ���� ���Ϸ� ����
		String strReportPDFName = "sales_" + System.currentTimeMillis() + ".xlsx";
		File file = new File(saveDir + "\\" + strReportPDFName);
		FileOutputStream fos = null;

		boolean saveSuccess;
		saveSuccess = false;
		try {
			fos = new FileOutputStream(file);
			if (fos != null) {
				workbook.write(fos);
				saveSuccess = true;
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			try {
				if (workbook != null) {
					workbook.close();
				}
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e2) {
				e2.printStackTrace();
				// TODO: handle exception
			}
		}
		return saveSuccess;

	}
}
