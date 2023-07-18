package Testngpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Uploadbuttonpgm {
	ChromeDriver Driver;
	@BeforeTest
	public void setup()
    {
		Driver=new ChromeDriver();
    }
	@Test
	public void fileupload()throws Exception
	{
     Driver.get("https://www.ilovepdf.com/excel_to_pdf");
     Driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
     
     fileupload("E:\\Book1.xlsx");
	}
	public void  fileupload(String p)throws AWTException
	{
		StringSelection strSelection= new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection,null);
		
		Robot robot = new Robot();
		robot.delay(3000);
        
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(2000);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
      }
	}

	
