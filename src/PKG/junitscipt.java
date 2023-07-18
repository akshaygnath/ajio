package PKG;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitscipt {
	
	ChromeDriver  driver;
	
	@Before
	public void setup()
	{
		
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
		

	}
	@Test
	public void test1()
	{
		driver.findElement(By.name("q")).sendKeys("IPL",Keys.ENTER);
		
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
	}
}
