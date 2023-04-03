package Banking;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day6 {

	public static void main(String[] args) throws IOException {
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
		TakesScreenshot scrn=((TakesScreenshot)d);
		File srcfile=scrn.getScreenshotAs(OutputType.FILE);
		File destfile=new File("C:\\Users\\prita\\eclipse-workspace\\ScreenShots\\guru99.jpg");
		FileUtils.copyFile(srcfile, destfile); 
		d.get("https://www.demo.guru99.com/V4/");
		d.manage().window().maximize();
		d.findElement(By.name("uid")).sendKeys("mngr7482085");
		d.findElement(By.name("password")).sendKeys("utasabA");
		d.findElement(By.name("btnLogin")).click();
		Alert alt=d.switchTo().alert();
		alt.accept();
		d.get("https://www.demo.guru99.com/V4/");
		d.manage().window().maximize();
		d.findElement(By.name("uid")).sendKeys("mngr482085");
		d.findElement(By.name("password")).sendKeys("utAasabA");
		d.findElement(By.name("btnLogin")).click();
		alt.accept();
		d.get("https://www.demo.guru99.com/V4/");
		d.manage().window().maximize();
		d.findElement(By.name("uid")).sendKeys("mngr782085");
		d.findElement(By.name("password")).sendKeys("utAasabA");
		d.findElement(By.name("btnLogin")).click();
		alt.accept();
	}

}
