package formSubmit;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import loginByExcel.loginFunction;




public class TC01_FormSubmit {

	
	public static void main(String[] args, Object wait) throws InterruptedException{	
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver (co);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("(//button[normalize-space()='Login'])[1]")).click();
		
		
		driver.findElement(By.linkText("My Info")).click();
		
		driver.findElement(By.linkText("Personal Details")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("Peter");
		driver.findElement(By.xpath("(//input)[5]")).sendKeys("Nik");
		driver.findElement(By.xpath("(//input)[7]")).sendKeys("555");
		driver.findElement(By.xpath("(//input)[8]")).sendKeys("K7658765498");
		
		driver.findElement(By.xpath("(//input)[9]")).sendKeys("2024-12-12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[10]")).sendKeys("75463");
		
		Actions a=new Actions(driver);
		a.sendKeys(driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[1]")), "Indian").build().perform();
		
		 
		 
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
	
				
		
}
	
	
}
