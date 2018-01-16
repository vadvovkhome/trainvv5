package litecart;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.server.handler.DeleteCookie;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyFirstTest {
	//WebDriver driver = null;
	private WebDriver driver;
	private WebDriverWait wait;
	
 
	@Before
 	public void beforetest(){
	
		//System.setProperty("webdriver.chrome.driver", "C:\\workspace\\tools\\chromedriver.exe");

		//WebDriver driver = new ChromeDriver();
	  
		//System.setProperty("webdriver.firefox.marionette","C:\\workspace\\tools\\geckodriver.exe");
	//	driver = new FirefoxDriver();
	  
		

	//driver = new ChromeDriver();
	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
    capabilities.setCapability("--disable-restore-session-state", true);
    driver = new ChromeDriver(capabilities);
	//driver = new InternetExplorerDriver();
		
		//System.setProperty("webdriver.firefox.marionette","C:\\tools\\geckodriver.exe");
	
	
		//driver = new SafariDriver();
		//driver = new EdgeDriver();
 
		//to run on old Firefox versions 
	DesiredCapabilities caps = new DesiredCapabilities();
	//caps.setCapability(DeleteCookie);
	
	//caps.setCapability(FirefoxDriver.MARIONETTE, false);
	//driver = new FirefoxDriver(caps); 
	System.out.println(((HasCapabilities)driver).getCapabilities());
	//caps.setCapability("dismiss");
	//caps.setCapability("unexpextedAlertBehaviour", "dismiss");
	//driver = new ChromeDriver(caps); //does not work
	//System.out.println("Desired Capabilities: " + ((HasCapabilities)driver).getCapabilities());
	wait = new WebDriverWait(driver,10);
		
	//DesiredCapabilities capability = DesiredCapabilities.firefox();
	//capability.setBrowserName("firefox");
	//capability.setPlatform(Platform.WIN8_1);
	

	}
 
	@After
 	public void aftertest() {
		//driver.quit();
  
	}
	
	@Test
	public void test() {
		 //driver.manage().window().maximize();
		 driver.get("http://www.google.com");
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 System.out.println("http://www.google.com is loaded");
		 
		System.out.println("Try to find Element by q");
		driver.findElement(By.name("q")).sendKeys("webdriver");
		
		System.out.println("Found element by q");
		driver.findElement(By.name("btnK")).click();
		System.out.println("Click element btnK");
		
		List<WebElement> allFormChildElements = driver.findElements(By.name("btnK"));
		System.out.println("Find Elements btnK: " + allFormChildElements);
		
		String title = driver.getTitle();
		System.out.print("The title is: " + title);
		
		//wait.until(ExpectedConditions.titleContains("webdriver")); //does not work
	//	wait.until(ExpectedConditions.titleContains(": Google"));
		//wait.until(ExpectedConditions.titleContains("webdriver - Пошук Google"));
		//titleContains(String title)
		//check if the home title is correct String 
	  
	    
		//System.out.println("ExpectedConditions is 'webdriver - Пошук в Google'");
		

		//wait.until(ExpectedConditions.titleContains("webdriver - Пошук Google")); //does not work
		//System.out.println("ExpectedConditions is 'webdriver - Пошук Google'");

	 }

 }