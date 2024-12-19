package testngTutorial.testngTutorial;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import page_object_model.LandingPage;

public class StandAlone {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		LandingPage landing = new LandingPage(driver);
		
	   
        landing.login("vkpandey188@gmail.com","Vikas@12");
          
        }

}
