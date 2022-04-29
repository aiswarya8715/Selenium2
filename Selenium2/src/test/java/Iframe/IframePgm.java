package Iframe;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class IframePgm {
	WebDriver driver;
  @Test
  public void f()  {
	 
	// int sz=driver.findElements(By.id("sampleHeading")).size();
//System.out.println("size is "+sz);
	  driver.switchTo().frame(3);
	  WebElement fr=driver.findElement(By.id("sampleHeading"));
	  String fram1=fr.getText();
	  System.out.println(fram1);
	  driver.switchTo().parentFrame();
	  driver.switchTo().frame(4);
	  WebElement fr1=driver.findElement(By.id("sampleHeading"));
	  String fram2=fr1.getText();
	  System.out.println(fram2);
	 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Desktop\\chrome\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.get("https://demoqa.com/frames");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
