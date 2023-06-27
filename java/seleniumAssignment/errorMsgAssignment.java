package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class errorMsgAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/diptiprajapati/Downloads/chromedriver_mac64");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("gb_m")).click();
		
		driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
		
		driver.findElement(By.id("identifierId")).sendKeys("selenium123@gmail.com");
		WebElement Email= driver.findElement(By.id("identifierId"));
		Email.clear();
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		String actual_msg=driver.findElement(By.className("o6cuMc")).getText();
		String expected_msg= "Enter an email or phone number";
		Assert.assertEquals(actual_msg, expected_msg);
		driver.close();
		driver.quit();
	}
}
