package loginAuthentication;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class dataEntryAutomation {
	
	
	

	public static void main(String[] args) throws InterruptedException, AWTException{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver (co);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("PIM")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText());
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Rahul");
		driver.findElement(By.cssSelector("input[placeholder='Middle Name']")).sendKeys("Pritam");
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Patel");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
		
		
		/*WebElement pic=driver.findElement(By.xpath("//img[@class='employee-image']"));
		pic.click();
		Thread.sleep(2000);
		
		//pic.sendKeys("\\Users\\diptiprajapati\\Desktop\\seleniumtest\\nirav.jpg");
		//Thread.sleep(2000);
		//driver.findElement(By.linkText("//Users//diptiprajapati//eclipse-JavaSeleniumclass//AutomationProject//images//Rahul.jpg"));*/
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
