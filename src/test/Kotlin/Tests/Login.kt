package Tests

import Helpers.helpers
import Pages.BasePage
import Pages.PageLogin
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test

class Login : BasePage() {
    @BeforeTest
    //@Parameters("url", "BrowserType")
    fun setUp() {
        //url: String?, browserType: String
        //if (browserType.equals("Chrome", ignoreCase = true)) {
            openBrowserChrome()
        //} else if (browserType.equals("Firefox", ignoreCase = true)) {
          //  openBrowserFirefox()
        //}
      //  println("Opening: Navegador $browserType")
    }

    @Test
    fun login() {
        val pagelogin = PageLogin(driver!!)
        val helpers = helpers()
        println(driver!!.currentUrl)
        pagelogin.setUsername()
        pagelogin.setPass()
        pagelogin.setLogin()
        helpers.sleepSeconds(5)
        //pageLogin.setPerfil();
        //helpers.sleepSeconds(3);
        //pageLogin.setLogout();
        //helpers.sleepSeconds(5);
    }

    @AfterTest
    fun cerrar() {
        closeBrowser()
    }
}