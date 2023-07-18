package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import page.Fbcreatepage;


public class Fbcreatetest extends Baseclass{
	
	@Test
	public void Fbcreatepage()
	{
		Fbcreatepage obj=new Fbcreatepage(driver);
		obj.setvalues();
		obj.login();
		
	}
}
