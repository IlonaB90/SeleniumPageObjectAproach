import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;

public abstract class BaseTest {

    public void setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1629x842";
        Configuration.headless = false;
    }

    @Before
    public void init() {
        setUp();
    }

    @After
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
