package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPageComponents;
import utility.CONSTATNT;

public class LoginPageTest {

	private static WebDriver driver;
	
	LoginPageComponents loginPage = new LoginPageComponents(driver);
	

	@Given("agent is on loginpage")
	public void agent_is_on_loginpage() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://test.invoxcontact.io/login/");
	}

	
	@When("agent enters username")
	public void agent_enters_username() {
			
		WebElement usernameElement = driver.findElement(By.xpath("//input[@placeholder='Usuario']"));
		 usernameElement.sendKeys("5299-998");
	}
	
	@And("agent enters password")
	public void  agent_enters_password() {
		//loginPage.password("654321");
		WebElement passwordElement = driver.findElement(By.xpath("//input[@type='password']"));
		passwordElement.sendKeys("654321");
	}
   
	
	@And("click on Login button")
     public void click_on_Login_button()  {
    	 //loginPage.login();
    	 WebElement loginbuttonElement = driver.findElement(By.xpath("//button[@class='login-button']"));
    	 //Thread.sleep(3000);
         loginbuttonElement.click();
     }
	
		
	@Then("check agent is logged in")
	 public void check_agent_is_logged_in() throws InterruptedException {
		Thread.sleep(4000);
		try {
			String alertmsg = driver.findElement(By.xpath("//div[@class='ant-notification-notice-message']/span")).getText();
			System.out.println("Alert Message is:" + alertmsg);
		}
		catch(Exception e){
			System.out.println("alert message not displayed");
		}		
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.titleContains("Invox Profile"));
			
		} catch (Exception e) {
		 System.out.println("Agent is logged not In");
		
		 		}	
		 String actual_title = driver.getTitle();
		 String exp_title = "Invox Profile";
		 System.out.println("Actual title is : "+ actual_title);
		 if(actual_title.equals("Invox Profile"))
		 {
			 System.out.println("Agent is logged in");
		 }
		 else
			 System.out.println("Agent is not logged in");
	 }
		
	@When("agent enters invalid username")
	public void agent_enters_invalid_username() {
		WebElement usernameElement = driver.findElement(By.xpath("//input[@placeholder='Usuario']"));
		 usernameElement.sendKeys("5299-998123");
	}
	
	 @And("agent enters invalid password")
	 public void  agent_enters_invalid_password() {
		 WebElement passwordElement = driver.findElement(By.xpath("//input[@type='password']"));
			passwordElement.sendKeys("654321000");
	 }
	 
	 @When("agent enters no username") 
	 public void agent_enters_no_username() { 
		 WebElement usernameElement = driver.findElement(By.xpath("//input[@placeholder='Usuario']"));
		 usernameElement.sendKeys("");
	 }
	  
	 @And("agent enters no password")
	 public void agent_enters_no_password() {
		 WebElement passwordElement = driver.findElement(By.xpath("//input[@type='password']"));
			passwordElement.sendKeys("");
	 }
	
	
}
