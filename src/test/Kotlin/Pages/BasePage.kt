package Pages

import Common.Constant
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

open class BasePage {

    var driver: WebDriver? = null
    fun openBrowserChrome() {
        System.setProperty("webdriver.chrome.driver", Constant.ChromeDriver)
        driver = ChromeDriver()
        driver?.manage()?.window()?.maximize()
        driver?.get(Constant.Web_URL)
    }
     /* //Funcion para llamar a firefox
    fun openBrowserFirefox() {
        System.setProperty("webdriver.gecko.driver", Constant.FirefoxDriver)
        driver = FirefoxDriver()
        driver?.manage()?.window()?.maximize()
        driver?.get(Constant.Web_URL)
    }

      */

    fun closeBrowser() {
        driver!!.close()
        driver!!.quit()
    }
}