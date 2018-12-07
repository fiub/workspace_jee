package wikipedia_nav_Project;

//import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

//import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

//import javafx.scene.control.Alert;

public class TestWikipedia {
  private WebDriver driver;
  private String baseUrl;
  //private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://en.wikipedia.org/";
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
  }

  @Test
  public void testWikipedia() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 30000 | ]]
    driver.get(baseUrl + "/wiki/Thomas_Dickey");
    try {
      assertEquals("Thomas Dickey - Wikipedia", driver.getTitle());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("CDK")).click();
    try {
      assertEquals("CDK (programming library) - Wikipedia", driver.getTitle());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  /*
  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
  */
}
