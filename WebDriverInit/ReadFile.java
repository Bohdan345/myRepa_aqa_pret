package WebDriverInit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadFile {


    public String getReadPropertyFile(String name) {
        String browser = "";

        try {


            InputStream input = new FileInputStream("C:\\Trainee_Project\\Trainee_Project\\src\\main\\java\\WebDriverInit\\Config.properties");
            Properties prop = new Properties();
            prop.load(input);
            browser = prop.getProperty(name);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return browser;
    }
}
