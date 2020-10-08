package WebDriverInit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.DriverManager;

import static WebDriverInit.Data.*;

public class initDriver {
    private static initDriver instanceDriver = null;
    private WebDriver driver;

    public initDriver() {
    }

    public WebDriver openBrowser() {

        if (DRIVER_TYPE.equals("PR")) {

            switch (DRIVER_NAME) {
                case "CH": {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                }
                case "FF": {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                }
                default:

                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

            }
        } else {
            switch (DRIVER_NAME) {
                case "CH": {
                    System.setProperty("webdriver.chrome.driver", "C:\\Trainee_Project\\Trainee_Project\\chromedriver.exe");
                    driver = new ChromeDriver();
                    System.out.println("Property");
                    break;
                }


                case "FF": {
                    System.setProperty("webdriver.gecko.driver", "C:\\Trainee_Project\\Trainee_Project\\chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
                }
            }
        }
        return driver;
    }

    public static initDriver getInstance() {

        if (instanceDriver == null)
            instanceDriver = new initDriver();
        return instanceDriver;
    }
}