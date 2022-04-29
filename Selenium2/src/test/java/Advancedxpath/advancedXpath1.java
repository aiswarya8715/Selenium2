package Advancedxpath;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class advancedXpath1 {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement user=driver.findElement(By.xpath("//input[@name=\"Login\"]//preceding::input[2]"));
	  user.sendKeys("aish");
	  WebElement pwd=driver.findElement(By.xpath("//input[@name=\"Login\"]//preceding::input[1]"));
	  pwd.sendKeys("123");
	  WebElement log=driver.findElement(By.xpath("//input[@name=\"Password\"]//following::input[1]"));
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
	  driver.close();
  }

}
