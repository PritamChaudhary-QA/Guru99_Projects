package Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\prita\\eclipse-workspace\\Guru99Live_Project\\Drivers\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		//Test step 1.
		d.get("http://live.techpanda.org/");
		d.manage().window().maximize();
		//Test step 2
		String title=d.getTitle();
		System.out.println(title);
		//Test step 3
		d.findElement(By.xpath("//*[@id=\'nav\']/ol/li[1]/a")).click();
		//Test step 4
		String mob=d.getTitle();
		System.out.println(mob);
		// Test step 5
		d.findElement(By.xpath("//*[@id=\'top\']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")).click();
		//Test Step 6
		d.findElement(By.xpath("//*[@id=\'top\']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select/option[2]")).click();
		

	}

}
