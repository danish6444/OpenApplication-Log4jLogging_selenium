package automation;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4JLogging {

	public static void main(String[] args) {
		// create logger instance
        Logger logger = Logger.getLogger("Log4JLogging");
        
        //config log4j properties file
        PropertyConfigurator.configure("D:\\Training Materials\\Additional Content\\log4j.properties");
        
        //open browser instance
        System.setProperty("webdriver.chrome.driver", "D:\\Training Materials\\workspace\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        logger.info("Chrome browser instance opened");

        //maximize the window
        driver.manage().window().maximize();
        logger.info("window Maximized");
        
        //implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        logger.info("implicit wait given");
        
        //open url
        driver.get("https://www.facebook.com/");
        logger.info("Application opened");
        
        //check if the web element is displayed or not
        try {
        	driver.findElement(By.id("emails")).isDisplayed();
        	logger.info("Web Element Displayed");
        } catch (Exception e) {
        	logger.info("Failure - 'emails' web element is not displayed");
        	
        }
        
        
        
	}

}
