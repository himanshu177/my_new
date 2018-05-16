package stepdefination;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step3 {
	

	    WebDriver we;
	    @Given("^User is on Home Page$")
	    public void user_home_pg()
	    {
	        System.setProperty("webdriver.gecko.driver","/home/administrator/Downloads/geckodriver");
	        we=new FirefoxDriver();
	        we.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);   
	    }
	   
	    @When("^User navigate to Login Page$")
	    public void navig()
	    {
	        we.get("http://127.0.0.1:8080/apex/");
	    }
	   
	    @When("^User enters Username and Password and login button$")
	    public void unpd()
	    {
	        we.findElement(By.name("p_t01")).sendKeys("sys");
	        we.findElement(By.name("p_t02")).sendKeys("sprintqa123");
	        we.findElement(By.id("LOGIN")).click();
	        we.findElement(By.linkText("Logout")).click();
	        we.close();
	    }

	    @Then("^Message Displayed Login Sucessfull$")
	    public void login_msg()
	    {
	        System.out.println("Sucessfull Login");

	    }

	   

	}




