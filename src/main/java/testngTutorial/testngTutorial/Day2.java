package testngTutorial.testngTutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day2 {
	WebDriver driver = new ChromeDriver();
	@Test(priority=1)
    public void Demo1() {
		driver.get("https://www.google.com");
    }
	
	@Test(priority=2)
	public void Demo2() {
		 System.out.println("demo2");
		 Assert.assertEquals("dd", "ed");
	}
	@Test(priority=3,groups= {"smoke"})
	public void Demo3() {
		driver.get("https://www.amazon.com");
		 
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method");
	}
}
