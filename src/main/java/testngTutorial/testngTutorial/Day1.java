package testngTutorial.testngTutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	//WebDriver driver = new ChromeDriver();
	@Test(priority=1)
	public void sumsung() {
		 System.out.println("sumsung");
	}
	@Test(priority=2,dataProvider="getData")
	public void splender(String username,String password) {
		 System.out.println("all set" + password);
	}
	
	@Test(priority=3,groups= {"smoke"})
	public void iphone() {
		
		
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("befor class");
	}
	@BeforeSuite
	public void afterSuite() {
		System.out.println("before suite");
	}
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data= new Object[2][2];
		data[0][0]="vikash";
		data[0][1]="vikas@12";
		data[1][0]="shailesh";
		data[1][1]="shailesh@12";
		return data;
		
		
	}
	

}
