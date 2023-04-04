package Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\prita\\eclipse-workspace\\Guru99Live_Project\\Drivers\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		//Test Step 1
		d.get("http://live.techpanda.org/");
		d.manage().window().maximize();
		//Test Step 2
		d.findElement(By.xpath("//*[@id=\'nav\']/ol/li[1]/a")).click();
		//Test Step 3
		d.findElement(By.xpath("//*[@id=\'top\']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[3]/button")).click();
		//Test Step 4
		d.findElement(By.xpath("//*[@id=\'shopping-cart-table\']/tbody/tr/td[4]/input")).click();
		d.findElement(By.xpath("//*[@id=\'shopping-cart-table\']/tbody/tr/td[4]/input")).sendKeys("000");
		//Test Step 5
		String verify=d.getTitle();
		System.out.println("* The maximum quantity allowed for purchase is 500. ");
		d.findElement(By.xpath("//*[@id=\'shopping-cart-table\']/tbody/tr/td[4]/button")).click();
		//Test Step 6
		d.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/table/tfoot/tr/td/button[2]/span/span")).click();
		//Test Step 7
		String empty=d.getTitle();
		System.out.println("\r\n"
				+ "Shopping Cart is Empty\r\n"
				+ "\r\n"
				+ "You have no items in your shopping cart.\r\n"
				+ "\r\n"
				+ "Click here to continue shopping.\r\n"
				+ "");
		
	}

}
