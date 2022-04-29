package AlertPgms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AlertPgm2 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.manage().window().maximize();
	  WebElement sub=driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
	  Thread.sleep(3000);
	  sub.click();
	  Alert al=driver.switchTo().alert();
	  String st=al.getText();
	  System.out.println("alert is"+st);
	  al.sendKeys("Aish");
	  Thread.sleep(5000);
	  al.accept();
	  Thread.sleep(3000);                                       
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
  }
  
}
