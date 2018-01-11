package litecart;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mytest {
 WebDriver driver = null;
 
 @Before
 public void beforetest() {
  // set geckodriver path.
  System.setProperty("webdriver.gecko.driver", "C:\\workspace\\tools\\chromedriver.exe");
  //initialize firefox driver.
  driver = new FirefoxDriver();
  //driver = new ChromeDriver();
  
  
  driver.manage().window().maximize();
  driver.get("http://www.google.com");
  System.out.print("http://www.google.com is loaded");
  //driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
 }
 
 @After
 public void aftertest() {
  driver.quit();
  
 }
 
 @Test
 public void test() {
  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  driver.findElement(By.xpath("//input[@value='Bike']")).click();
  boolean str1 = driver.findElement(By.xpath("//input[@value='Bike']")).isSelected();
  if(str1 = true) {
   System.out.print("Checkbox is checked");
  }
  else
  {
   System.out.print("Checkbox is not checked");
  }
 }
 
 }