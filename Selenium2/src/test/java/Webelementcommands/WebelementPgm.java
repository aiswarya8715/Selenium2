package Webelementcommands;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class WebelementPgm {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement user=driver.findElement(By.id("userName"));
	  user.sendKeys("Testuser123");
	 driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	
	  
	  WebElement password=driver.findElement(By.id("password"));
	  password.sendKeys("Admin@123");
	// Thread.sleep(3000);
	  
	  
	 driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
	  WebElement log=driver.findElement(By.id("login"));
	  log.click();
	//  WebElement logout=driver.findElement(By.id("submit"));
	//  logout.click();
	 Thread.sleep(3000);
	 driver.navigate().to("http://jqueryui.com/droppable/");
	 String ur= driver.getCurrentUrl();
	 System.out.println("current url is "+ur);
	 Assert.assertEquals(ur,"https://jqueryui.com/droppable/");
 System.out.println("Obtained page is correct");
	// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Desktop\\chrome\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.get("https://demoqa.com/login");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	 driver.close();
  }

}
