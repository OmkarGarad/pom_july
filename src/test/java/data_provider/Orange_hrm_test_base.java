package data_provider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Orange_hrm_test_base {
	
	static WebDriver driver;
	
	
	public  static WebDriver initilization_orange_hrm() {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C://Users//Shree//Desktop//jar//chromedriver_win32//chromedriver.exe");
		 driver = new ChromeDriver(opt);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		return driver;	
		
	
		/*
		 * Thread.sleep(3000);
		 * 
		 * driver.findElement(By.name("username")).sendKeys("Admin");
		 * Thread.sleep(3000);
		 * driver.findElement(By.name("password")).sendKeys("admin123");
		 * Thread.sleep(3000); driver.findElement(By.xpath("//button")).click();
		 */
	}

}
