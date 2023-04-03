package Banking;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Day5 {
	WebDriver d;
	@DataProvider(name="LoginData")
	public static Object[][] credentialObjects(){
		return new Object[][] {
			new Object[]{"mngr482085","utasabA"},{"mngr4852085","utasabA"},{"mngr482085","ut7asabA"},{"mngr4852085","ut7asabA"}};
				
			
		}
		
	
	
  @Test(dataProvider ="LoginData")
  public void f(String username , String password) {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\prita\\eclipse-workspace\\Guru99Live_Project\\Drivers\\geckodriver.exe");
	  d=new FirefoxDriver();
	  d.get("https://www.demo.guru99.com/V4/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.findElement(By.name("uid")).sendKeys(username);
		d.findElement(By.name("password")).sendKeys(password);
		d.findElement(By.name("btnLogin")).click();
		String title=d.getTitle();
		System.out.println(title);
		/*Alert alt=d.switchTo().alert();
		alt.accept();*/
		d.close();
  }
   
  }
