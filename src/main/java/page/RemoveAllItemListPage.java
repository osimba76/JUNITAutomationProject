package page;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;





public class RemoveAllItemListPage {
    
	WebDriver driver;
	
	public RemoveAllItemListPage (WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH,using= "/html/body/div[3]/input[3]") 
	WebElement TOGGLE_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@value='Remove']")
	WebElement REMOVE_BUTTON;
	
	public void ToggleFieldButton() {
		TOGGLE_FIELD.click();
		Assert.assertTrue("all check boxes list are CHECKED ON", true);
	}
	public void RemoveButtonField() {
		REMOVE_BUTTON.click();
		Assert.assertTrue("All items selected are removed", true);
	}

}





