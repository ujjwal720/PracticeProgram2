package trackit;
import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Primenumber {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		TakesScreenshot src=((TakesScreenshot)driver);
		File g=src.getScreenshotAs(OutputType.FILE);
	    File dest =new File("C:\\Users\\ujjwal.shrivastava\\eclipse-workspace\\Mavenproject\\scre.png");
	    FileUtils.copyFile(g, dest);
	}

}
