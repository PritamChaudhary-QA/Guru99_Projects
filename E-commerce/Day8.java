package Ecommerce;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day8 {

	public static void main(String[] args) throws Exception {
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
		  d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div[3]/table/tbody/tr/td[6]/span/a[2]")).click();
		 //Test  Step 5
		  String verify=d.getTitle();
		  System.out.println("Grand Total 	$1,230.00");
		 //Test Step 6
		  d.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[3]/div/ul/li[1]/button/span/span")).click();
		  d.findElement(By.id("billing-address-select")).click();
		  Robot r=new Robot();
		  r.keyPress(KeyEvent.VK_DOWN);
		  r.keyPress(KeyEvent.VK_ENTER);
		  d.findElement(By.id("billing:firstname")).sendKeys("Shruti");
		  d.findElement(By.id("billing:middlename")).sendKeys("Lalit");
		  d.findElement(By.id("billing:lastname")).sendKeys("Gaikwad");
		  d.findElement(By.id("billing:company")).sendKeys("Tops Technology");
		  d.findElement(By.id("billing:street1")).sendKeys("Tower 2 Gopal nagar 2nd Bus stop nagpur.");
		  d.findElement(By.id("billing:street2")).sendKeys("Mate Chowk");
		  d.findElement(By.id("billing:city")).sendKeys("Nagpur");
		  d.findElement(By.id("billing:region")).sendKeys("Maharashtra");
		  d.findElement(By.id("billing:postcode")).sendKeys("440022");
		  d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/ol/li[1]/div[2]/form/div/ul/li[2]/div/ul/li[6]/div[2]/div")).click();
		  r.keyPress(KeyEvent.VK_I);
		  r.keyPress(KeyEvent.VK_ENTER);
		  d.findElement(By.id("billing:telephone")).sendKeys("7875068394");
		  d.findElement(By.id("billing:use_for_shipping_yes")).click();
		  d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/ol/li[1]/div[2]/form/div/div/button")).click();
		  r.keyPress(KeyEvent.VK_TAB);
		  r.keyPress(KeyEvent.VK_TAB);
		  r.keyPress(KeyEvent.VK_TAB);
		  r.keyPress(KeyEvent.VK_ENTER);
		 // d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/ol/li[3]/div[2]/form/div[3]/button/span/span")).click();
		  //d.findElement(By.id("p_method_checkmo")).click();
		 // d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/ol/li[4]/div[2]/div[2]/button/span/span")).click();
		  
		  

	}

}
