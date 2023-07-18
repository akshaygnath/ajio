package PKG;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathpgm {
	
ChromeDriver  driver;
	
	@Before
	public void setup()
	{
		
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
		

	}
	@Test
    public void test1()
	{
		driver.findElement(By.name("email")).sendKeys("7907571656");
		driver.findElement(By.name("pass")).sendKeys("akshay@2000");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		//driver.findElement(By.name("login")).click();
		
		
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
	}
}



