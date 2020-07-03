import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverChrome implements Driver{
  private static final Logger logger = LogManager.getLogger(DriverChrome.class);
  @Override
  public WebDriver createDriver() {
    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    logger.info("Driver: {}", driver);
    return driver;
  }
}
