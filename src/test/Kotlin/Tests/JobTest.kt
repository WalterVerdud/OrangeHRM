package Tests

import Helpers.helpers
import Pages.AdminPage
import Pages.BasePage
import Pages.JobPage
import Pages.PageLogin
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test

class JobTest : BasePage(){

    @BeforeTest
    fun setUp(){
        openBrowserChrome()
    }

    @Test(priority = 1)
    fun logueo(){
        var pageLogin = PageLogin(driver!!)
        val helpers = helpers()

        pageLogin.setUsername()
        pageLogin.setPass()
        pageLogin.setLogin()
        helpers.sleepSeconds(5)
    }


    @Test(priority = 2)
    fun jobTest(){
        val helpers = helpers()
        val adminPage = AdminPage(driver!!)
        val jobpage = JobPage(driver!!)

        adminPage.setAdmin()
        jobpage.setJobs()
        helpers.sleepSeconds(3)
        jobpage.setGoJobTitle()
        helpers.sleepSeconds(3)
        jobpage.setAddJobButton()
        helpers.sleepSeconds(3)
        jobpage.setJobTitle()
        helpers.sleepSeconds(3)
        jobpage.setJobDescription()
        helpers.sleepSeconds(5)
        jobpage.setUploadFile()
        helpers.sleepSeconds(5)
        jobpage.setNote()
        helpers.sleepSeconds(3)
        jobpage.setSaveBtn()
        helpers.sleepSeconds(3)

    }
    @Test(priority = 3)
    fun deleteJobs(){
        val helpers = helpers()
        val jobpage = JobPage(driver!!)
        val adminPage = AdminPage(driver!!)

        //adminPage.setAdmin()
        helpers.sleepSeconds(3)
        //jobpage.setGoJobTitle()
        helpers.sleepSeconds(3)
        jobpage.setCheckBox()
        helpers.sleepSeconds(3)
        jobpage.setDeleteBtn()
        helpers.sleepSeconds(3)
        jobpage.setBtnConfirm()
        helpers.sleepSeconds(3)

    }

    @AfterTest
    fun tearDown(){
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