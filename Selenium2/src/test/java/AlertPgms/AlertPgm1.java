package AlertPgms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AlertPgm1 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement id=driver.findElement(By.name("cusid"));
	  id.sendKeys("abcd");
	  Thread.sleep(3000);
	  WebElement sub=driver.findElement(By.name("submit"));
	  sub.click();
	  Alert al=driver.switchTo().alert();
	  String st=al.getText();
	  System.out.println("alert is"+st);
	  Thread.sleep(3000);
	 al.accept();
	 
	//  al.dismiss();
	  Thread.sleep(3000);
	 String stt=al.getText();
	  System.out.println("alert2 is"+stt);
	  Thread.sleep(3000);
	  al.accept();
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Desktop\\chrome\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/delete_customer.php");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
