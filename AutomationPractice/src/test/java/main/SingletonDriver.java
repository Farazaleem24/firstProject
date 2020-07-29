package main;
//A singleton class is a class where we make sure that we pass on same instance of the object
//Here we want to pass same driver
//If we create a singleton driver class, what would be the limitation for testing

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingletonDriver {

	public SingletonDriver(WebDriver driver) {
		SingletonDriver.driver = driver;
	}

	protected static WebDriver driver = null;
	private static SingletonDriver driverInstance = null;


	public static SingletonDriver getThisClassInstance() {
		if (driverInstance == null)
			driverInstance = new SingletonDriver(driver);
		return driverInstance; 
	}

	public WebDriver getDriver() {
		return driver;
	}


	public WebDriver openBrowser(String browser, String url) {
		if(driver==null) {
			if(browser.equalsIgnoreCase("Chrome")) {
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				driver.navigate().to(url);
			}
			else if(browser.equalsIgnoreCase("Chrome")) {
				driver = new EdgeDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				driver.navigate().to(url);
			}
			else if(browser.equalsIgnoreCase("Chrome")) {
				driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				driver.navigate().to(url);
			}
			else {
				System.out.println("Incorrect Driver!!");
			}
		}
		return driver;
	}
}
