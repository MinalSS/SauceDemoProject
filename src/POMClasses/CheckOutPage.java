package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage
{
	private WebDriver driver;
	
    //Find WebElements
	
	//First Name
	@FindBy(xpath="//input[@class='input_error form_input']")
    private WebElement FirstName;
	
	//Last Name
	@FindBy(xpath="//input[@placeholder='Last Name']")
	 private WebElement LastName;
		
	//Postal Code
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement PostalCode;
		
	//ContinueButton
	@FindBy(xpath="//input[@id='continue']")
	 private WebElement ContinueButton;
	
//	//Cancel
//	@FindBy(xpath="//button[contains(@id,'cancel')]")
//	 private WebElement cancel;
	
	//Finish
	  @FindBy(xpath="//button[@name='finish']")
	  private WebElement finish;
	  
	

	
	//Constructor
	public CheckOutPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//Methods
	public void NameMethod()
	{
		FirstName.sendKeys("Ravi");
	}
	public void lastnameMethod()
	{
		LastName.sendKeys("Dube");
	}
	public void codeMethod()
	{
		PostalCode.sendKeys("442211");
	}
	public void ContinueMethod()
	{
		ContinueButton.click();
		
	}
//	public void cancelMethod()
//	{
//		cancel.click();
//	}
	 public void FinishMethod()
	  {
	    finish.click();
	  }
	  
	  

	
}
