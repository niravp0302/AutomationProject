package firstSeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver driver=new ChromeDriver();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver (co);
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		boolean displayed=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div[2]/div/div/div/p/select")).isDisplayed();
		System.out.println(displayed);
		boolean enabled=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div[2]/div/div/div/p/select")).isEnabled();
		System.out.println(enabled);
		
		Select dropDown=new Select(driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div[2]/div/div/div/p/select")));
		dropDown.selectByIndex(14);
		Thread.sleep(2000);
		dropDown.selectByValue("BHS");
		dropDown.selectByVisibleText("Australia");
		
		List <WebElement> e=dropDown.getOptions();
		System.out.println(e.size());
		
		
		int i=0;
	
		for(WebElement e1:e) {
			System.out.println(i+"."+ e1.getText());
			i++;
		}
		
		
		
		
		
	}

}
