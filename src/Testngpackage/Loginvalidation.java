package Testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loginvalidation {

	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloads()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test1()
	{
		driver.findElement(By.name("email")).sendKeys("7907571656");
		driver.findElement(By.name("pass")).sendKeys("akshay@2000");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		String exp="https://www.facebook.com/";
				String acutal=driver.getCurrentUrl();
		if(acutal.equals(exp))
		{
			System.out.println("login pass");
		}
		else
		{
			System.out.println("login fail");
		}
	}
}
