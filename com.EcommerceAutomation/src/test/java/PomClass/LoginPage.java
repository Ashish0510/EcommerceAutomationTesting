package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	       @FindBy(id="email") 
	        WebElement loginEmailElement;
	       
	       @FindBy(name="login[password]") 
	       WebElement loginPassword;
	       
	       @FindBy(xpath="(//span[text()='Sign In'])[1]") 
	       WebElement loginClickElement;
	       
	       
	       
	       public void LoginEmail(String email) {
	    	   loginEmailElement.sendKeys(email);
	       }
	       
	       
	       public void LoginPassword(String pwd) {
	    	   loginPassword.sendKeys(pwd);
	       }
	       
	       public void LoginClick() {
	    	   loginClickElement.click();
	       }
}
