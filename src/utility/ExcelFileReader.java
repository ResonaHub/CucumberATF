package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import keyword.Constants;

public class ExcelFileReader {
	public static void readXSSF(String path, String SheetName) throws IOException {
		try {
			Constants.fis = new FileInputStream(path);
			Constants.book = new XSSFWorkbook(Constants.fis);
			Constants.sheet = Constants.book.getSheet(SheetName);
			
			int lastRow = Constants.sheet.getLastRowNum();
			for (int i = 0; i <= lastRow; i++) {
				Row row = Constants.sheet.getRow(i);
				int coll = row.getLastCellNum();
			
				for (int j = 0; j < coll; j++) {
					Cell cell = row.getCell(j);
					if (cell.getCellType().name().equals("STRING")) {
						System.out.print(cell.getStringCellValue() + "\t");
					} else if (cell.getCellType().name().equals("NUMERIC")) {
						System.out.print(cell.getNumericCellValue() + "\t");
					} else if (cell.getCellType().name().equals("BOOLEAN")) {
						System.out.print(cell.getBooleanCellValue() + "\t");
					} else {
						System.out.print(cell.getErrorCellValue() + "\t");
					}
				}

			}
		} catch (FileNotFoundException e) {
			System.err.println("File not found...Please enter correct path");
		}
	}

}
