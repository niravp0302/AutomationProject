package GUIScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC08_MyTracker {

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
	public static void performance() throws InterruptedException {
		driver.findElement(By.linkText("Performance")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]")).click();
	}
	@AfterClass()
	public static void endTest() {
		driver.close();
		driver.quit();
	}
	
}
