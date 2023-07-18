package Testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {

	WebDriver driver;
	
	@BeforeTest
	public void setup()
    {
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
    }
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("E:\\Book1.xlsx");
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	}
}
