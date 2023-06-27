package firstSeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindows {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		String originalWindow=driver.getWindowHandle();
		
		driver.get("http://www.google.com/");
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		String newWindow=driver.getWindowHandle();
		driver.get("http://www.rediff.com");
		
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://www.selenium.dev");
		
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("http://www.google.com/");
		Thread.sleep(2000);
		
		driver.switchTo().window(originalWindow);
		driver.switchTo().window(newWindow);
		
		
		//driver.close();
		//driver.quit();
		
		
		
		
		
	}

}
