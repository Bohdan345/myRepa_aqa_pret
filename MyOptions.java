package WebDriverInitialize;

import org.openqa.selenium.chrome.ChromeOptions;

public class MyOptions {


    public static ChromeOptions chrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-infobars");
        options.addArguments("--no-sandbox");
        return options;
    }
}
