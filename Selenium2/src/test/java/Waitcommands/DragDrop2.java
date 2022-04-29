package Waitcommands;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class DragDrop2 {
	WebDriver driver;
  @Test
  public void f() {
	  WebDriverWait w= new WebDriverWait(driver,18);
	  w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.className("card-body"))));
	  WebElement sourse=driver.findElement(By.xpath("//span[text()=\"Draggable n°1\"]"));
	  WebElement dest=driver.findElement(By.xpath("//div[@id=\"mydropzone\"]"));
	  Actions act=new Actions(driver);
	  act.dragAndDrop(sourse, dest);
	  act.build().perform();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Desktop\\chrome\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/drag-drop.php");
	  driver.manage().window().maximize();
  }
  

  @AfterTest
  public void afterTest() {
  }

}
