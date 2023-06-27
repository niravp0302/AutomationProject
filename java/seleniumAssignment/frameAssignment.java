package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class frameAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[2]/ul[1]/li[1]/a")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(2);
		driver.findElement(By.linkText("org.openqa.selenium.bidi")).click();
		
		Thread.sleep(5000);
		
		


	}

}
