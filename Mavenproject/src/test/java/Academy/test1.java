package Academy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {
	
	
	
	
	@Test(retryAnalyzer=Academy.retry.class)
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String k=driver.getTitle();
		Assert.assertEquals(k, "gogle");
		
		
		
		
		
	}

}
