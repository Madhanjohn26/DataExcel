package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public String getda() throws IOException {
		
	Map<String, String> m = new LinkedHashMap<String, String>();
	File f = new File("C:\\Users\\PC\\Desktop\\Madhan Course\\Esclipe\\DataDriven\\User_Details.xlsx");
	FileInputStream fis =  new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet sheetAt = wb.getSheetAt(0);
	int rowSize = sheetAt.getPhysicalNumberOfRows();
	for (int i = 0; i < rowSize; i++) {
		Row row = sheetAt.getRow(i);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			return stringCellValue;
			
		}
		
	}
	return null;
	
	
}
}



