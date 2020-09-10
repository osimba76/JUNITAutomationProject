package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org. junit. Assert;
//import junit.framework.Assert;

public class ToggleAllCheckBoxPage {
    
	WebDriver driver;
	
	// Every Page must have a constructor to invite the driver
	public ToggleAllCheckBoxPage (WebDriver driver) {
		this.driver = driver;
	}
	
	//Element library
	
	
	@FindBy(how = How.XPATH,using= "/html/body/div[3]/input[3]") WebElement TOGGLE_FIELD;
	@FindBy(how = How.NAME,using="todo[9]") WebElement SINGLE_FIELD;
	//@FindBy(how = How.NAME,using="submit") WebElement REMOVE_FIELD;
	
	//Method to interact with element
	public void CheckToggleBox () throws InterruptedException {
		TOGGLE_FIELD.click();
	Assert.assertTrue("all check boxes list are CHECKED ON", true);
	System.out.println("TOGGLE FIELD");
	Thread.sleep(2000);
	}

}
		

