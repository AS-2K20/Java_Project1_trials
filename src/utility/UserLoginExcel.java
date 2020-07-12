package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UserLoginExcel {
public static void main(String[] args) {
	try {
		List<String> data = new ArrayList<String>();
		List<String> sheetData = new ArrayList<String>();
		FileInputStream file = new FileInputStream(new File("../userLoginDetails.xlsx"));
		XSSFWorkbook workBook = new XSSFWorkbook (file);
		XSSFSheet sheet = workBook.getSheetAt(0);
		Iterator<Row> rowIterator = sheet.iterator();
		while(rowIterator.hasNext()) {
			Row row = rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			while(cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				switch(cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue()+"t");
					data.add(cell.getStringCellValue());
					break;
				case BLANK:
					System.out.print("");
				}
			}
			sheetData.addAll(data);
		}
		file.close();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
}
