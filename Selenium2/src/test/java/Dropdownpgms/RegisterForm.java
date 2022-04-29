package Dropdownpgms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class RegisterForm {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement fname=driver.findElement(By.name("firstName"));
	  fname.sendKeys("Aiswarya");
	  Thread.sleep(3000);
	  WebElement lname=driver.findElement(By.name("lastName"));
	  lname.sendKeys("A S");
	  Thread.sleep(3000);
	  WebElement phn=driver.findElement(By.name("phone"));
	  phn.sendKeys("98767677");
	  Thread.sleep(3000);
	  WebElement email=driver.findElement(By.name("userName"));
	  email.sendKeys("as@gmail.com");
	  Thread.sleep(3000);
	  WebElement address=driver.findElement(By.name("address1"));
	  address.sendKeys("Abcd");
	  Thread.sleep(3000);
	  WebElement cty=driver.findElement(By.name("city"));
	  cty.sendKeys("Adoor");
	  Thread.sleep(3000);
	  WebElement st=driver.findElement(By.name("state"));
	  st.sendKeys("Kerala");
	  WebElement post=driver.findElement(By.name("postalCode"));
	  post.sendKeys("456790");
	  Thread.sleep(3000);
	  WebElement wb=driver.findElement(By.name("country"));
	  Select s=new Select(wb);
	  s.selectByValue("INDIA");
	  Thread.sleep(3000);
	  WebElement user=driver.findElement(By.id("email"));
	  user.sendKeys("Aish");
	  Thread.sleep(3000);
	  WebElement pwd=driver.findElement(By.name("password"));
	  pwd.sendKeys("Aish");
	  Thread.sleep(3000);
	  WebElement conpwd=driver.findElement(By.name("confirmPassword"));
	  conpwd.sendKeys("Aish");
	  Thread.sleep(3000);
	  WebElement sub=driver.findElement(By.name("submit"));
	  sub.click();
	  
	 Thread.sleep(3000);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Desktop\\chrome\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/register.php");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
