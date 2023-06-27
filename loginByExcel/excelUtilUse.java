package loginByExcel;

import java.io.IOException;

public class excelUtilUse {

	public static void main(String[] args) throws IOException {
		excelUtility excelutilobj=new excelUtility("/Users/diptiprajapati/eclipse-JavaSeleniumclass/AutomationProject/ExcelSheet/LoginSheet.xlsx", "Sheet1");
		excelutilobj.getRowCount();
		excelutilobj.getCellData(1, 1);

	}

}
