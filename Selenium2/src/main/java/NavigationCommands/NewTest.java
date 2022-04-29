package NavigationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Desktop\\chrome\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.wikipedia.org/");
	  driver.manage().window().maximize();
	  driver.navigate().to("https://en.wikipedia.org/wiki/Main_Page");
	  Thread.sleep(3000);
	  driver.navigate().back();
	  Thread.sleep(4000);
	  driver.navigate().forward();
	  Thread.sleep(3000);
	 driver.navigate().refresh();
	 driver.close();
  }
}
