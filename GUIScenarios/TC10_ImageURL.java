package GUIScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import loginByExcel.loginFunction;
import verify.compare;

public class TC10_ImageURL extends loginFunction{
	
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
	public static void imageURL() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img")).click();
		String actualURL=driver.getCurrentUrl();
		System.out.println(actualURL);
		String expURL="https://www.orangehrm.com/";
		if(actualURL.equals(expURL)) {
			System.out.println("OrangeHRM logo URL is compared with " + expURL);
		}else 
		{
			System.out.println("OrangeHRM logo URL is not compared with " + expURL);
		}
		
	
	}
	@AfterClass()
	public static void endTest() {
		driver.close();
		driver.quit();
	}
}
