package verify;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC01_AboutValidation {
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
	@Test(priority=2)
	public static void aboutValidation() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("About")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println("Alert ,essage:" + alert.getText());
	}
	@AfterClass()
	public static void endTest() {
		driver.close();
		driver.quit();
	}
	
	

	
	
}
