package webScrapping;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC01_leaveCount {
	
	public static WebDriver driver;
	
	
	@BeforeClass()
	public static void startTest() throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver (co);
		driver.manage().window().maximize();
		Thread.sleep(2000);		
	}
	@Test(priority=1)
	public static void logIn() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(2000);
		}
	@Test (priority=2)
	public static void leavePage() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		WebElement companyTable = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]"));
		List rows = companyTable.findElements(By.className("oxd-table-card"));
		int rowCount = rows.size();
		System.out.println(rowCount);
		int LeaveCount =0;
		for(int i=1;i<=rowCount;i++) {
		String path = "//*[@class=" + "\"oxd-table-body\"]" + "/div[" + i + "]/div[1]/div[3]/div[1]";
		String empName = driver.findElement(By.xpath(path)).getText();
		if(empName.equals("Charlie Carter")) {
		LeaveCount = LeaveCount +1;
		}
		}
		System.out.println("Charlie Carter took leave "+ LeaveCount + " Times." );
		}
	
	@AfterTest
	public static void endTest() throws InterruptedException {
		driver.close();
		driver.quit();
		}
	
	
}
