package rahulShettyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scopeLink {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerlink=driver.findElement(By.id("gf-BIG"));
		footerlink.findElements(By.tagName("a"));
		WebElement firstcolumn=footerlink.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		System.out.println(firstcolumn.findElements(By.tagName("a")).size());
		
		for(int i=0; i<firstcolumn.findElements(By.tagName("a")).size(); i++) {
			
			firstcolumn.findElements(By.tagName("a")).get(i).click();
		}
		
		
		
		

	}

}
