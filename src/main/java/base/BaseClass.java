package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import helper.CommonHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.CONSTATNT;

public class BaseClass extends CommonHelper{
	public static WebDriver driver;
	
	public BaseClass() {
		super();
	}

	public  void launch_Browser() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://test.invoxcontact.io/login/?redirect=https://test.invoxcontact.io/login/");
}
	
	public WebDriver launchBrowser() {
		if(CONSTATNT.BROWSER_TYPE.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(CONSTATNT.BROWSER_TYPE.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else if(CONSTATNT.BROWSER_TYPE.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		else if(CONSTATNT.BROWSER_TYPE.equals("safari")) {
			driver = new SafariDriver();
		}		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
