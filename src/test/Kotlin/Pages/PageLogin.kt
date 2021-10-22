package Pages


import org.openqa.selenium.support.FindBy
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.PageFactory

class PageLogin(var driver: WebDriver) {

    init {
        PageFactory.initElements(driver, this)
    }

    @FindBy(id = "txtUsername")
    var username: WebElement? = null
    @FindBy(id = "txtPassword")
    var pass: WebElement? = null

    @FindBy(id = "btnLogin")
    var login: WebElement? = null

    @FindBy(id = "welcome")
    var profile: WebElement? = null

    @FindBy(linkText = "Logout")
    var logout: WebElement? = null


    fun setUsername() {
        username!!.sendKeys("Admin")
    }

    fun setPass() {
        pass!!.sendKeys("admin123")
    }

    fun setLogin() {
        login!!.click()
    }

    fun setProfile() {
        profile!!.click()
    }

    fun setLogout() {
        logout!!.click()
    }
}