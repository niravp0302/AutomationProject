package loginByExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excelUtility {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public static void main(String[] args) throws IOException {
		
		getRowCount();
		getColCount();
		
		
	}
	
	
	public excelUtility(String excelPath, String sheetName) throws IOException {
		workbook=new XSSFWorkbook(excelPath);
		sheet=workbook.getSheet(sheetName);
		
	}
	
	

	public static int getRowCount() throws IOException {
	int rowCount=0;	
	workbook=new XSSFWorkbook("/Users/diptiprajapati/eclipse-JavaSeleniumclass/AutomationProject/ExcelSheet/LoginSheet.xlsx");
	sheet=workbook.getSheet("Sheet1");
	rowCount=sheet.getPhysicalNumberOfRows();
	System.out.println(rowCount);
	
	return rowCount;
	}
	
	public static int getColCount() throws IOException {	
	int colCount = 0;
	workbook=new XSSFWorkbook("/Users/diptiprajapati/eclipse-JavaSeleniumclass/AutomationProject/ExcelSheet/LoginSheet.xlsx");
	sheet=workbook.getSheet("Sheet1");
	colCount = sheet.getRow(0).getPhysicalNumberOfCells();
	System.out.println(colCount);
	return colCount;
	}
	
	public static String getCellData(int rowNum, int colNum) throws IOException {
	String cellData=null;
	workbook=new XSSFWorkbook("/Users/diptiprajapati/eclipse-JavaSeleniumclass/AutomationProject/ExcelSheet/LoginSheet.xlsx");
	sheet=workbook.getSheet("Sheet1");
	cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
	System.out.println(cellData);
	return cellData;
	}
		
			
	
	
	
}
