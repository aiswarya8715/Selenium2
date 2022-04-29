package testannotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Testannotations1 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://www.wikipedia.org/");
	  driver.manage().window().maximize();
	  driver.navigate().to("https://en.wikipedia.org/wiki/Main_Page");
	 Thread.sleep(4000);
	 driver.navigate().back();
	  Thread.sleep(4000);
	  driver.navigate().forward();
	  Thread.sleep(3000);
	 driver.navigate().refresh();
	 driver.close();
 }
	 
  
  @BeforeMethod
  public void beforeMethod() {
	 
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	 
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Desktop\\chrome\\chromedriver.exe");
	  driver=new ChromeDriver();
	 
	  driver.manage().window().maximize();
	 
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
