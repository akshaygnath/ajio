package test1;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import test1.Baseclass;
import pagee.signup;
import pagee.search;
import pagee.addbag;
public class testajio extends Baseclass{
	@Test
	public void testpages()throws InterruptedException
	{
signup s=new signup(driver);
		s.links();
		s.read("9944111111");
		Thread.sleep(1000);
		s.login();
		Thread.sleep(1000);
		s.password("abc22");
		Thread.sleep(1000);
		
		search sp=new search(driver);
		sp.searchitem("Bedsheet");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");
		sp.pickitem();
		Thread.sleep(1000);
		sp.button();
		sp.back();

		addbag ab=new addbag(driver);
		ab.links();
		ab.delete();		
	}
		@AfterMethod
		public void CloseBrowser()
		{
		driver.quit();
		}
}