package Tests;

import Helpers.helpers;
import Pages.BasePage;
import Pages.PageLogin;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login extends BasePage {

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

    @Test
    public void login(){
        PageLogin pageLogin = new PageLogin(driver);
        helpers helpers = new helpers();

        System.out.println(driver.getCurrentUrl());

        pageLogin.setUsername();
        pageLogin.setPass();
        pageLogin.setLogin();
        helpers.sleepSeconds(5);
        pageLogin.setPerfil();
        helpers.sleepSeconds(3);
        pageLogin.setLogout();
        helpers.sleepSeconds(5);

    }

    @AfterTest
    public void cerrar(){
        closeBrowser();
    }

}
