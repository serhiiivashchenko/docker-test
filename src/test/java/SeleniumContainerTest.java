import org.junit.Test;
import org.openqa.selenium.remote.RemoteWebDriver;


public class SeleniumContainerTest extends BaseTest{
    @Test
    public void simplePlainSeleniumTest() throws InterruptedException {
        System.out.println("Test has started");
        RemoteWebDriver driver = chrome.getWebDriver();
        driver.get("https://wikipedia.org");
        Thread.sleep(5000);
        System.out.println("Hello World");
    }
}