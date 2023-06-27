package guru99;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testCase1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://live.techpanda.org/index.php/");
		System.out.println( driver.getTitle());
		driver.findElement(By.linkText("MOBILE")).click();
		Boolean Displayed=driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")).isDisplayed();
		System.out.println(Displayed);
		Boolean enebled=driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")).isEnabled();
		System.out.println(enebled);
		
		Select dropDrown=new Select(driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")));
		dropDrown.selectByIndex(1);
		List<WebElement> e=dropDrown.getOptions();
		System.out.println(e.size());
		
		
	
		

	}

}
