package firstSeleniumTest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsersize {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com/");
		
		Thread.sleep(2000);
		int width = driver.manage().window().getSize().getWidth();
		int height= driver.manage().window().getSize().getHeight();
		
		System.out.println(width);
		System.out.println(height);
		
		driver.manage().window().setSize(new Dimension (300, 400));
		Dimension size=driver.manage().window().getSize();
		int height1=size.getHeight();
		int width1=size.getWidth();
		
	System.out.println(height1);
	System.out.println(width1);
	}

	
}
