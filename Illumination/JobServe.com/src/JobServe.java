import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JobServe {

	public WebDriver driver;
	
	@Before
public void setUp(){
	

	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.navigate().to("https://www.jobserve.com/gb/en/mob/jobsearch");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
}
@Test
	public void LoginTest() throws InterruptedException{
	driver.findElement(By.id("JobSearch_Keywords")).sendKeys("automation engineer,software developer in test,test analyst,test architect");
	driver.findElement(By.id("JobSearch_Location")).sendKeys("london,manchester,leeds,liverpool,leicester");
	Select job_Type = new Select(driver.findElement(By.id("JobSearch_RoleType")));
	job_Type.selectByVisibleText("Contract");
	Select posted = new Select(driver.findElement(By.id("JobSearch_JobAge")));
	posted.selectByValue("7");
	
	Select sort_By = new Select(driver.findElement(By.id("JobSearch_SortBy")));
	        sort_By.selectByVisibleText("Latest");
	        driver.findElement(By.cssSelector("#jsfields > div.formbuttons")).click();
	        

	driver.findElement(By.cssSelector("#JF1221680D945E574 > a > span:nth-child(3)")).click();

	
	driver.findElement(By.cssSelector("#cnt > div.formbuttons > form > button")).click();
	
}
	
	@After
	public void tearDown(){
		
		driver.quit();
		
	}
	
}
	