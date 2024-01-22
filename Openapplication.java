package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openapplication {

	public static void main(String[] args) throws Exception {

    System.setProperty("webdriver.chrome.driver", "D:\\Training Materials\\workspace\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    
   // open url using get()
    driver.get("https://www.facebook.com/");
    
    //maximiz the window
    Thread.sleep(2000);
    driver.manage().window().maximize();
    
    //delete all cookies
    Thread.sleep(2000);
    driver.manage().deleteAllCookies();
    
    //open url using navigate()
    Thread.sleep(2000);
    driver.navigate().to("http://www.google.com/");
    
    //Refresh the page
    Thread.sleep(2000);
    driver.navigate().refresh();
    
    //navigate to back
    Thread.sleep(1000);
    driver.navigate().back();
    
    // navigate to forward
    Thread.sleep(1000);
    driver.navigate().forward();
    
    //current utl
    Thread.sleep(1000);
    System.out.println(driver.getCurrentUrl());
    
    // fatch current url
    Thread.sleep(1000);
    System.out.println(driver.getTitle());
    
    //close the browser
    driver.close();
    
    
    
	}

}
