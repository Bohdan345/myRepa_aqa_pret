package WebDriverInit;

public class Data {


public  static final String DRIVER_PATH =  new ReadFile().getReadPropertyFile( "driver.path");
 public  static final String DRIVER_NAME =  new ReadFile().getReadPropertyFile( "driver.name");
 public  static final String DRIVER_TYPE =  new ReadFile().getReadPropertyFile( "driver.type");

}
