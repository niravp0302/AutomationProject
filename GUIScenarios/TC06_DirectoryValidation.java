package GUIScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC06_DirectoryValidation {
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
		public static void directory() throws InterruptedException {
		driver.findElement(By.linkText("Directory")).click();
		Thread.sleep(2000);
		WebElement titleValidation=driver.findElement(By.xpath("(//h6[normalize-space()='Directory'])[1]"));
		System.out.println(titleValidation.getText());
		//Verify Title is displayed
		
		if(titleValidation.isDisplayed()) {
			System.out.println("Title is displayed");
		}else {
			System.out.println("Title s not displayed");
		}
		
		//Validating Actual & Expected Text
		String expectedText="Directory";
		String actualText=titleValidation.getText();
		System.out.println(actualText);
		if(actualText.equals(expectedText)) {
			System.out.println("The actual & expected text are same. The Title value is "+actualText);
		}else {
			System.out.println("The actual & expected text are not same. The Title value is not "+actualText);
		}
		
	}
	@AfterClass()
	public static void endTest() {
		driver.close();
		driver.quit();
	}
}
