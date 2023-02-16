package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {

	 WebDriver driver;
		public IndexPage(WebDriver driver){
			this.driver=driver;
			
		PageFactory.initElements(driver, this);
		
		}
		
		@FindBy(xpath="//a[text()='Create an Account']")
		WebElement registereVarElement;
		
		@FindBy(xpath="(//a[contains(text(),'Sign In')])[1]")
		WebElement siginBtnElement;
		
		public void ClickcreateAnAccBtn() {
			registereVarElement.click();
		}
		
	

		public void signinbtnClick() {
			
			siginBtnElement.click();
		}
}
