package companies;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SimpleTest {
	
	@Test
	public void demo()
	{
		Reporter.log("hello maven",true);
	}

}
