package PKG;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpgm {

ChromeDriver  driver;
	
	@Before
	public void setup()
	{
		
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
		
	}
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("phones");
		driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("invalid email id",Keys.ENTER);
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_electronics']")).click();
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		
		
	}
}
