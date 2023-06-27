package GUIScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC07_SupportPage {
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
		public static void supportPage() throws InterruptedException {
		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> menu=driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul"));
		for(WebElement element: menu) {
			if(element.getText().equalsIgnoreCase("Support")) {
				Thread.sleep(5000);
				System.out.println(element.getText());
				element.click();
			}
		}
	}
		@AfterClass()
		public static void endTest() {
			driver.close();
			driver.quit();
		}
}
