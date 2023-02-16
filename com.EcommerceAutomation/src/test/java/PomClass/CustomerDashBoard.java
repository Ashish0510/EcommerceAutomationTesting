package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerDashBoard {
WebDriver driver;
	
	public CustomerDashBoard(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	

	@FindBy(xpath="//div[contains(text(),'Thank you for registering with')]")
    WebElement dashBoElement;
	
	
	@FindBy(xpath="(//button[@class='action switch'])[1]")
	WebElement signoutSwitchBtnElement;
	
	
	
	@FindBy(xpath="(//a[contains(text(),'Sign Out')])[1]")
	WebElement signoutElement;
	

	public Boolean DashBoardInfo() {
		if(dashBoElement.isDisplayed()) {
		return true;
		}
		else {
			return false;
		}
		
	}
	
	

	public void signout() {
		signoutSwitchBtnElement.click();
		signoutElement.click();
		
	}
	
}
