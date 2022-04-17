package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalPage 
{
	private WebDriver driver;
	
	//Find WebElements
	
	//Back to home
	@FindBy(xpath="//button[contains(@id,'back-to-products')]")
	private WebElement backhome;
		
	//Constructor
	public FinalPage(WebDriver driver)
	{
			this.driver = driver;
			PageFactory.initElements(driver, this);
			
	}
		
	//Methods
	public void BackHomeMethod()
		{
		backhome.click();
		}
}
