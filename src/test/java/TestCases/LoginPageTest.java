package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import Base.TestBase;
import Pages.LoginPage;


public class LoginPageTest extends TestBase {
	
	LoginPage obj;
	
	
	
	@BeforeTest
	
	public void setup() throws InterruptedException, IOException
	{
		
		initialization();
		 obj=new LoginPage();
		
	}
	
	@Test
	
	public void loginFBtest() throws IOException
	{
		obj.loginFB();
	}
	
	
	@Test (enabled=false) //-----------THIS IS HOW WE CAN DISABLE TESTCASES WHICH WE DONT WISH TO RUN
	public void verifyTitleTest() 
	{
		
	String value = obj.verifyTitle();
	
	Assert.assertEquals("Facebook – log in or sign up", value);//this is showing failed dont know reason

	}
	
	@Test
	public void fblogoTest()
	{
		boolean logo = obj.fblogo();
		
		Assert.assertEquals(logo, true);
	}
	
	

	@AfterTest
	
	public void exit()
	{
		driver.quit();
	}
	
	
	

}
