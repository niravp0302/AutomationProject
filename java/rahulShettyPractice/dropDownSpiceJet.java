package rahulShettyPractice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class dropDownSpiceJet {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		Thread.sleep(2000);
		
		
		driver.findElement(By.className("col-lg-3")).click();
		boolean displayed =driver.findElement(By.className("col-lg-3")).isDisplayed();
		System.out.println(displayed);
		
		boolean enebled =driver.findElement(By.className("col-lg-3")).isEnabled();
		System.out.println(enebled);
		
		Select dropDown =new Select (driver.findElement(By.className("col-lg-3")));
		List <WebElement> e=dropDown.getOptions();
		System.out.println(e.size());
		dropDown.selectByIndex(2);
		
	
		
	
			
		}
		
		
	}


