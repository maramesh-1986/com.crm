package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Base_Page 
{
	public WebDriver driver;
	
	public Base_Page(WebDriver driver)
	{
	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verify_title(String title)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try
		{
		wait.until(ExpectedConditions.titleContains(title));
		Reporter.log("Title is matching");
		}
		catch(Exception e)
		{
			Reporter.log("title doesnt match");
			Assert.fail();
		}
	}
	
	public void verify_element(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try
		{
		wait.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("Element is Available");
		}
		catch(Exception e)
		{
			Reporter.log("Element is not available");
			Assert.fail();
		}
	}
	
	
}
