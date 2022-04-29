package Mousehover;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ValidationForm {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  String title=driver.getTitle();
	  System.out.println("Title is "+title);
	  Assert.assertEquals(title, "Obsqura Testing");
	  System.out.println("page obtained");
	  boolean b=driver.findElement(By.xpath("//a[@href=\"date-picker.php\"]")).isDisplayed();
	  Assert.assertTrue(true);
	  System.out.println("correct page");
	  Actions act=new Actions(driver);
	  WebElement date=driver.findElement(By.xpath("//a[@id=\"progress-bars\"]"));
	  
	  WebElement date1=driver.findElement(By.xpath("//a[@id=\"others\"]"));
	  act.moveToElement(date).perform();
	  Thread.sleep(2000);
	  act.moveToElement(date1).perform();
	  Thread.sleep(3000);
	  WebElement fname=driver.findElement(By.xpath("//input[@id=\"validationCustom01\"]"));
	  fname.sendKeys("Aiswarya");
	  WebElement lname=driver.findElement(By.xpath("//input[@id=\"validationCustom02\"]"));
	  lname.sendKeys("A S");
	  WebElement uname=driver.findElement(By.xpath("//input[@id=\"validationCustomUsername\"]"));
	  uname.sendKeys("as@gmail.com");
	  WebElement city=driver.findElement(By.xpath("//input[@id=\"validationCustom03\"]"));
	  WebElement state=driver.findElement(By.xpath("//input[@id=\"validationCustom04\"]"));
	  state.sendKeys("Kerala");
	  WebElement zip=driver.findElement(By.xpath("//input[@id=\"validationCustom05\"]"));
	  zip.sendKeys("sdf");
	  driver.findElement(By.xpath("//input[@id=\"invalidCheck\"]")).click();
	  Thread.sleep(2000);
	  WebElement sub=driver.findElement(By.xpath("//button[text()=\"Submit form\"]"));
	  sub.click();
	  Thread.sleep(2000);
	  
	  
	  
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Desktop\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		  driver.get("https://selenium.obsqurazone.com/form-submit.php");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));    
		  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
