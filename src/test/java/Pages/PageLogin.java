package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageLogin {

    WebDriver driver;


    By username = By.id("txtUsername");
    By pass = By.id("txtPassword");
    By login = By.id("btnLogin");
    By perfil = By.id("welcome");
    By logout = By.linkText("Logout");

    public PageLogin(WebDriver driver){

        this.driver = driver;
    }


    public void setUsername(){
        driver.findElement(username).sendKeys("Admin");
    }

    public void setPass(){
        driver.findElement(pass).sendKeys("admin123");
    }

    public void setLogin(){
        driver.findElement(login).click();
    }
    public void setPerfil(){
        driver.findElement(perfil).click();
    }
    public void setLogout(){
        driver.findElement(logout).click();
    }
}