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

public class MultipleSelect {
	
	WebDriver driver;
  @Test
  public void f() throws AWTException, InterruptedException {
	  WebElement ob=driver.findElement(By.name("multipleselect[]"));
	  Select s=new Select(ob);
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_CONTROL);
	  s.selectByIndex(1);
	 Thread.sleep(2000);
	 s.selectByVisibleText("Agile Methodology");
	 Thread.sleep(2000);
	 s.selectByIndex(3);
	 Thread.sleep(2000);
	 
		
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Desktop\\chrome\\chromedriver.exe");
		 driver=new ChromeDriver();
			driver.get(" https://www.softwaretestingmaterial.com/sample-webpage-to-automate/ ");
			driver.manage().window().maximize();
}

  

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
