package KeyControls;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class MultipleSelect2 {
	WebDriver driver;
  @Test
  public void f() throws AWTException, InterruptedException {
	  WebElement wb=driver.findElement(By.id("multi-select-field"));
	  Select s=new Select(wb);
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_CONTROL);
	  s.selectByVisibleText("Red");
		 Thread.sleep(2000);
		 s.selectByVisibleText("Yellow");
		 Thread.sleep(2000);
		 s.selectByVisibleText("Green");
		 Thread.sleep(2000);		 
		// r.keyRelease(KeyEvent.VK_CONTROL);
	 WebElement btn1=driver.findElement(By.id("button-first"));
	 btn1.click();
	 Thread.sleep(3000);
	 WebElement btn2=driver.findElement(By.id("button-all"));
	 btn2.click();
	 String sel=s.getFirstSelectedOption().getText();
      System.out.println("first selected option"+sel);
		 
	  Thread.sleep(3000);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Desktop\\chrome\\chromedriver.exe");
		 driver=new ChromeDriver();
			driver.get("https://selenium.obsqurazone.com/select-input.php");
			driver.manage().window().maximize();
	  


  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
