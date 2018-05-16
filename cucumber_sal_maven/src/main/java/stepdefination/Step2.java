package stepdefination;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step2
{
   
    WebDriver we;
    @Given("^User Must be Logged in the Account$")
    public void User_Acct()
    {
        System.setProperty("webdriver.gecko.driver","/home/administrator/Desktop/Selenium/Packages/geckodriver");
        we=new FirefoxDriver();
        we.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);   
        we.get("http://127.0.0.1:8080/apex/");
        we.findElement(By.name("p_t01")).sendKeys("sys");
        we.findElement(By.name("p_t02")).sendKeys("squ@d123");
        we.findElement(By.id("LOGIN")).click();
    }
   
    @When("^User clicks on Administration$")
    public void admin() throws Exception
    {
        Thread.sleep(3000);
        we.findElement(By.linkText("Administration")).click();
    }
   
    @And("^User Navigates to Database Users$")
    public void data_user() throws Exception
    {
        Thread.sleep(3000);
        we.findElement(By.linkText("Database Users")).click();
    }
   
    @And("^User select all Users$")
    public void user_select() throws Exception
    {
        Thread.sleep(4000);
        Select s=new Select(we.findElement(By.id("P2610_SHOW")));
        s.selectByVisibleText("All Users");
    }
   
    @And("^User CLick on Go button$")
    public void button()
    {
        we.findElement(By.xpath("html/body/form/div[7]/table/tbody/tr/td[1]/table[1]/tbody/tr/td[1]/table/tbody/tr/td[10]/input")).click();
        we.findElement(By.linkText("Logout")).click();
        we.close();
    }
   
    @Then("^Message Displayed All Users List ie been Displayed$")
    public void msg()
    {
        System.out.println("Sucessfull List Displayed");
    }
   

}