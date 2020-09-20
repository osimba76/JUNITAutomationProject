package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.RemoveAllItemListPage;
import util.BrowserFactory;

public class RemoveAllItemListTest {

	WebDriver driver;
	
	@Test
	public void RemoveAllItemListTest() {
		
		driver = BrowserFactory.LaunchBrowser();
		
		RemoveAllItemListPage RemoveAllItemList = PageFactory.initElements(driver, RemoveAllItemListPage.class);
		RemoveAllItemList.ToggleFieldButton();
		RemoveAllItemList.RemoveButtonField();
		
	}
	
	
}
