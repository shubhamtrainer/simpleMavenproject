package shopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyntraTest {
	
	@Test(groups = "regression")
	public void myntra()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Reporter.log("myntra opens",true);
	}


}
