package Assertexample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class HardAssertPgm {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  boolean b=driver.findElement(By.id("userName")).isEnabled();
	  System.out.println(b);
	  Assert.assertTrue(b);
	 // Assert.assertFalse(b); if it executes,the pgm will stop here
	  Assert.assertNotNull(driver);
	//  Assert.assertNull(driver);  pgm will stop
	  
	  String s=driver.getTitle();
	  System.out.println("title is"+s);
	  Assert.assertEquals(s, "ToolsQA");
	  WebElement user=driver.findElement(By.id("userName"));
	  user.sendKeys("Testuser123");
	  WebElement password=driver.findElement(By.id("password"));
	  password.sendKeys("Admin@123");
	  Thread.sleep(3000);
	  WebElement log=driver.findElement(By.id("login"));
	 String a= log.getText();
	 System.out.println("text is "+a);
	 Assert.assertEquals(a, "Login");
	 
	  log.click();
	 
	//  WebElement button2=driver.findElement(By.id("submit"));
	// WebElement logout=driver.findElement(By.xpath("//button[text()=\"Log out\"]"));
	// logout.click();
	//Thread.sleep(3000);
	  
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
  }

}
