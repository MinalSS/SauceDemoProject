package TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMClasses.CartPage;
import POMClasses.CheckOutPage;
import POMClasses.FinalPage;
import POMClasses.HomePage;
import POMClasses.LoginPage;
import UtilityClasses.UtilityClass;

public class TC06LogOutFunctionality 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe" );
	  	
		  WebDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		
		  driver.get("https://www.saucedemo.com/");
		  
		  //ScreenShot
		  UtilityClass.takeScreenshot(driver);
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		  //login to page
	  	  
	  	  LoginPage lp = new LoginPage(driver);
	  	  lp.sendUserName();
	  	  Thread.sleep(3000);
		   
	  	  lp.sendPassword();
	  	  Thread.sleep(3000);
		   
	  	  lp.clickLoginButton();
	  	  Thread.sleep(3000);
		   
	  	//ScreenShot
		  UtilityClass.takeScreenshot(driver);
		  
	  	  //Add to cart
	  	   HomePage hp = new HomePage(driver);
		   hp.products();
		   Thread.sleep(3000);
		   
		   hp.getProductText();
		   Thread.sleep(3000);
		   
		   hp.cartbadgemethod();
		   Thread.sleep(3000);
		   
		 //ScreenShot
		 UtilityClass.takeScreenshot(driver);
		   
		   System.out.println("Products are added into the cart");
		   
		   //CartPage
		   CartPage c = new CartPage(driver);
		 //  c.RemoveMethod();
		  // c.ContinueShoppingMethod();
		    c.CheckOutMethod();
		    Thread.sleep(3000);
		    
		  //ScreenShot
		 UtilityClass.takeScreenshot(driver);
		 
			 System.out.println("Checkout is done successfully");
		   
		   //CheckOutPage
		   CheckOutPage co = new CheckOutPage(driver);
		   co.NameMethod();
		   Thread.sleep(3000);
		   
		   System.out.println("Firstname is entered");
		   
		   co.lastnameMethod();
		   Thread.sleep(3000);
		   
		   System.out.println("Lastname is entered");
		   
		   co.codeMethod();
		   Thread.sleep(3000);
		   
		     //ScreenShot
			  UtilityClass.takeScreenshot(driver);
		   
		   System.out.println("Postal code is entered");
		   
		   co.ContinueMethod();
		   Thread.sleep(3000);
		   
		 //ScreenShot
		  UtilityClass.takeScreenshot(driver);
		   
		   co.FinishMethod();
		   Thread.sleep(3000);
		   
		     //ScreenShot
			  UtilityClass.takeScreenshot(driver);
		   
		   
		   //co.ContinueMethod();
		   System.out.println("Information submitted successfully");
		 //  co.cancelMethod();
		   
		   FinalPage f = new FinalPage(driver);
		   f.BackHomeMethod();
		   Thread.sleep(3000);
		   
		 //ScreenShot
		 UtilityClass.takeScreenshot(driver);
		   
		   //logout
		  hp.Menu();
		  Thread.sleep(3000);
		   
		  hp.logout();
		  Thread.sleep(3000);
		  
		//ScreenShot
		 UtilityClass.takeScreenshot(driver);
		   
		   
		   //Scenario
		   String expUrl = "https://www.saucedemo.com/";
		   String actUrl = driver.getCurrentUrl();
		   if(expUrl.equals(actUrl))
		   {
			   System.out.println("Order placed successfully");
		   }
		   else
		   {
			   System.out.println("Order failed");
		   }
		   
	}

}
