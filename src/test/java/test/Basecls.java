package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Basecls {
	WebDriver driver;
	 @BeforeTest
	 public void setup() throws InterruptedException
	 {
		 driver=new ChromeDriver();
		 driver.get("https://www.wappalyzer.com/");
		 driver.manage().window().maximize();
			Thread.sleep(3000);
	 }
	 
}