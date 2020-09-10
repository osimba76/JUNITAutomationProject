package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.RemoveSingleCheckBoxPage;
import util.BrowserFactory;

public class RemoveSingleCheckBoxTest {

	WebDriver driver;
	
	@Test
	public void UserShouldBeAbleToRemoveSingleListItem () {
		
	driver=BrowserFactory.LaunchBrowser();
	
	RemoveSingleCheckBoxPage RemoveSingleCheckBox = PageFactory.initElements(driver,RemoveSingleCheckBoxPage.class);
	RemoveSingleCheckBox.ClickButtonSingleListItem();
	RemoveSingleCheckBox.ClickRemoveButton();
	
    
	
	}
}
