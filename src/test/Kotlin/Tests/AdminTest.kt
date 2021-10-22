package Tests

import Helpers.helpers
import Pages.AdminPage
import Pages.BasePage
import Pages.PageLogin
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeTest
import org.testng.annotations.Parameters
import org.testng.annotations.Test

class AdminTest : BasePage() {
    @BeforeTest
    //@Parameters("URL", "BrowserType")
    fun setUp() {
        //url: String?, browserType: String
        //if (browserType.equals("Chrome", ignoreCase = true)) {
            openBrowserChrome()
        //} else if (browserType.equals("Firefox", ignoreCase = true)) {
         //   openBrowserFirefox()
        }
        //println("Opening: Navegador $browserType")
    //}

    @Test(priority = 0)
    fun adminisTest() {
        val login = Login()
        val pageLogin = PageLogin(driver!!)
        val helpers = helpers()
        val adminPage = AdminPage(driver!!)

        pageLogin.setUsername()
        pageLogin.setPass()
        pageLogin.setLogin()
        helpers.sleepSeconds(3)
        adminPage.setAdmin()
        helpers.sleepSeconds(3)
        adminPage.setAddUser()
        helpers.sleepSeconds(2)
        adminPage.setRolUser()
        adminPage.setNameEmploy()
        helpers.sleepSeconds(2)
        adminPage.setUserName()
        helpers.sleepSeconds(2)
        adminPage.setStatus()
        helpers.sleepSeconds(2)
        adminPage.setTipoStatus()
        adminPage.setPass()
        helpers.sleepSeconds(2)
        adminPage.setConfPass()
        helpers.sleepSeconds(2)
        adminPage.setSave()
        helpers.sleepSeconds(8)
        //adminPage.setUserToDelete()
        //helpers.sleepSeconds(2)
    }

    @Test(priority = 1)
    fun deleteUser() {
        var helpers = helpers()
        var pageLogin = PageLogin(driver!!)
        var adminPage = AdminPage(driver!!)


        adminPage.setUserToDelete()
        helpers.sleepSeconds(4)
        adminPage.setDelUserName()
        helpers.sleepSeconds(3)
        adminPage.setSearchUser()
        helpers.sleepSeconds(3)
        adminPage.setSelectUser()
        helpers.sleepSeconds(3)
        adminPage.setBtnDelete()
        helpers.sleepSeconds(3)
        adminPage.setBtnOk()
        helpers.sleepSeconds(5)
    }

    @AfterTest
    fun cerrar() {
        val pageLogin = PageLogin(driver!!)
        val helpers = helpers()
        helpers.sleepSeconds(6)
        pageLogin.setProfile()
        helpers.sleepSeconds(4)
        pageLogin.setLogout()
        helpers.sleepSeconds(4)
        closeBrowser()
    }
}