package browsercommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Desktop\\chrome\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.wikipedia.org/");
driver.manage().window().maximize();
String title=driver.getTitle();
System.out.println("tiltle is"+title);
if(driver.getTitle().equals("Wikipedia"))
		{
	System.out.println("title obtained");
		}
else
{
	System.out.println("title not obtained");
}
	
	
String q=driver.getCurrentUrl();
System.out.println("current url"+q);
driver.close();
}
}
