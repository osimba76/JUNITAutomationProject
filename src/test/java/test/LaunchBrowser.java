package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import util.BrowserFactory;

public class LaunchBrowser {
     
	WebDriver driver;
	
	@Test
	public void UserShouldBeAbleToLaunchBrowser() {
		
		driver = BrowserFactory.LaunchBrowser();
	}
	
	
	public void teardown() {
		driver.close();
		driver.quit();
	}
	
	}
