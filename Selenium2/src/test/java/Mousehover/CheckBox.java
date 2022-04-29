package Mousehover;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class CheckBox {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement check=driver.findElement(By.xpath("//input[@id=\"gridCheck\"]"));
	  check.click();
	  Boolean sel=check.isSelected();
	  Assert.assertTrue(true);
	  System.out.println(sel);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   
	  WebElement check1=driver.findElement(By.xpath("//input[@id=\"check-box-one\"]"));
	  check1.click();
	  Thread.sleep(2000);
	  WebElement check2= driver.findElement(By.xpath("//input[@id=\"check-box-two\"]"));
		 check2.click();
	 boolean b1=driver.findElement(By.xpath("//input[@id=\"check-box-three\"]")).isDisplayed();
	  Assert.assertTrue(true);
		 System.out.println("element 3 displayed");
driver.findElement(By.xpath("//input[@id=\"check-box-three\"]")).click();
	//	 check2.click();
		  
		  boolean b2=driver.findElement(By.xpath("//input[@id=\"check-box-four\"]")).isSelected();
		  Assert.assertFalse(false);
		  driver.findElement(By.xpath("//input[@id=\"check-box-four\"]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id=\"button-two\"]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id=\"button-two\"]")).click();
	  }
	  
	// boolean s= driver.findElement(By.xpath("//input[@id=\"check-box-one]")).isDisplayed();
	 //Assert.assertTrue(true, "visible");
	 //check1.click();
	 
	 
	 
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Desktop\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		  driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));    
		  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
