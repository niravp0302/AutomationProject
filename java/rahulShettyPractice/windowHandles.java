package rahulShettyPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.cssSelector("a[href*='windows']")).click();
		Set<String> abc=driver.getWindowHandles();
		Iterator<String>it=abc.iterator();
		String Parentwindow=it.next();
		String childWindow=it.next();
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		driver.switchTo().window(Parentwindow);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText());

	}

}
