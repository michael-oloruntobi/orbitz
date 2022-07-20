package resources;


import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	WebDriver driver;
	
	public Properties prop;
	
	
	public WebDriver initializeDriver() throws IOException {
		
		
		
	prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//resources//data.properties"); 
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver");
		
			//ChromeOptions options = new ChromeOptions();
	        //options.addArguments("headless");
	       // options.addArguments("window-size=1400,800");       
	       // options.addArguments("disable-gpu");
	        
			//driver = new ChromeDriver(options);
			driver = new ChromeDriver();
		}
		
		else if (browserName.equals("firefox")){
				
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//firefox");
			 driver = new FirefoxDriver();
			
		}
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		return driver;
	}
	
	
	public String numbers(int length) {
		
		String result1 = "";
		Random integr = new Random();
		
		for (int i = 0; i < length; i++) {
			
			result1 += integr.nextInt(9);	
		}
		return result1;
	}

	
	
}