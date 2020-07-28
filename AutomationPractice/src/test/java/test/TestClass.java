package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	
	@Test
	public void testing() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
	}

}
