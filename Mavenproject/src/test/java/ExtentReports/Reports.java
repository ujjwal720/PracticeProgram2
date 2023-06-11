package ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reports {
	Reports b;
	
	@Test
	public void demo() {
		b.createTest("Demoss");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	   System.out.println(driver.getTitle());
	   b.flush();  

		
	}
	
	@BeforeTest
	public void test0() {
       
		
	}
}
