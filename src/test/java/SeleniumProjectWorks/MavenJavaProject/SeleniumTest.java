package SeleniumProjectWorks.MavenJavaProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;

public class SeleniumTest {
	@Test
	public void scanData()
	{
		System.out.println("Data scanned successfully");
	}
	
	@Test
	public void printNumber()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragu1\\Selenium\\chromedriver_win31\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Uninterruptibles.sleepUninterruptibly(10, TimeUnit.SECONDS);
		List<WebElement>links=driver.findElements(By.xpath("//a"));
		
		System.out.println("Total links :"+links.size());
	}

}
