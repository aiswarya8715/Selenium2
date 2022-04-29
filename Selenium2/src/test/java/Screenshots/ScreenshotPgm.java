package Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class ScreenshotPgm {
	
	WebDriver driver;
  public void WikiOne() {
	  driver.get("https://www.wikipedia.org/");
	  driver.manage().window().maximize();
	  
	  
  }
  @Test
  
  public void wikiTwo()
  {
	  driver.get("https://www.mercurytravels.co.in/flights");
	  driver.manage().window().maximize();
  }
  
  @AfterMethod
  public void afterMethod(ITestResult r) throws IOException {
	  if(ITestResult.SUCCESS==r.getStatus())
	  {
		  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,new File("C:\\Users\\aiswa\\Desktop\\Screenshot\\Pgmscreenshot\\"+r.getName()+".png"));
		  		
	  }
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Desktop\\chrome\\chromedriver.exe");
	   driver=new ChromeDriver();
	// driver.get("https://demo.guru99.com/test/delete_customer.php");
	//  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
