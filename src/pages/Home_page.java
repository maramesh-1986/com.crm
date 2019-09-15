package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_page extends Base_Page 
{

	@FindBy(xpath = "//span[.='Log In']")
	private WebElement login_welcomepage;

	@FindBy(name = "email")
	private WebElement user_name;
	
	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//div[.='Login']")
	private WebElement login_loginpage;
	
		public Home_page(WebDriver driver) 
	{
		super(driver);
	}
		
	public void set_username(String usn)
	{
		user_name.sendKeys(usn);
	}
	
	public void set_password(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void welcomepage_button()
	{
		
			login_welcomepage.click();
	}
	
	public void loginpage_button()
	{
		login_loginpage.click();
	}
	
}
