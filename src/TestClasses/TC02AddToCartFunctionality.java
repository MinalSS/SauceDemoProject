package TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMClasses.HomePage;
import POMClasses.LoginPage;

public class TC02AddToCartFunctionality 
{
   public static void main(String[] args) throws InterruptedException 
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
	  	 // hp.AddToCart();
	  	  Thread.sleep(3000);
	  	  
	  	  hp.cartbadgemethod(); 
	  	  Thread.sleep(3000);
	  	//  hp.Menu();
	  	//  hp.logout();
	  	  System.out.println("Product is added into cart");
	  	  
	  	  //Scenario for one product added into the cart
	  	  String expectedUrl = "https://www.saucedemo.com/cart.html";
	  	  String actualUrl = driver.getCurrentUrl();
	  	  
	  	  if(expectedUrl.equals(actualUrl))
	  	  {
	  		  System.out.println("Adding product to cart test is passed sucessfully");
	  	  }
	  	  else
	  	  {
	  		  System.out.println("Product is not added into cart");
	  	  }
	  	  
	  	 
	  	  
   }
}
