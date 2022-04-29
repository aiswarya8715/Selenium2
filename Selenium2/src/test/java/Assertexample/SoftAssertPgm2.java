package Assertexample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class SoftAssertPgm2 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  boolean b=driver.findElement(By.id("userName")).isEnabled();
	  System.out.println(b);
	  SoftAssert s=new SoftAssert();
	  s.assertTrue(b, "Error Absent");
	  String n=driver.getTitle();
	  System.out.println("title is"+n);
	  Assert.assertEquals(n, "ToolsQA");
	  WebElement user=driver.findElement(By.id("userName"));
	  user.sendKeys("Testuser123");
	  WebElement password=driver.findElement(By.id("password"));
	  password.sendKeys("Admin@123");
	  Thread.sleep(3000);
	  WebElement log=driver.findElement(By.id("login"));
	 String a= log.getText();
	 System.out.println("text is "+a);
	  log.click();
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
