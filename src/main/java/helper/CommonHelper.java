package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.grid.config.ConcatenatingConfig;

import utility.CONSTATNT;
import utility.PropertyFileReader;

public class CommonHelper {
	
	public static WebDriver driver;
	
	public CommonHelper() {
		PropertyFileReader propertyFileReader = new PropertyFileReader();
		CONSTATNT.BROWSER_TYPE = propertyFileReader.getData("browser");
		CONSTATNT.URL = propertyFileReader.getData("URL");
		CONSTATNT.PLATFORM = propertyFileReader.getData("PLATFORM");
		//CONSTATNT.IMPLICIT_WAIT = propertyFileReader.getData("implicitWait");
		//CONSTATNT.EXPLICIT_WAIT = propertyFileReader.getData("explicitWait");
		//CONSTATNT.DEFAUTLT_WAIT = propertyFileReader.getData("defaultWait");
		
	}

}
