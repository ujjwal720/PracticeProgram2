package Academy;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class log4jjars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger a = Logger.getLogger("log4jjars");

		PropertyConfigurator.configure("C:\\Users\\DELL\\eclipse-workspace\\Mavenproject\\log4j.Properties");
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();

		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		a.info("Chrome driver is opned");

	}

}
