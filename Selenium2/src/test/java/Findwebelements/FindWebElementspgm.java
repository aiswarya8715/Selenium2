package Findwebelements;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FindWebElementspgm {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  List<WebElement>ob=driver.findElements(By.name("tripType"));
	  Thread.sleep(3000);
	  ob.get(1).click();
	  Thread.sleep(3000);
	  ob.get(0).click();
	  Thread.sleep(3000);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Desktop\\chrome\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.get("https://www.mercurytravels.co.in/flights");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
