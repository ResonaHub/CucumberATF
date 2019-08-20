package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DyamicXLReader {
	FileInputStream fis;
	XSSFWorkbook book;
	XSSFSheet sheet;
	XSSFCell _cell;
	XSSFRow _row;
    int row , column;
	public DyamicXLReader() {
		try {
			fis=new FileInputStream("C:\\Users\\Kailas\\Desktop\\XXF.xlsx");
			book=new XSSFWorkbook(fis);
			sheet=book.getSheetAt(0);
			row = sheet.getLastRowNum()+1;
			System.out.println(row);
			column = sheet.getRow(0).getLastCellNum();
			System.out.println(column);
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Book not found");
		}
		
	}
	
	public void getData() {
		Object [][] obj = new Object[row][column];
		for (int i = 0; i < row; i++) {
			_row = sheet.getRow(i);
			for (int j = 0; j < column; j++) {
				_cell = _row.getCell(j);
				if (_cell.getCellType()==_cell.getCellType().NUMERIC) {
					obj[i][j] = _row.getCell(j).getNumericCellValue();
					System.out.print(obj[i][j]);
				}
				else if (_cell.getCellType()==_cell.getCellType().STRING) {
					obj[i][j] = _row.getCell(j).getStringCellValue();
					System.out.print(" "+obj[i][j]);
				}
				//System.out.println();
			}
			System.out.println();
		}
		//return obj;
		
	}

	public static void main(String[] args) {
		DyamicXLReader ay =new DyamicXLReader();
		ay.getData();
	}

}
