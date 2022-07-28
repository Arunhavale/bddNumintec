package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
       
		 features = "src/test/java/features",
	        glue= {"stepdefinitions"},
	        plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json",
	    			"junit:target/cucumber-reports/Cucumber.xml",
	    			"html:target/cucumber-reports/reports"},
	        monochrome = true
		)

public class TestRunner {
	
	}
	
