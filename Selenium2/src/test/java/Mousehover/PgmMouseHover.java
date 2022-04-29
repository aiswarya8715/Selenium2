package Mousehover;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class PgmMouseHover {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  Actions act=new Actions(driver);
	  WebElement elect=driver.findElement(By.xpath("//div[text()=\"Electronics\"]"));
	  Thread.sleep(3000);
	  act.moveToElement(elect).perform();
	//  Thread.sleep(2000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Desktop\\chrome\\chromedriver.exe");
	driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));    
	  driver.manage().window().maximize();
	  if(driver.findElement(By.xpath("//div[@class=\"_3oBhRa col col-2-5 _4H6HH5\"]")).isDisplayed())
	  {
		  driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click() ;
	  }
	  Thread.sleep(2000);
	  }
  
  

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
