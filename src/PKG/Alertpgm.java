package PKG;

    import org.junit.Before;
	import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
    import org.openqa.selenium.Keys;
    import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {


	ChromeDriver  driver;
		
		@Before
		public void setup()
		{
			
		driver=new ChromeDriver();
		driver.get("file:///E:/alertpgm.html");
			
		}
		@Test
		public void test1()
		{
			driver.findElement(By.xpath("//input[@type='button']")).click();
			Alert a=driver.switchTo().alert();
			String text=a.getText();
			System.out.println(text);
			a.accept();
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("akshay",Keys.ENTER);
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("g nath",Keys.ENTER);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
		}
}
