package resources;


import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	
	public WebDriver driver;
	
	public Properties prop;
	
	
	public WebDriver initializeDriver() throws IOException {
		
		
		
	prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//resources//data.properties"); 
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			//ChromeOptions options = new ChromeOptions();
	        //options.addArguments("headless");
	        // options.addArguments("window-size=1400,800");       
	        // options.addArguments("disable-gpu");
			//driver = new ChromeDriver(options);

			driver = new ChromeDriver();
		}
		
		else if (browserName.equals("firefox")){
				
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			
		}
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		return driver;
	}

	public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source =ts.getScreenshotAs(OutputType.FILE);
	String destinationFile = System.getProperty("user.dir")+"//screenshots//"+testCaseName+".png";
	FileUtils.copyFile(source,new File(destinationFile));
	return destinationFile;


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
