package Testngpackage;


import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Assertionpgm {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
	   driver=new ChromeDriver ();
		driver.get("https://www.facebook.com/");
	}
   @Test
   public void test()
   {
	   String actualtitle=driver.getTitle();
	   String exp="facebook";
       Assert.assertEquals(exp, actualtitle);
	 
	   System.out.println("comparispon");
   }

}
