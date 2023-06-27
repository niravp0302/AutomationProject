package loginAuthentication;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class employeeDataProvider {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public static void main(String[] args) throws IOException {
		getRowCount1();
		getColCount1();
		getCellData(1, 3);

	}
	
	public employeeDataProvider(String excelPath, String sheetName) throws IOException {
		workbook=new XSSFWorkbook(excelPath);
		sheet=workbook.getSheet(sheetName);
		
	}
	
	
	public static int getRowCount1() throws IOException {
		int rowCount=0;	
		workbook=new XSSFWorkbook("/Users/diptiprajapati/eclipse-JavaSeleniumclass/AutomationProject/ExcelSheet/Employee info.xlsx");
		sheet=workbook.getSheet("Sheet1");
		rowCount=sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		
		return rowCount;
		}
	public static int getColCount1() throws IOException {	
		int colCount = 0;
		workbook=new XSSFWorkbook("/Users/diptiprajapati/eclipse-JavaSeleniumclass/AutomationProject/ExcelSheet/Employee info.xlsx");
		sheet=workbook.getSheet("Sheet1");
		colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(colCount);
		return colCount;
		}
	public static String getCellData(int rowNum, int colNum) throws IOException {
		String cellData=null;
		workbook=new XSSFWorkbook("/Users/diptiprajapati/eclipse-JavaSeleniumclass/AutomationProject/ExcelSheet/Employee info.xlsx");
		sheet=workbook.getSheet("Sheet1");
		cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		System.out.println(cellData);
		return cellData;
		}

	
	}
	
	
	


