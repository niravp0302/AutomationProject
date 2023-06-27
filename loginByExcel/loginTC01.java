package loginByExcel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginTC01 {
	
	public static WebDriver driver;
	static String baseUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	@BeforeClass()
	public static void startTest() throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver (co);
		driver.get(baseUrl);
		Thread.sleep(2000);		
	}
	
	@DataProvider (name = "testData")

	public Object[][] getData() throws IOException{
		
				
		String excePath = "/Users/diptiprajapati/eclipse-JavaSeleniumclass/AutomationProject/ExcelSheet/LoginSheet.xlsx";
		String sheetName = "Sheet1";
		Object testData[][] = testData(excePath, sheetName);
		
		return testData;
	}
	
	@Test(dataProvider ="testData")
	public void test1(String username, String password) throws InterruptedException {
		
		
		driver.get(baseUrl);
		Thread.sleep(2000);	
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("(//button[normalize-space()='Login'])[1]")).click();
		Thread.sleep(3000);
	}
	
	
	public static Object [][] testData(String excePath, String sheetName) throws IOException {
		excelUtility excelUtilObj = new excelUtility(excePath, sheetName);
		
		int rowCount = excelUtilObj.getRowCount();
		int colCount = excelUtilObj.getColCount();
		
		Object data[][] = new Object[rowCount-1][colCount];

		for (int i=1; i<rowCount;i++) {
			for (int j=0;j<colCount;j++) {
				String cellData = excelUtilObj.getCellData(i, j);
				data[i-1][j] = cellData;
			}
			System.out.println();
		}
		
		return data;
	}
	@AfterClass()
	public static void endTest() {
		driver.close();
		driver.quit();
	}
	
	

}
