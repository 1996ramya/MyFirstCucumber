package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	WebDriver driver;
	@Given("^Navigates to Orangehrm$")
	public void navigates_to_Orangehrm() throws Throwable {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://orangehrm.qedgetech.com/");
	  Thread.sleep(2000);
	  
	}

	@When("^user logs in using Username as \"([^\"]*)\"$")
	public void user_logs_in_using_Username_as(String username) throws Throwable {
		driver.findElement(By.name("txtUsername")).sendKeys(username);
	 
	}

	@When("^password as \"([^\"]*)\"$")
	public void password_as(String password) throws Throwable {
		driver.findElement(By.name("txtPassword")).sendKeys(password);
	}

	@When("^user clicks login button$")
	public void user_clicks_login_button() throws Throwable {
		driver.findElement(By.name("Submit")).click();
	}

	@Then("^user should validate url$")
	public void user_should_validate_url() throws Throwable {
	   String expected="dashboard";
	   String actual= driver.getCurrentUrl();
	   if(actual.contains(expected))
	   {
		   System.out.println("Login is succcess");
	   }
	   else
	   {
		   System.out.println("Login is fail");
	   }
	}

	@Then("^user closes the browser$")
	public void user_closes_the_browser() throws Throwable {
	    driver.close();
	}


}
