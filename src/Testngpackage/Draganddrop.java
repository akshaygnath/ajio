
package Testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {

	
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demoqa.com/droppable/");
	}
	@Test
	public void test1()	
	{
		Actions act=new Actions(driver);
		WebElement src=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement des=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		act.dragAndDrop(src,des);
		act.perform();
		String exp="Dropped!";
		String actualtext=des.getText();
		if(actualtext.equals(exp))
			{
			System.out.println("pass");
			}
		else
		{
			System.out.println("fail");
		}
			}
}
