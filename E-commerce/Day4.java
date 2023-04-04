package Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Day4 {
	WebDriver d;
  @Test
  public void verify() 
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\prita\\eclipse-workspace\\Guru99Live_Project\\Drivers\\geckodriver.exe");
	  d=new FirefoxDriver();
	  //Test Step 1
	  d.get("https://http://live.techpanda.org/");
	  d.manage().window().maximize();
	  //Test Step 2
	  d.findElement(By.xpath("//*[@id=\'nav\']/ol/li[1]/a")).click();
	  //Test Step 3
	  d.findElement(By.xpath("//*[@id=\'top\']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a")).click();
	  d.findElement(By.xpath("//*[@id=\'top\']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a")).click();
	  //Test Step 4
	  d.findElement(By.xpath("//*[@id=\'top\']/body/div/div/div[2]/div/div[3]/div[1]/div[2]/div/button/span/span")).click();
	  //Test Step 5
	  String verify=d.getTitle();
	  System.out.println("Compare Products");
	  //Test Step 6
	  d.findElement(By.xpath("//*[@id=\'top\']/body/div/div[2]/button")).click();
  }
}
