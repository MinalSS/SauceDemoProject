package TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMClasses.HomePage;
import POMClasses.LoginPage;

public class TC03AddToCartMultipleProductsFunctionalty 
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
  	  
  	  //Add to cart
  	   HomePage hp = new HomePage(driver);
	   hp.products();
	   hp.getProductText();
	   hp.cartbadgemethod();
	   System.out.println("Products are added into the cart");
	   
	   //Scenario for Multiple products added into the cart
	   String expectedText = "6";
	   String ActualText = hp.getProductText();
	  	  
	  	if(expectedText.equals(ActualText))
	  	{
	  		System.out.println("All products added into the cart hence test case is pass");
	  	}
	  	else
	  	{
	  		System.out.println("Products no add to the cart hence test case failed");
	  	}
	  	  
   }  
}
