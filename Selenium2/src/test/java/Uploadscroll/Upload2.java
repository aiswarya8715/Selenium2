package Uploadscroll;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Upload2 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  JavascriptExecutor j=(JavascriptExecutor)driver;
	  j.executeScript("window.scrollBy(0,1000)", "down");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  j.executeScript("window.scrollBy(0,1000)", "up");
	  Thread.sleep(2000);
	  WebElement txt=driver.findElement(By.id("textbox"));
	  txt.sendKeys("Hello World... I am Indian");
	  WebElement btn=driver.findElement(By.id("create"));
	  btn.click();
	  WebElement btn1=driver.findElement(By.id("download-file"));
	  btn1.click();
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Desktop\\chrome\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/file-download.php");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
