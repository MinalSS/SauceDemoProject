package TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMClasses.CartPage;
import POMClasses.CheckOutPage;
import POMClasses.HomePage;
import POMClasses.LoginPage;

public class TC05CheckOutFunctionality 
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
	 //  c.RemoveMethod();
	 //  c.ContinueShoppingMethod();
	   
	  // c.CheckOutMethod();
	  // c.FinishMethod();
	   System.out.println("Checkout is done successfully");
	   
	   //CheckOutPage
	   CheckOutPage co = new CheckOutPage(driver);
	   co.NameMethod();
	   System.out.println("Firstname is entered");
	   
	   co.lastnameMethod();
	   System.out.println("Lastname is entered");
	   
	   co.codeMethod();
	   System.out.println("Postal code is entered");
	   
	   
	   co.FinishMethod();
	   
	  // co.ContinueMethod();
	   System.out.println("Information submitted successfully");
	 //  co.cancelMethod();
	   
	   //Scenario
	   String expectedurl = "https://www.saucedemo.com/checkout-step-two.html";
	   String actualurl = driver.getCurrentUrl();
	   if(expectedurl.equals(actualurl))
	   {
		   System.out.println("Infomaration submitted successfully");
	   }
	   else
	   {
		   System.out.println("Failed to submit");
	   }
}
}
