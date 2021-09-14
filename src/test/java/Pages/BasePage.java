package Pages;

import Common.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {

    public WebDriver driver;

    public void openBrowserChrome(){

        System.setProperty("webdriver.chrome.driver", Constant.ChromeDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Constant.Web_URL);
    }
    public void openBrowserFirefox(){

        System.setProperty("webdriver.gecko.driver", Constant.FirefoxDriver);
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(Constant.Web_URL);
    }

    public void closeBrowser() {
        driver.close();
        driver.quit();

    }
}
