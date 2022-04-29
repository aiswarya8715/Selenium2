package Xmlpgm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

//import com.beust.jcommander.Parameters;

//import com.beust.jcommander.Parameters;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XmlPgm1 {
	WebDriver driver;
	
  @Test
  @Parameters({"username","password"})
  public void mainMethod(@Optional("abc")String n,@Optional("xyz")String p) throws InterruptedException {
	  WebElement user=driver.findElement(By.name("UserName"));
	  user.sendKeys(n);
	  WebElement pwd=driver.findElement(By.name("Password"));
	  pwd.sendKeys(p);
	  WebElement log=driver.findElement(By.xpath("//input[@name=\"Login\"]"));
	  log.click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Desktop\\chrome\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.get("https://demosite.executeautomation.com/Login.html");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
