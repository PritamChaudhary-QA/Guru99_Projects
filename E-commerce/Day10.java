package Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\prita\\eclipse-workspace\\Guru99Live_Project\\Drivers\\geckodriver.exe");
		  WebDriver d=new FirefoxDriver();
		  //Test Step 1
		  d.get("http://live.techpanda.org/index.php/backendlogin");
			//Test Step 2
			d.findElement(By.name("login[username]")).sendKeys("user01");
			d.findElement(By.name("login[password]")).sendKeys("guru99com");
			d.findElement(By.xpath("//*[@id='loginForm']/div/div[5]/input")).click();
			//Test Step 3
			d.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/a/span")).click();
			d.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/ul/li[1]/a/span")).click();
			d.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/ul/li[1]/ul/li[1]/a/span")).click();
			//Test Step 4
			d.findElement(By.id("sales_order_grid_export")).click();
			
			d.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[3]/div/table/tbody/tr/td[2]/button/span/span/span")).click();
			
	}

}
