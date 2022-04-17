package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage 
{
  private WebDriver driver;
  
  //Find WebElements
  
  //Remove Products
  @FindBy(xpath="//button[contains(text(),'Remove')]")
  private WebElement removeButton;
  
  //Continue Shopping Button
  @FindBy(xpath="//button[@id='continue-shopping']")
  private WebElement continueShopping;
  
  //Checkout Button
  @FindBy(xpath="//button[contains(text(),'Checkout')]")
  private WebElement checkout;
  
  

  
  //constructor
  public CartPage(WebDriver driver)
  {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }
  
  //Methods
  
//  public void RemoveMethod()
//  {
//	  removeButton.click();
//  }
  
//  public void ContinueShoppingMethod()
//  {
//	  continueShopping.click();
//  }
  public void CheckOutMethod() 
  {
     checkout.click();
  }
 
  
  
}
