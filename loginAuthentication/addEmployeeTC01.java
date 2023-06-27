package loginAuthentication;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import loginByExcel.excelUtility;

public class addEmployeeTC01 {

	static WebDriver driver = null;
	String username, password;
	String Firstname, Middlename, Lastname;
	
	@BeforeClass()
	public static void startTest() {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver (co);				
	}
	
	@DataProvider (name = "testData2")

	public Object[][] getData() throws IOException{
		
				
		String excelPath = "/Users/diptiprajapati/eclipse-JavaSeleniumclass/AutomationProject/ExcelSheet/Employee info.xlsx";
		String sheetName = "Sheet1";
		Object testData[][] = testData2(excelPath, sheetName);
		
		return testData;
	}
	
	@Test(dataProvider ="testData2")
	public void test2(String username, String password,String Firstname, String Middlename, String Lastname) throws InterruptedException {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("(//button[normalize-space()='Login'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("PIM")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys(Firstname);
		driver.findElement(By.cssSelector("input[placeholder='Middle Name']")).sendKeys(Middlename);
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(Lastname);
		driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
		Thread.sleep(2000);
	}
	
	
	public static Object [][] testData2(String excelPath, String sheetName) throws IOException {
		employeeDataProvider empdataobj = new employeeDataProvider(excelPath, sheetName);
		
		int rowCount = empdataobj.getRowCount1();
		int colCount = empdataobj.getColCount1();
		
		Object data[][] = new Object[rowCount-1][colCount];

		for (int i=1; i<rowCount;i++) {
			for (int j=0;j<colCount;j++) {
				String cellData = empdataobj.getCellData(i, j);
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
