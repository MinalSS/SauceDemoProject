package TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMClasses.CartPage;
import POMClasses.HomePage;
import POMClasses.LoginPage;

public class TC04CartFunctionality 
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
	   
	   //CartPage
	   CartPage c = new CartPage(driver);
	  // c.RemoveMethod();
	   //c.ContinueShoppingMethod();
	   c.CheckOutMethod();
	   System.out.println("Checkout is done successfully");
	   
	   //Scenario
	    String expUrl = "https://www.saucedemo.com/checkout-step-one.html";
	    String actUrl = driver.getCurrentUrl();
	    
	    if(expUrl.equals(actUrl))
	    {
	    	System.out.println("Product checkout is done successfully");
	    }
	    else
	    {
	    	System.out.println("Checkout is failed");
	    }
	    
    }	   
   }
