 import WebDriverInitialize.SingletonBrowserClass;
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.support.ui.*;

 import java.time.Duration;
 import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class MyWait {

   //Expliсit waits



   WebDriver driver = initDriver.getInstance().openBrowser();

   // Wait for cheking clickable
   public void clickableCheck(By locator) {
       WebDriverWait wait = new WebDriverWait(driver, 10);
       WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
   }

   // cheking  visible
   public void visibilCheck(By locator) {
       WebDriverWait wait = new WebDriverWait(driver, 10);
       WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
   }

   // cheking  visible
   public void invisibilCheck(By locator) {
       (new WebDriverWait(driver, 10)).until(ExpectedConditions.invisibilityOfElementLocated(locator));
   }

   public void titleCheck(String title) {
       (new WebDriverWait(driver, 10)).until(ExpectedConditions.titleIs(title));
   }

   // implicit wait
   public void inpWaitFind_id(By locator) {
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       WebElement element = driver.findElement(locator);
   }

   // fluence weit

   public void waitFluent(By locator) {

       Wait wait = new FluentWait<WebDriver>(driver)
               .withTimeout(Duration.ofSeconds(10))
               .pollingEvery(Duration.ofSeconds(2))
               .withMessage("Fluent wait work")
               .ignoring(NoSuchElementException.class);
       wait.until(ExpectedConditions.presenceOfElementLocated(locator));
   }
}
