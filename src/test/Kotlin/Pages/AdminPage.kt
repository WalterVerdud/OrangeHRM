package Pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class AdminPage(driver: WebDriver) {

    init {
        PageFactory.initElements(driver, this)
    }

    @FindBy(id = "menu_admin_viewAdminModule")
    var admin: WebElement? = null

    @FindBy(id = "btnAdd")
    var addUser: WebElement? = null

    // Locators Add User
    @FindBy(id = "systemUser_userType")
    var rolUser: WebElement? = null
    @FindBy(id = "systemUser_employeeName_empName")
    var nameEmploy: WebElement? = null
    @FindBy(id = "systemUser_userName")
    var userName: WebElement? = null
    @FindBy(id = "systemUser_status")
    var status: WebElement? = null
    @FindBy(xpath = "//*[@id='systemUser_status']/option[1]")
    var tipoStatus: WebElement? = null
    @FindBy(id = "systemUser_password")
    var pass: WebElement? = null
    @FindBy(id = "systemUser_confirmPassword")
    var confPass: WebElement? = null
    @FindBy(id = "btnSave")
    var save: WebElement? = null
    @FindBy(id = "dialogDeleteBtn")
    var btnOk: WebElement? = null

    // Locator Delete User
    @FindBy(id = "searchSystemUser_userName")
    var userToDelete: WebElement? = null
    @FindBy(id ="searchSystemUser_userName")
    var delUserName: WebElement? = null
    @FindBy(id ="searchBtn")
    var searchUser: WebElement? = null
    @FindBy(id ="ohrmList_chkSelectAll")
    var selectUser: WebElement? = null
    @FindBy(id ="btnDelete")
    var btnDelete: WebElement? = null


    fun setAdmin() {
        admin?.click()
    }

    fun setAddUser() {
        addUser?.click()
    }

    fun setRolUser() {
        rolUser?.click()
    }

    fun setNameEmploy() {
        nameEmploy?.sendKeys("Lisa Andrews")
    }

    fun setUserName() {
        userName?.sendKeys("LisaAn")
    }

    fun setStatus() {
        status?.click()
    }

    fun setTipoStatus() {
        tipoStatus?.click()
    }

    fun setPass() {
        pass?.sendKeys("Selenium-.99")
    }

    fun setConfPass() {
        confPass?.sendKeys("Selenium-.99")
    }

    fun setSave() {
        save?.click()
    }

    // Constructores Delete User
    fun setUserToDelete() {
        userToDelete?.click()
    }

    fun setDelUserName() {
        delUserName?.sendKeys("LisaAn")
    }

    fun setSearchUser() {
        searchUser?.click()
    }

    fun setSelectUser() {
        selectUser?.click()
    }

    fun setBtnDelete() {
        btnDelete?.click()
    }

    fun setBtnOk() {
        btnOk?.click()
    }

}