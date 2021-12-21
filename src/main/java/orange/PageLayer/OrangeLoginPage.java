package orange.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  OrangeLoginPage {
	public WebDriver driver;
	
	@FindBy(id= "txtUsername")
	 WebElement LocUser;
	
	@FindBy(id= "txtPassword")
	 WebElement LocPAss;
	
	@FindBy(xpath= "//input[@id='btnLogin']")
	 WebElement LocLoginButton;
	
	public OrangeLoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	public void InitialLocUser(String Uname) {
		LocUser.sendKeys(Uname);
	}
	public void InitialLocPass(String Pass) {
		LocPAss.sendKeys(Pass);
	}
	public void InitialLocLoginButton() {
		LocLoginButton.click();
		
	}
	
}
