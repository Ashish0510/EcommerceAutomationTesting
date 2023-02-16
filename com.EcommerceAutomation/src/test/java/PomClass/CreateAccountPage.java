package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
	WebDriver driver;
	public CreateAccountPage(WebDriver driver){
		this.driver=driver;
		
	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(name="firstname")
	WebElement UserFirstName;
	
	@FindBy(name="lastname")
	WebElement UserLastName;
	
	@FindBy(name="email")
	WebElement UserEmail;
	
	@FindBy(name="password")
	WebElement UserPassword;
	
	@FindBy(name="password_confirmation")
	WebElement UserConfirmPassword;
	
	@FindBy(xpath="//span[text()='Create an Account']")
	WebElement ClickSubmitBtn;
	
	
	
	
	public void UserFirstNm(String name){
		UserFirstName.clear();
		UserFirstName.sendKeys(name);
		
	}
	
	public void UserLastNm(String Lastname){
		UserLastName.clear();
		UserLastName.sendKeys(Lastname);
			
		}
	
	public void UserEmailNm(String Emailname){
		UserEmail.sendKeys(Emailname);
			
		}
	
	public void UserPasswordNm(String pwd){
		UserPassword.clear();
		UserPassword.sendKeys(pwd);
			
		}
	
	public void UserConfirmPwdNm(String Confirmpwd){
		UserConfirmPassword.clear();
		UserConfirmPassword.sendKeys(Confirmpwd);
			
		}
	
	public void UserRegisteredBtn(){
		ClickSubmitBtn.click();
			
		}


}
