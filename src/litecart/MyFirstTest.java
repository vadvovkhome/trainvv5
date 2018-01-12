package litecart;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
	  
		System.setProperty("webdriver.firefox.marionette","C:\\workspace\\tools\\geckodriver.exe");
		driver = new FirefoxDriver();
	  
		 driver.manage().window().maximize();
		 driver.get("http://www.google.com");
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 System.out.print("http://www.google.com is loaded");
	}
 
	@After
 	public void aftertest() {
		//driver.quit();
  
	}
	
	@Test
	public void test() {
		
		System.out.println("Try to find Element by q");
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("webdriver");
		System.out.println("Found element by q");
		driver.findElement(By.name("btnK")).click();
		System.out.println("Click element btnK");
		wait.until(ExpectedConditions.titleContains("webdriver - Пошук Google")); //does not work
		System.out.println("ExpectedConditions is 'webdriver - Пошук в Google'");
	 }

 }