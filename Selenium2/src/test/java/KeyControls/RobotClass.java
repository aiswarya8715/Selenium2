package KeyControls;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class RobotClass {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException, AWTException {
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_T);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  r.keyRelease(KeyEvent.VK_T);
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_T);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  r.keyRelease(KeyEvent.VK_T);
	 
	  Thread.sleep(2000);
	  String parenttab=driver.getWindowHandle();
	  System.out.println("parent tab is "+parenttab);
	  Set<String> alltabs=driver.getWindowHandles();
	  System.out.println("All selected tabs are "+alltabs);
	  int q=alltabs.size();
	  System.out.println("size "+q);
	  String t1=(String)alltabs.toArray()[0];
	  String t2=(String)alltabs.toArray()[1];
	  String t3=(String)alltabs.toArray()[2];
	  
	  driver.switchTo().window(t2);
	  driver.get("https://demo.guru99.com/test/newtours/register.php");
	  driver.switchTo().window(t3);
	  driver.get("https://www.mercurytravels.co.in/flights");
	  
	 
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Desktop\\chrome\\chromedriver.exe");
		 driver=new ChromeDriver();
			driver.get(" https://selenium.obsqurazone.com/javascript-alert.php");
			driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  driver.quit();
  }

}
