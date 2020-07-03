import org.openqa.selenium.WebDriver;

public class DriverTypeTest {

  public static void main(String[] args) {
    DriverFactory webDriverFactory = createDriverByName("firefox");
    Driver driver = webDriverFactory.createDriver();
    WebDriver webDriver = driver.createDriver();
    webDriver.get("https://ya.ru");
  }

  static DriverFactory createDriverByName(String brouserName) {
    if (brouserName.equalsIgnoreCase("chrome")) {
      return new DriverChromeFactory();
    } else if (brouserName.equalsIgnoreCase("fireFox")){
      return new DriverFireFoxFactory();
    } else {
      throw new RuntimeException(brouserName + " is unknown browser name");
    }
  }

}
