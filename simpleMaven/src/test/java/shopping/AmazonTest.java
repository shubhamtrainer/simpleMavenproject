package shopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AmazonTest {

	
	@Test(groups = "smoke")
	public void amazon()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("amazon opens",true);
	}
}
