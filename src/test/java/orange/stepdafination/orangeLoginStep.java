package orange.stepdafination;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import orange.PageLayer.OrangeLoginPage;


public class orangeLoginStep  {
	
	public OrangeLoginPage OLP;
	public WebDriver driver;
	
	@Given("The User is on Login page {string}")
	public void the_user_is_on_login_page(String URL) {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	  driver.get(URL);
	  
	}
	@Then("user enters username {string}")
	public void user_enters_username(String USERNAME) throws InterruptedException {
		//OrangeLoginPage.InitialLocUser(USERNAME);
		Thread.sleep(3000);
		OLP=new  OrangeLoginPage();
		OLP.InitialLocUser(USERNAME);
	//driver.findElement(By.id("txtUsername")).sendKeys(USERNAME);
		
	}

	@Then("user enters password {string}")
	public void user_enters_password(String PASSWORD) throws InterruptedException {
		//OrangeLoginPage.InitialLocPass(PASSWORD);
		Thread.sleep(3000);
		OLP.InitialLocPass(PASSWORD);
		//driver.findElement(By.id("txtPassword")).sendKeys(PASSWORD);
	}

	@Then("User clicks on LOgInButton")
	public void user_clicks_on_l_og_in_button() throws InterruptedException {
		//OrangeLoginPage.InitialLocLoginButton();
		Thread.sleep(3000);
		OLP.InitialLocLoginButton();
		//driver.findElement(By.id("btnLogin")).click();
	}
}
