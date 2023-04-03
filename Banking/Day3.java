package Banking;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Day3 
{
	WebDriver d;
  @Test
  public void Login() 
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\prita\\eclipse-workspace\\Guru99Live_Project\\Drivers\\geckodriver.exe");
	  d=new FirefoxDriver();
	  d.get("https://www.demo.guru99.com/V4/");
		d.manage().window().maximize();
		d.findElement(By.name("uid")).sendKeys("mngr482085");
		d.findElement(By.name("password")).sendKeys("utasabA");
		d.findElement(By.name("btnLogin")).click();
		String title=d.getTitle();
		System.out.println(title);
		d.get("https://www.demo.guru99.com/V4/");
		d.manage().window().maximize();
		d.findElement(By.name("uid")).sendKeys("mngr7482085");
		d.findElement(By.name("password")).sendKeys("utasabA");
		d.findElement(By.name("btnLogin")).click();
		Alert alt=d.switchTo().alert();
		alt.accept();
		d.get("https://www.demo.guru99.com/V4/");
		d.manage().window().maximize();
		d.findElement(By.name("uid")).sendKeys("mngr482085");
		d.findElement(By.name("password")).sendKeys("utAasabA");
		d.findElement(By.name("btnLogin")).click();
		alt.accept();
  }
}
