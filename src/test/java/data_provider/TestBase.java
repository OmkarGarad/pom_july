package data_provider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;





public class TestBase {
	
	static WebDriver  driver;
	
	static configuration_file cf = new configuration_file();
	
	
	
	public static WebDriver jbk_lauch_url() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver",cf.getDriverPath());
		 driver = new ChromeDriver(options);
		 driver.get("file:///C:/Users/Shree/Desktop/TestScript/Offline%20Website/Offline%20Website/index.html");
		 driver.manage().window().maximize();
		return driver;
		
		
	}
	
	
	public static WebDriver  amazon_lauch_url(String browser) throws Exception {
	
		if(browser.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", cf.getDriverPath());
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver", "C:/Users/Shree/Desktop/jar/chromedriver.exe");
			driver = new ChromeDriver(options);
			
		}else if(browser.equalsIgnoreCase("Firefox")) {
			
			//System.setProperty("webdriver.c/hrome.driver", cf.getDriverPath());
			//FirefoxOptions options = new FirefoxOptions();
			//options.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.gecko.driver","C:/Users/Shree/Desktop/jar/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("Edge")) {
			
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.edge.driver", "C:/Users/Shree/Desktop/jar/msedgedriver.exe");
			driver = new EdgeDriver(options);
		}
			else {
				throw new Exception("Browser is not correct");
			}
		 driver.get("https://www.amazon.in/ref=nav_logo");
		 driver.manage().window().maximize();
		return driver;
	}

	
	
	

}
