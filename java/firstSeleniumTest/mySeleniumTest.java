package firstSeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mySeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com/");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//driver.manage().window().minimize();
		//Thread.sleep(2000);
		
		//driver.manage().window().fullscreen();
		//Thread.sleep(2000);
		
		driver.navigate().to("https://www.selenium.dev/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		String title=driver.getTitle();
		if (title.equals("Selenium"))
		{
			System.out.println("This is Selenium");
		}else
		{
			System.out.println("This is not Selenium");
		}
		
		driver.close();
		
		
		
	}
}
