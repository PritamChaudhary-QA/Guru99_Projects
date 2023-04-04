package Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\prita\\eclipse-workspace\\Guru99Live_Project\\Drivers\\geckodriver.exe");
		  WebDriver d=new FirefoxDriver();
		  //Test Step 1
		  d.get("http://live.techpanda.org/");
		  d.manage().window().maximize();
		  //Test Step 2
		  d.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a")).click();
		  d.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button/span/span")).click();
		  //Test Step 3
		  d.findElement(By.xpath("//*[@id=\'coupon_code\']")).sendKeys("GURU50");
		  d.findElement(By.xpath("//*[@id=\'discount-coupon-form\']/div/div/div/div/button/span/span")).click();
		  //Test Step 4
		  String verify=d.getTitle();
		  System.out.println("Coupon code \"GURU50\" was applied.");
		  System.out.println("DISCOUNT (GURU50)	-$25.00");
		  
		  
		  
	}

}
