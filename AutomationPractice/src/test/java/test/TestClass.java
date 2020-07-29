package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import main.SingletonDriver;
import main.UtilClass;

public class TestClass {
	
	@Test
	public void testing() {
		
		WebDriver driver;
		
		SingletonDriver sd = SingletonDriver.getThisClassInstance();
		driver = sd.openBrowser("Chrome", "http://automationpractice.com/index.php");
		UtilClass uc = new UtilClass();
		uc.closeAllBrowser();
		//driver.get("http://automationpractice.com/index.php");
	}

}
