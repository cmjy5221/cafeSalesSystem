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
		// 워크북 생성
		XSSFWorkbook workbook = new XSSFWorkbook();
		// 워크시트 생성
		XSSFSheet sheet = workbook.createSheet();
		// 행 생성
		XSSFRow row = sheet.createRow(0);
		// 셀 생성
		XSSFCell cell;
		// 헤더 정보 구성
		cell = row.createCell(0);
		cell.setCellValue("번호");
		cell = row.createCell(1);
		cell.setCellValue("판매날짜");
		cell = row.createCell(2);
		cell.setCellValue("건별판매액");
		cell = row.createCell(3);
		cell.setCellValue("건별판매량");
		cell = row.createCell(4);
		cell.setCellValue("판매방식");
		cell = row.createCell(5);
		cell.setCellValue("현금매출");
		cell = row.createCell(6);
		cell.setCellValue("카드매출");
		cell = row.createCell(7);
		cell.setCellValue("총매출");

		int amount = 0;
		int total=0;
		// 리스트의 size 만큼 row를 생성
		PurchaseVO vo;
		for (int rowidx = 0; rowidx < list.size(); rowidx++) {
			vo = list.get(rowidx);

			// 행 생성
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
		cell.setCellValue("총판매량 : ");
		cell=row.createCell(2);
		cell.setCellValue(amount);
		cell=row.createCell(3);
		cell.setCellValue("총판매액 : ");
		cell=row.createCell(4);
		cell.setCellValue(total);
		
		// 입력된 내용 파일로 쓰기
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
