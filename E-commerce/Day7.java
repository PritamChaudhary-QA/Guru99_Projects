package Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\prita\\eclipse-workspace\\Guru99Live_Project\\Drivers\\geckodriver.exe");
		  WebDriver d=new FirefoxDriver();
		  //Test Step 1
		  d.get("https://clicks.aweber.com/y/ct/?l=NIs7c&m=mcNYuYFeLUQLjy9&b=h5T4l2fu1DOGeQSqXkdkzQ");
		  d.manage().window().maximize();
		//Test Step 2
		  d.findElement(By.xpath("//*[@id=\'header\']/div/div[2]/div/a/span[2]")).click();
		  d.findElement(By.xpath("//*[@id=\'header-account\']/div/ul/li[1]/a")).click();
		 //Test Step 3
		  d.findElement(By.id("email")).sendKeys("pritam01chaudhary@gmail.com");
		  d.findElement(By.id("pass")).sendKeys("Pritustr@92");
		  d.findElement(By.id("send2")).click();
		 //Test Step 4
		  d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[4]/a")).click();
		 //Test Step 5
		  d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/table/tbody/tr/td[6]/span/a[1]")).click();
		  //Test Step 6
		  String verify=d.getTitle();
		  System.out.println("Order #100018983 - Pending");
		  //Test Step 7
		  d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/a[2]")).click();
		  //Test Step 8
		  d.findElement(By.xpath("//*[@id=\"sidebar\"]//print-preview-button-strip//div/cr-button[1]")).click();
		  
		  
	}

}
