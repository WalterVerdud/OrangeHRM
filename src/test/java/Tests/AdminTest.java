package Tests;

import Helpers.helpers;
import Pages.AdminPage;
import Pages.BasePage;
import Pages.PageLogin;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdminTest extends BasePage {

    @BeforeTest
    @Parameters({"URL","BrowserType"})
    public void setUp(String url, String browserType) {
        if (browserType.equalsIgnoreCase("Chrome")){
            openBrowserChrome();

        }else if (browserType.equalsIgnoreCase("Firefox")){
            openBrowserFirefox();
        }
        System.out.println("Opening: Navegador " + browserType);
    }
    @Test(priority = 1)
    public void adminTest(){
        Login login = new Login();
        PageLogin pageLogin = new PageLogin(driver);
        helpers helpers = new helpers();
        AdminPage adminPage = new AdminPage(driver);

        pageLogin.setUsername();
        pageLogin.setPass();
        pageLogin.setLogin();
        helpers.sleepSeconds(3);
        //pageLogin.setPerfil();
        helpers.sleepSeconds(3);
        adminPage.setAdmin();
        helpers.sleepSeconds(5);
        adminPage.setAddUser();
        helpers.sleepSeconds(3);
        adminPage.setRolUser();
        adminPage.setNameEmploy();
        helpers.sleepSeconds(3);
        adminPage.setUserName();
        helpers.sleepSeconds(3);
        adminPage.setStatus();
        helpers.sleepSeconds(3);
        adminPage.setTipoStatus();
        adminPage.setPass();
        helpers.sleepSeconds(3);
        adminPage.setConfPass();
        helpers.sleepSeconds(3);
        adminPage.setSave();
        helpers.sleepSeconds(5);
        //driver.navigate().back();
        //helpers.sleepSeconds(5);

    }
    @Test (priority = 2)
    public void deleteUser(){
        helpers helpers = new helpers();
        AdminPage adminPage = new AdminPage(driver);

        adminPage.setAdmin();
        adminPage.setDelUserName();
        helpers.sleepSeconds(3);
        adminPage.setSearchUser();
        helpers.sleepSeconds(3);
        adminPage.setSelectUser();
        helpers.sleepSeconds(3);
        adminPage.setBtnDelete();
        helpers.sleepSeconds(3);
        adminPage.setBtnOk();
        helpers.sleepSeconds(5);




    }

    @AfterTest
    public void cerrar(){
        closeBrowser();
    }

}
