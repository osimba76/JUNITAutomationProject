package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveSingleCheckBoxPage {
	WebDriver driver;

	public RemoveSingleCheckBoxPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element library
	@FindBy(how = How.XPATH, using = "//input[@name='todo[2]']")
	WebElement SINGLE_CHECKBOX_ITEM;
	@FindBy(how = How.XPATH, using = "//input[@value='Remove']")
	WebElement REMOVE_BUTTON;

	// Method to interact

	public void ClickButtonSingleListItem() {
		SINGLE_CHECKBOX_ITEM.click();
		Assert.assertTrue("Single item selected is selected", true);
	}
		
		public void ClickRemoveButton() {
			REMOVE_BUTTON.click();
            Assert.assertTrue("Single item selected is removed", true);
	}

}
