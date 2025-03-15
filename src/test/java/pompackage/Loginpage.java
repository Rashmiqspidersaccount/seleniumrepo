package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	//variable declaration
	
	@FindBy(id="user-name")
	private WebElement usernametextfield ;
	
	@FindBy(id="password")
	private WebElement passwordtextfield;
	
	@FindBy(name="login-button")
	private WebElement loginbutton;
	
	//create constructor for element initialization
	
	public Loginpage(WebDriver driver) {
	   PageFactory.initElements(driver, this);
	}
	
	//provide getters to access the webelements-utilization
	public WebElement getUsernametextfield() {
		return usernametextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
}
