package firstSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class imageTest {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.className("lnXbpd")).getTagName();
	
		boolean imagePresent=driver.findElement(By.className("lnXbpd")).isDisplayed();
		System.out.println(imagePresent);
		
		boolean imageEnebled=driver.findElement(By.className("lnXbpd")).isEnabled();
		System.out.println(imageEnebled);
		
		boolean imageSelected=driver.findElement(By.className("lnXbpd")).isSelected();
		System.out.println(imageSelected);
		
	}

}
