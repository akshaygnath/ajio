package PKG;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logodisplay {

ChromeDriver  driver;
	
	@Before
	public void setup()
	{
		
	driver=new ChromeDriver();
	driver.get("https://Rediff.com");
		
	}
	@Test
	public void test1()
	{
		boolean logo=driver.findElement(By.xpath("//*[@class='hmsprite logo']")).isDisplayed();
		if (logo)
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo is  not present");
		}
	}
}
