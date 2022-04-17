package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
   //webdriver Delaration
	
	private WebDriver driver;
	
	//Find webelements
	
	//Username
	
	@FindBy(xpath="(//input [@class = 'input_error form_input'])[1]")
	private WebElement userName;
	
	//password
	
	@FindBy(xpath="(//input [@class = 'input_error form_input'])[2]")
	private WebElement password;
	
	//loginButton
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginButton;
	
	//constructor
	
	public LoginPage(WebDriver driver)
	{
		       //global        local
		        this.driver = driver; 
		 
		       //selenium class --> initElements
		       PageFactory.initElements(driver, this);	

	}
	
	//Action perform on elements
		public void sendUserName()
		{
		  userName.sendKeys("standard_user");
		}
		
		public void sendPassword()
		{
		  password.sendKeys("secret_sauce");
		}
		
		public void clickLoginButton()
		{
		   loginButton.click();
		}
	
}
	
	

