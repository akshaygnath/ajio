package PKG;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {

	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String src=driver.getPageSource();
		if(src.contains("Google"))
		
		{
			System.out.println("text is present");
		}
		else
		{
			System.out.println("text is not present");
		}
		driver.quit();
	}

}
