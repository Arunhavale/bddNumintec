package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageComponents {

	private WebDriver driver;
	private By usernameTextFieldLoc = By.xpath("//input[@placeholder='Usuario']") ;
	private By passwordTextFieldLoc = By.xpath("//input[@type='password']");
	private By loginButtonLoc = By.xpath("//button[@class='login-button']");
	
	

	public LoginPageComponents(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public  void username(String username) {
		// TODO Auto-generated method stub
		 WebElement usernameElement = driver.findElement(usernameTextFieldLoc);
		 usernameElement.sendKeys(username);
	}
	
	public void password(String password) {
		WebElement passwordElement = driver.findElement(passwordTextFieldLoc);
		passwordElement.sendKeys(password);
	}
	
	public void login() {
         WebElement loginbuttonElement = driver.findElement(loginButtonLoc);
         loginbuttonElement.click();
	}
		
			
			
}
