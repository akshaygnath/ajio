package PKG;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Countyear {

ChromeDriver  driver;
	
	@Before
	public void setup()
	{
		
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void test1()
	{
		WebElement  date =driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		Select selectDate=new Select(date);
		selectDate.selectByVisibleText("29");
		 WebElement  month =driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
         Select selectMonth =new Select(month);
         selectMonth.selectByVisibleText("AUG");
         WebElement  Year =driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
           Select selectYear =new Select(Year);
           selectYear.selectByVisibleText("2000");
		
		List<WebElement>li=selectDate.getOptions();
		System.out.println("count of days "+li.size());
		List<WebElement>mi=selectMonth.getOptions();
		System.out.println("count of month"+mi.size());
		List<WebElement>xi=selectYear.getOptions();
		System.out.println("count of year"+xi.size());
		
		
	}
}
