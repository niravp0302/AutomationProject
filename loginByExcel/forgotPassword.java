package loginByExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class forgotPassword {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver (co);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// Scenario- To compare actual and expected
		WebElement actualmsg = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p"));
		actualmsg.click();
		
		
		String actual=actualmsg.getText();
		System.out.println("Actual message:"+actual);
		
		String expected="Forgot your password?";
		
		if(actual.equals(expected))
		{
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
	
		
		
		
		
		
		
		/*
		// Scenario-Actions- To perform various actions on elements
		WebElement perf = driver.findElement(By.xpath("//a[@id='menu__Performance']/b"));
		
		Actions act=new Actions(driver);
		act.moveToElement(perf).click().perform();
		
		WebElement empTrack = driver.findElement(By.xpath("//a[@id='menu_performance_viewEmployeePerformanceTrackerList']"));
		Actions act1=new Actions(driver);
		act1.moveToElement(empTrack).click().perform();
		*/
		
		
		// Scenario-Select- Selecting from a drop down menu
		/*WebElement leave = driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
		Actions act=new Actions(driver);
		act.moveToElement(leave).click().perform();
		
		WebElement subUnit = driver.findElement(By.xpath("//select[@id='leaveList_cmbSubunit']"));
		Select sel=new Select(subUnit);
		sel.selectByVisibleText("Engineering");
		
		driver.close();*/
	}
		
	}


