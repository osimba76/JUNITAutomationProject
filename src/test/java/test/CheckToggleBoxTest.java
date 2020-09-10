package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.ToggleAllCheckBoxPage;
import util.BrowserFactory;

public class CheckToggleBoxTest {

	WebDriver driver;
	@Test
	public void UserShouldBeAbleToClickToggleAll() throws InterruptedException {
		driver = BrowserFactory.LaunchBrowser();
		
		ToggleAllCheckBoxPage ToggleBox = PageFactory.initElements(driver, ToggleAllCheckBoxPage.class);
		ToggleBox.CheckToggleBox();
		
	
		
	}
	
}
