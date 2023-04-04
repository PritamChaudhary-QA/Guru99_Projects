package Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day2 {

	private static Object ListCost;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\prita\\eclipse-workspace\\Guru99Live_Project\\Drivers\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		//Test Step 1
		d.get("http://live.techpanda.org/");
		d.manage().window().maximize();
		//Test Step 2
		d.findElement(By.linkText("MOBILE")).click();
		//Test Step 3
		String ListCost=d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[1]/span/span")).getText();
		//Test Step 4
		d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[3]/button/span/span")).click();
		//Test Step 5
		String DetailsCost=d.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/table/tbody/tr/td[3]")).getText();
		//Test Step 6
		if(ListCost.equals(DetailsCost))
		{
			System.out.println("list and details costs are equal");
		}
		else
		{
			System.out.println("list and details costs are not equal");
		}
		

	}

}
