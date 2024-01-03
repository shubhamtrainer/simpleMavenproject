package shopping;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DwsparametersTest {
	
	
	@Test
	public void dws()
	{
		
		Reporter.log("welcome to demo webShop",true);
		
		String URL = System.getProperty("url");
		
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		
//		String userName = System.getProperty("un");
//		String passWord = System.getProperty("pwd");
//		driver.findElement(By.xpath("//a[text()='Log in']")).click();
//		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(userName);
//		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(passWord);
//		
//		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		driver.quit();
	}

}
