package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day3 {
	//WebDriver driver = new ChromeDriver();
@Test(priority=1)
	public void demo3() {
	 System.out.println("demo3");
	}
@Test(priority=2)
public void demo4() {
   System.out.println("demo4");
}
@BeforeTest
public void beforetest() {
	System.out.println("before test");
}
@AfterTest
public void aftertest() {
	System.out.println("affore test");
}
}

