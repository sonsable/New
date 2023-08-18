package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	
	public static WebDriver driver;
	
	
	public static void initialization() throws InterruptedException, IOException{
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		ChromeOptions chrome=new ChromeOptions();
		
		chrome.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup(); //THIS LINE IS WILL MAKE SURE WE SONT NEED TO UPDATE
		//CHROMEDRIVER EVERY NOW AND THEN
		
		
		 driver=new ChromeDriver(chrome);
	
		
	//	driver.get("https://www.facebook.com/");
		 
	driver.get(propertyfile("url"));
		
	}
	
	
	public static String propertyfile(String value) throws IOException
		
		{
			
			Properties prop=new Properties();
		
			FileInputStream file=new FileInputStream("C:\\Users\\Sonali Sable\\Desktop\\new Eclipse\\New\\src\\main\\java\\Configure\\Config.properties");
			
			prop.load(file); //in property class object prop, we are loading file address from fileinputstream object
			
			return prop.getProperty(value);
			
			
		}
		
		
//----------------------i updated this file-----------------------------------//		
		
	
	
	
	
	
	
}
