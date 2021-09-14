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
    @Test(priority = 0)
    public void adminTest(){
        Login login = new Login();
        PageLogin pageLogin = new PageLogin(driver);
        helpers helpers = new helpers();
        AdminPage adminPage = new AdminPage(driver);

        pageLogin.setUsername();
        pageLogin.setPass();
        pageLogin.setLogin();
        helpers.sleepSeconds(3);
        helpers.sleepSeconds(3);
        adminPage.setAdmin();
        helpers.sleepSeconds(3);
        adminPage.setAddUser();
        helpers.sleepSeconds(2);
        adminPage.setRolUser();
        adminPage.setNameEmploy();
        helpers.sleepSeconds(2);
        adminPage.setUserName();
        helpers.sleepSeconds(2);
        adminPage.setStatus();
        helpers.sleepSeconds(2);
        adminPage.setTipoStatus();
        adminPage.setPass();
        helpers.sleepSeconds(2);
        adminPage.setConfPass();
        helpers.sleepSeconds(2);
        adminPage.setSave();
        helpers.sleepSeconds(8);
        adminPage.setUserToDelete();
        helpers.sleepSeconds(2);

    }

    @Test (priority = 1)
    public void deleteUser(){
        helpers helpers = new helpers();
        PageLogin pageLogin = new PageLogin(driver);
        AdminPage adminPage = new AdminPage(driver);

        helpers.sleepSeconds(4);
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
        PageLogin pageLogin = new PageLogin(driver);
        helpers helpers = new helpers();

        helpers.sleepSeconds(6);
        pageLogin.setPerfil();
        helpers.sleepSeconds(4);
        pageLogin.setLogout();
        helpers.sleepSeconds(4);
        closeBrowser();
    }

}
