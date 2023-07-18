package Testngpackage;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.FileInputStream;

public class Datadriventest {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloads()
	{
		driver.get("https://www.facebook.com/");
	}
@Test
public void test() throws Exception
{
	FileInputStream f=new FileInputStream("E:\\Book1.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet sh=wb.getSheet("Sheet1");
	int row=sh.getLastRowNum();
	for(int i=1;i<=row;i++)
	{
		String username=sh.getRow(i).getCell(0).getStringCellValue();
		String	pswd=sh.getRow(i).getCell(1).getStringCellValue();
System.out.println("Username="+username+"\n"+"Password="+pswd);
driver.findElement(By.name("email")).sendKeys(username);
driver.findElement(By.name("pass")).sendKeys(pswd);
driver.findElement(By.name("login")).click();

	}	
}
}
