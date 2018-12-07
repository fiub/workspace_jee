package selenium3;//senza questo non mi trova mica la classe Test1:
/*
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 

	at selenium3.Test1.main
	*/


import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
 
 
public class Test1 {
 
 
 
      public static void main(String[] args) {
 
 
              //System.setProperty("webdriver.gecko.driver","G:\\Selenium\\Firefox driver\\geckodriver.exe");
    	  System.setProperty("webdriver.gecko.driver", "C:/gecko/geckodriver-v0.23.0-win64/geckodriver.exe");
    	     // if above property is not working or not opening the application in browser then try below property
             //System.setProperty("webdriver.firefox.marionette","G:\\Selenium\\Firefox driver\\geckodriver.exe");
 
            WebDriver driver = new FirefoxDriver();
 
            driver.get("http://www.facebook.com");
 
            System.out.println("Application title is ============="+driver.getTitle());
 
            //driver.quit();
 
      }
 
 
 
}