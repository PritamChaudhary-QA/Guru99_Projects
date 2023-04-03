package Banking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\prita\\eclipse-workspace\\Guru99Live_Project\\Drivers\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://www.demo.guru99.com/V4/");
		d.manage().window().maximize();
		d.findElement(By.name("uid")).sendKeys("mngr482085");
		d.findElement(By.name("password")).sendKeys("utasabA");
		d.findElement(By.name("btnLogin")).click();
		String title=d.getTitle();
		System.out.println(title);

	}

}
