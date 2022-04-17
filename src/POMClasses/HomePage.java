package POMClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
 {
     private WebDriver driver;
     
     // Find WebElements
     
     // AddToCart
//     @FindBy(xpath="//button[contains(@name,'add-to-cart-sauce-labs-bolt-t-shirt')]")
//     private WebElement AddToCart;
     
     //Cartbadge
     @FindBy(xpath="//span[@class='shopping_cart_badge']")
     private WebElement cartbadge;
     
     //AddToCart Elements for multiple elements
     @FindBy(xpath="//body//div//div//button")
     private List<WebElement> products;
     
     
     //Dropdown
     @FindBy(xpath="//button[@id='react-burger-menu-btn']")
     private WebElement dropdown;
     
     //logout
     @FindBy(xpath="//a[@id='logout_sidebar_link']")
     private WebElement logout;
     
     //Constructor
     
     public HomePage(WebDriver driver)
     {
    	 this.driver = driver;
    	 PageFactory.initElements(driver,this);
     }
     
     //Action perform on WebElements
     
//     public void AddToCart()
//     {
//    	 AddToCart.click();
//     }
     public void cartbadgemethod()
     {
    	 cartbadge.click();
     }
     
     //For 6 elements
     public void products()
     {
    	 for(int i = 0; i< products.size();i++)
    	 {
    		 products.get(i).click();
    	 }
    	 System.out.println(products.size());
     }
     
     public String getProductText()
     {
    	String number = cartbadge.getText();
    	return number;
     }
     
     
     public void Menu()
     {
    	dropdown.click();
     
     }
     
     public void logout()
     {
    	 logout.click();
     }
 }

