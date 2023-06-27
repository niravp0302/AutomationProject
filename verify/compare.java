package verify;

import org.openqa.selenium.WebDriver;

public class compare {
	static boolean result;
	public static boolean validateURL(WebDriver driver, String expURL) {
		if(driver.getCurrentUrl().equalsIgnoreCase(expURL)) {
			boolean result;
			result=true;
		
		}
	
		return result;
	}

}