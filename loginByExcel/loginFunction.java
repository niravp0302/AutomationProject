package loginByExcel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class loginFunction {
	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
	
		startBrowser();
	

	}
		public static void startBrowser() throws InterruptedException {
			
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			WebDriver driver= new ChromeDriver (co);
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();

			String title=driver.getTitle();
			if(title.equals("OrangeHRM")) {
				System.out.println("Correct Title");
			}else {
				System.out.println("Incorrect Title");
			}
			Thread.sleep(2000);
			WebElement actualmsg = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p"));
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
			
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("(//button[normalize-space()='Login'])[1]")).click();
			Thread.sleep(2000);
			
		
			
			
			
			
			
			
		
		}
		
		/*public class Automation {

			public static void main(String[] args) throws InterruptedException {
				
				System.setProperty("webdriver.chrome.driver","C:/Users/NAKUL LAKHOTIA/Documents/selenium/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				// Scenario- To login to a page
				String baseUrl = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
				driver.get(baseUrl);
				
				WebElement userName = driver.findElement(By.xpath("//div/input[@name='txtUsername']"));
				userName.sendKeys("Admin");
				  
				WebElement pass = driver.findElement(By.xpath("//div/input[@name='txtPassword']"));
				pass.sendKeys("admin123");
				
				WebElement login = driver.findElement(By.xpath("//div/input[@type='submit']"));
				login.click();
				
				// sleep for 3 seconds (implicit & explicit wait)
				Thread.sleep(3000);
				
				/*
				// Scenario- To compare actual and expected
				
				WebElement actualmsg = driver.findElement(By.xpath("//div[@id='forgotPasswordLink']/a"));
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
				*/
				
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
				
				driver.close();
			}

		}*/
		
}
		
		
	


