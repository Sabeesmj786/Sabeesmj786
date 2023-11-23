package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseClass {
	
	public static String readFromExcel(int rowIndex, int CellIndex) throws IOException {
		
		File file = new File("C:\\Users\\msabe\\eclipse-workspace\\Encapsulation\\src\\test\\resources\\Hdfc.xlsx");
		
		FileInputStream fs = new FileInputStream(file);
		
		Workbook w = new XSSFWorkbook(fs);
		
		Sheet sheet = w.getSheet("Sheet1");
		
		Row row = sheet.getRow(rowIndex);
		
		Cell cell = row.getCell(CellIndex);
		
		int cellType = cell.getCellType();
		
		//cellType = 1 - String, cellType - 0 -Numeric Data
		
		if (cellType==1) {
			String stringCellValue = cell.getStringCellValue();
			return stringCellValue;
			
		} else {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long)numericCellValue;
			String valueOf = String.valueOf(l);
			return valueOf;
		}
	}

}
