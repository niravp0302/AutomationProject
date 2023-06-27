package excelUtility;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtilityDemo {

	public static void main(String[] args) {
		
		
		
		
	}

	
	public static void getRowCount() throws IOException {
		
		XSSFWorkbook workbook=new XSSFWorkbook("/Users/diptiprajapati/eclipse-JavaSeleniumclass/NewSeleniumTest/ExcelSheets");
		XSSFSheet sheet=workbook.getSheet("Sheet1");
	}


	
}
