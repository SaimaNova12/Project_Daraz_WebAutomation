package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {
	  public static String url = "https://member.daraz.com.bd/user/login?spm=a2a0e.home.header.d5.735212f7gttG9g&redirect=https%3A%2F%2Fwww.daraz.com.bd%2F";
	//public static String url = "https://www.daraz.com.bd/";

		WebDriver driver = null;
	    @BeforeSuite
		
		public void start() {
			String browser = System.getProperty("browser","chrome");
			if(browser.contains("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			else if(browser.contains("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			else {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
			PageDriver.getInstance().setDriver(driver);
		}
		
		@AfterSuite
		public void close(){
			PageDriver.getCurrentDriver().quit();
	
       }
}
