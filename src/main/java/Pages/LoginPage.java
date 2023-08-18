package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase{

	
	
	//-ENCAPSULATION IS USED BELOW, DATA MEMEBERS ARE PRIVATE AND METHOD are PUBLIC
	

	@FindBy(xpath = "//input[@type='text']") private WebElement  userid;
	
	@FindBy(xpath = "//input[@type='password']") private WebElement password;
	
	
	@FindBy(xpath = "//button[@name='login']") private WebElement loginButton;
	
	
	@FindBy(xpath = "//img[@class='fb_logo _8ilh img']") WebElement fblogo;
	public LoginPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void loginFB() throws IOException
	{
		userid.sendKeys(propertyfile("userid"));
		password.sendKeys(propertyfile("password"));
		loginButton.click();
	}
	
	
	public String verifyTitle()
	{
		return driver.getTitle();
		
	}

	
	public Boolean fblogo()
	{
		return fblogo.isDisplayed();
	}
	
	
	
	
	
	
	
	
}
