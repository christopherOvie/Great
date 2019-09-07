 package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {

	
	public WebDriver driver;
	@Given("^User is already on login page$")
	public void user_is_already_on_login_page() throws Throwable {
	  
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.freecrm.com");
		driver.manage().window().maximize();
	List<WebElement>frame=	driver.findElements(By.tagName("frame"));
	int count = frame.size();
	System.out.println("total number of frame is "+frame);
	
	
	}

	
	@And("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
    // driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
     driver.findElement(By.xpath("//a[contains(@href, 'https://ui.freecrm.com')]")).click();
	}

	@Given("^user clicks on classic crm button$")
	public void user_clicks_on_classic_crm_button() throws Throwable {
	   driver.findElement(By.xpath("//a[contains(text(),'Classic CRM')]")).click();
	}
	    
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() throws Throwable {
	String title =  driver.getTitle(); 
	System.out.println(title);
	//Assert.assertEquals("CRMPRO Log In Screen", title);
	//Or
	System.out.println("page title is : " +title);
   Assert.assertTrue(title.contains("CRMPRO"));
	
	}
	@Then("^user enter username and password$")
	public void user_enter_username_and_password() throws Throwable {
	 driver.findElement(By.name("username")).sendKeys("christophodibo");
	 driver.findElement(By.name("password")).sendKeys("Tkogl1979");
	}
	
	
	
	@Then("^user hit the login button$")
	public void user_hit_the_login_button() throws Throwable {
	   driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
	}
	/*@And("^user land on the  home page$")
	public void user_land_on_the_home_page() throws Throwable {
	  String title = driver.getTitle();
	  System.out.println("page title :" + title );
	  Assert.assertEquals("CRMPRO", title);
	}*/
	
	
	
	
	@Then("^user land on the home page$")
	public void user_land_on_the_home_page() throws Throwable {
		 String title = driver.getTitle();
		  System.out.println("page title :" + title );
		  Assert.assertEquals("CRMPRO", title);
	}
}
