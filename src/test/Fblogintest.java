package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbloginpage;

public class Fblogintest {
	WebDriver driver;
	@BeforeTest
public void setup()
{
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");

}
	@Test
	public void fblogintest()
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setvalues("abc12@gmail.com","abcd");
		ob.login();
	}

}
