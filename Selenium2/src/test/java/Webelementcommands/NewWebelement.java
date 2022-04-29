package Webelementcommands;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewWebelement {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement message=driver.findElement(By.id("single-input-field"));
	 
	  message.sendKeys("hai"); 
	  Thread.sleep(3000);
	  WebElement messagebtn=driver.findElement(By.id("button-one"));
	  messagebtn.click();
	  WebElement value1=driver.findElement(By.id("value-a"));
	  value1.sendKeys("1");
	  Thread.sleep(3000);
	  WebElement value2=driver.findElement(By.id("value-b"));
	  value2.sendKeys("5");
	  Thread.sleep(3000);
	  WebElement totalbtn=driver.findElement(By.id("button-two"));
	  String ss=driver.findElement(By.id("button-two")).getText();
	  System.out.println("text is "+ss);
	  totalbtn.click();
	  Thread.sleep(3000);
	
		 
	  
	 
	 
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Desktop\\chrome\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
