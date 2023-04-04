package Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day5 {

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
		  //Test Step 2
		  d.findElement(By.xpath("//*[@id=\'login-form\']/div/div[1]/div[2]/a/span/span")).click();
		  //Test Step 3
		  d.findElement(By.id("firstname")).sendKeys("Shruti");
		  d.findElement(By.id("middlename")).sendKeys("Lalit");
		  d.findElement(By.id("lastname")).sendKeys("Gaikwad");
		  d.findElement(By.id("email_address")).sendKeys("pritam01chaudhary@gmail.com");
		  d.findElement(By.id("password")).sendKeys("Pritustr@92");
		  d.findElement(By.id("confirmation")).sendKeys("Pritustr@92");
		  //Test Step 4
		  d.findElement(By.xpath("//*[@id=\'form-validate\']/div[2]/button/span/span")).click();
		  //Test Step 5
		  String verify=d.getTitle();
		  System.out.println("\r\n"
		  		+ "\r\n"
		  		+ "Hello, Shruti Lalit Gaikwad!\r\n"
		  		+ "\r\n"
		  		+ "From your My Account Dashboard you have the ability to view a snapshot of your recent account activity and update your account information. Select a link below to view or edit information.\r\n"
		  		+ "");
		  //Test Step 6
		  d.findElement(By.xpath("//*[@id=\'nav\']/ol/li[2]/a")).click();
		  //Test Step 7
		  d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a")).click();
		  d.findElement(By.id("email")).sendKeys("pritam01chaudhary@gmail.com");
		  d.findElement(By.id("pass")).sendKeys("Pritustr@92");
		  d.findElement(By.id("send2")).click();
		 /* //Test Step 6
		  d.findElement(By.xpath("//*[@id=\'nav\']/ol/li[2]/a")).click();
		 // Test Step 7
		  d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a")).click();*/
		  //Test Step 8
		  d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/form[1]/div/div/button[1]/span/span")).click();
		  //Test Step 9
		  d.findElement(By.id("email_address")).sendKeys("shrutilanjewar5@gmail.com");
		  d.findElement(By.id("message")).sendKeys("Being product purchase for Shruti Gaikwad");
		  //Test Step 10
		  d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/div[2]/button/span/span")).click();
		  String ver=d.getTitle();
		  System.out.println("Your Wishlist has been shared.");
		  
		  

	}

}
