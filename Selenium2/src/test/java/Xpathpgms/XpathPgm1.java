package Xpathpgms;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameters;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class XpathPgm1 {
	WebDriver driver;
  @Test
  public void mainMethod(String n,String p) throws InterruptedException {
	  WebElement user=driver.findElement(By.xpath("//input[@name=\"UserName\"]"));
	  //WebElement user=driver.findElement(By.xpath("//*[@id=\"userName\"]/p[1]/input"));  copy xpath
	  user.sendKeys("abc");
	  Thread.sleep(2000);
	  WebElement pwd=driver.findElement(By.xpath("//input[@name=\"Password\"]"));
	  pwd.sendKeys("ghj");
	  Thread.sleep(2000);
	  WebElement log=driver.findElement(By.xpath("//input[@name=\"Login\"]"));
	  log.click();
	 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Desktop\\chrome\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.get("https://demosite.executeautomation.com/Login.html");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
