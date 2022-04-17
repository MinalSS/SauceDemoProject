package TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMClasses.LoginPage;

public class TC01LoginFunctionality 
{
  public static void main(String[] args)
  {
	  System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe" );
  	
  	  WebDriver driver = new ChromeDriver();
  	  
  	  driver.manage().window().maximize();
  	
  	  driver.get("https://www.saucedemo.com/");
  	  
  	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  	  
  	  //login to page
  	  
  	  LoginPage lp = new LoginPage(driver);
  	  lp.sendUserName();
  	  lp.sendPassword();
  	  lp.clickLoginButton();
  	  
      String expectedHomePageUrl = "https://www.saucedemo.com/inventory.html";
		
		String actualHomePageUrl = driver.getCurrentUrl();
	    
		System.out.println(" Checking the login test case");
		
		if(expectedHomePageUrl.equals(actualHomePageUrl))
		{
			System.out.println("Login test passed-we have successfully login on sauce demo website");
		}
		else
		{
			System.out.println("Login test failed");
		}
		 
  }
}
