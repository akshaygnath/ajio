package PKG;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotpgm {
ChromeDriver  driver;

@Before
public void setup()
{
	
       driver=new ChromeDriver();
       driver.get("file:///E:/alertpgm.html");
}
@Test
public void screenshot() throws Exception 
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileHandler.copy(src, new File("E://screenshot1.png"));
    WebElement button= driver.findElement(By.xpath("//input[@type='button']"));
    File src1= button.getScreenshotAs (OutputType.FILE); 
    FileHandler.copy(src1, new File("./Screenshot/error.png"));
}

}
