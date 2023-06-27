package firstSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testGmail {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.className("gb_j")).click();
		
		driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
		WebElement emailID= driver.findElement(By.id("identifierId"));
		
		emailID.sendKeys("india123@gmail.com");
		Thread.sleep(2000);
		
		String emailIDnput= emailID.getAttribute("value");
		System.out.println(emailIDnput);
		
		String type=emailID.getAttribute("type");
		System.out.println(type);
		emailID.clear();
		
		driver.close();
		driver.quit();
		
		
		
		
		
		

	}

}
