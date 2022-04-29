package Uploadscroll;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Upload {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  JavascriptExecutor j=(JavascriptExecutor)driver;
	  j.executeScript("window.scrollBy(0,1000)", "down");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  j.executeScript("window.scrollBy(0,1000)", "up");
	  Thread.sleep(2000);
	  driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\aiswa\\Desktop\\Screenshot\\Pgmscreenshot\\");
	  Thread.sleep(2000);
	  driver.findElement(By.id("downloadButton")).click();
	  
	  		
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Desktop\\chrome\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.get("https://demoqa.com/upload-download");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
