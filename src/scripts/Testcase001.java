package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Base_Page;
import pages.Home_page;

public class Testcase001 extends Base_Test
{

	@Test
	public void validlogin()
	{
		Home_page hp = new Home_page(driver);	
		hp.set_username("manoharshare@gmail.com");
		hp.set_password("Karnataka");
		hp.loginpage_button();
		
	}
	
}
