import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestManeger {

    static WebDriver driver;

    @BeforeAll
    public static void setup()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\webDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterAll
    public static void turnDown()
    {
        driver.quit();
    }

}
