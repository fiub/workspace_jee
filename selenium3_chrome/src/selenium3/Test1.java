package selenium3;//senza questo non mi trova mica la classe Test1:
/*
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 

	at selenium3.Test1.main
	*/

/*
 * IMPORTANT NOTE: chrome must be installed on the server
 */

import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.chrome.ChromeDriver;;
 
 
 
public class Test1 {
 
 
 
      public static void main(String[] args) {
 
 
              //System.setProperty("webdriver.gecko.driver","G:\\Selenium\\Firefox driver\\geckodriver.exe");
    	  System.setProperty("webdriver.gecko.driver", "C:/gecko/geckodriver-v0.23.0-win64/geckodriver.exe");
    	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\fiub\\Downloads\\chromedriver_win32\\chromedriver.exe");
  	     // if above property is not working or not opening the application in browser then try below property
             //System.setProperty("webdriver.firefox.marionette","G:\\Selenium\\Firefox driver\\geckodriver.exe");
 
            WebDriver driver = new ChromeDriver();
 
            driver.get("http://www.facebook.com");
 
            System.out.println("Application title is ============="+driver.getTitle());
 
            //driver.quit();
 
      }
 
 
 
}