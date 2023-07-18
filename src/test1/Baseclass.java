package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Baseclass {
 WebDriver driver;
 @BeforeTest
public void setup()
{
  driver=new ChromeDriver();
  driver.get("http://www.ajio.com");

}
}