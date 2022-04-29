package Dropdownpgms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class DropdownPgm1 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement wb=driver.findElement(By.id("single-input-field"));
	  Select s=new Select(wb);
	  s.selectByIndex(1);
	  Thread.sleep(3000);
	  s.selectByValue("Green");
	  Thread.sleep(3000);
	  s.selectByVisibleText("Yellow");
	  Thread.sleep(3000);
	  List<WebElement> li=s.getOptions();
	  int size=li.size();
	  System.out.println("size= "+size);
	  for(int i=0;i<size;i++)
	  {
		  String value=li.get(i).getText();
		  System.out.println("values are "+value);
		  
	  }
	  WebElement button1=driver.findElement(By.id("button-first"));
	  button1.click();
	 Thread.sleep(3000);
	 WebElement button2=driver.findElement(By.id("button-all"));
	  button2.click();
	 Thread.sleep(3000);
	  
	  
	  
	  
	  
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
  }

}
