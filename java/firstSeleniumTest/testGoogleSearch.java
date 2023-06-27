package firstSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testGoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("Learn selenium", Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
		
		

	}

}
