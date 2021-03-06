package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebElementUtils {
	public static void close(WebDriver driver) {
	     driver.close();		
		}

		public static void quit(WebDriver driver) {
			driver.quit();
			
		}

	public static WebDriver setBrowserDriverAndLauch(String browser) {
		
		WebDriver driver;
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
			driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "resources/gecko.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Incorrect Browser Name.NPE will be Thrown");
			driver=null;
		}

		return driver;
	}

	

}
