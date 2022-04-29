package Findwebelements;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FindWebElementspgm2 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  List<WebElement>ob=driver.findElements(By.name("inlineRadioOptions"));
	  /*WebElement messagebtn=driver.findElement(By.id("inlineRadio1"));
	  messagebtn.click();
	  Thread.sleep(3000);
	  WebElement messagebtn1=driver.findElement(By.id("inlineRadio2"));
	  messagebtn1.click();
	  Thread.sleep(3000);
	  WebElement messagebtn3=driver.findElement(By.id("button-one"));
	  messagebtn3.click();*/
	  
	  Thread.sleep(3000);
	  ob.get(1).click();
	  Thread.sleep(3000);
	  ob.get(0).click();
	  Thread.sleep(3000);
	  WebElement showbtn=driver.findElement(By.id("button-one"));
	  showbtn.click();
	  List<WebElement>os=driver.findElements(By.name("student-gender"));
	  Thread.sleep(3000);
	  os.get(1).click();
	  Thread.sleep(3000);
	  os.get(0).click();
	  Thread.sleep(3000);
	  List<WebElement>ot=driver.findElements(By.name("student-age"));
	  Thread.sleep(3000);
	  ot.get(0).click();
	  Thread.sleep(3000);
	  ot.get(1).click();
	  Thread.sleep(3000);
	  ot.get(2).click();
	  Thread.sleep(3000);
	  WebElement resultbtn=driver.findElement(By.id("button-two"));
	   resultbtn.click();
	   Thread.sleep(3000);
	  



  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Desktop\\chrome\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
