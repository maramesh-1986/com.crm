package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import generic.Auto_Const;

public class Base_Test implements Auto_Const
{
	public WebDriver driver;
	
	@BeforeMethod
	public void open_application()
	{
		System.setProperty(Gecko_key, Gecko_value);
		driver = new FirefoxDriver();
		driver.get(url);

	}
	
	@AfterMethod
	public void close_appliation()
	{
		driver.quit();
		
	}
}
