package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.host.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DealWitMapStepDefinition {

		
public WebDriver driver;
@Given("^I am on Login page$")
public void i_am_on_Login_page() throws Throwable {

	
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.navigate().to("https://www.freecrm.com");
	
}

@Given("^I enter login button$")
public void i_enter_login_button() throws Throwable {
   driver.findElement(By.xpath("//span[@class='icon icon-xs mdi-chart-bar']")).click();
}

@Given("^I click the Classic CRM button$")
public void i_click_the_Classic_CRM_button() throws Throwable {
   driver.findElement(By.xpath("//a[contains(text(),'Classic CRM')]")).click();
}

@Then("^I enter enters username and password$")
public void i_enter_enters_username_and_password(DataTable credentials) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	//for(Map<String, String> data : credentials.asMaps(String.class, String.class){
 //  driver.findElement(By.name("username")).sendKeys(username);
 //  driver.findElement(By.name("password")).sendKeys(password);
}
@Then("^I  clicks login button$")
public void i_clicks_login_button() throws Throwable {
  driver.findElement(By.xpath("//input[@class='btn btn-small']")).click(); 
}

@Then("^I am on home page$")
public void i_am_on_home_page() throws Throwable {
   
}

@Then("^I move on to new deal page$")
public void i_move_on_to_new_deal_page() throws Throwable {
   driver.switchTo().frame("mainpanel");
       Actions action = new Actions(driver);
       action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
}

@Then("^I enter deal details$")
public void i_enter_deal_details(DataTable credentials) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // Map data = credentials.asMap(String.class, String.class);
	
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	
	//for(Map<String,String>data : credentials.asMaps(String.class, String.class));
	 
	 
	 
}
	
@Then("^I click on the save button$")
public void i_click_on_the_save_button() throws Throwable {
   driver.findElement(By.xpath("//input[@value='Save']")).click();



driver.switchTo().frame("mainpanel");
Actions action = new Actions(driver);
action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
}
@Then("^I verify that I am on new contact page$")
public void i_verify_that_I_am_on_new_contact_page() throws Throwable {
  
}

@Then("^I close the browser$")
public void i_close_the_browser() throws Throwable {
   
}
	
}
