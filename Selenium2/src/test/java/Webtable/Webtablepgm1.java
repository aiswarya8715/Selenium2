package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Webtablepgm1 {
	WebDriver driver;
  @Test
  public void f() {
	  List<WebElement>cols= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	  int col_size=cols.size();
	  System.out.println("column size"+col_size);
	  List<WebElement>rows= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
	  int row_size=rows.size();
	  System.out.println("row size"+row_size);
	  WebElement d=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[4]/td[4]"));
	  System.out.println("value of 3rd row and 4th coloumn"+d.getText());
	  for(int i=0;i<row_size;i++)
	  {
		  List<WebElement>currentrow=rows.get(i).findElements(By.tagName("td"));
		  for(int j=0;j<col_size;j++)
		  {
			  String readdata=currentrow.get(j).getText();
			  System.out.println("value is"+readdata);
		  }
	  }
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Desktop\\chrome\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/web-table-element.php");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
