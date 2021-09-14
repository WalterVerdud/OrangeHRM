package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {

    WebDriver driver;


    By admin = By.id("menu_admin_viewAdminModule");
    By addUser = By.id("btnAdd");

    // Locators Add User

    By rolUser = By.id("systemUser_userType");
    By nameEmploy = By.id("systemUser_employeeName_empName");
    By userName = By.id("systemUser_userName");
    By status = By.id("systemUser_status");
    By tipoStatus = By.xpath("//*[@id='systemUser_status']/option[1]");
    By pass = By.id("systemUser_password");
    By confPass = By.id("systemUser_confirmPassword");
    By save = By.id("btnSave");
    By btnOk = By.id("dialogDeleteBtn");

    // Locator Delete User

    By userToDelete = By.id("searchSystemUser_userName");
    By delUserName = By.id("searchSystemUser_userName");
    By searchUser = By.id("searchBtn");
    By selectUser = By.id("ohrmList_chkSelectAll");
    By btnDelete = By.id("btnDelete");



    public AdminPage(WebDriver driver){

        this.driver = driver;
    }

    public void setAdmin(){
        driver.findElement(admin).click();
    }
    public void setAddUser(){
        driver.findElement(addUser).click();
    }
    public void setRolUser(){
        driver.findElement(rolUser).click();
    }
    public void setNameEmploy(){
        driver.findElement(nameEmploy).sendKeys("Fiona Grace");
    }
    public void setUserName(){
        driver.findElement(userName).sendKeys("FioGrace");
    }
    public void setStatus(){
        driver.findElement(status).click();
    }
    public void setTipoStatus(){
        driver.findElement(tipoStatus).click();
    }
    public void setPass(){
        driver.findElement(pass).sendKeys("Testeando15");
    }
    public void setConfPass(){
        driver.findElement(confPass).sendKeys("Testeando15");
    }
    public void setSave(){
        driver.findElement(save).click();
    }

    // Constructores Delete User

    public void setUserToDelete(){
        driver.findElement(userToDelete).click();
    }
    public void setDelUserName(){
        driver.findElement(delUserName).sendKeys("FioGrace");
    }
    public void setSearchUser(){
        driver.findElement(searchUser).click();
    }
    public void setSelectUser(){
        driver.findElement(selectUser).click();
    }
    public void setBtnDelete(){
        driver.findElement(btnDelete).click();
    }
    public void setBtnOk(){
        driver.findElement(btnOk).click();
    }
}
