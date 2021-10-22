package Pages

import Common.Constant
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import java.nio.file.WatchEvent

class JobPage(driver: WebDriver) {

    init {
        PageFactory.initElements(driver, this)
    }

    //PATH ADD JOBS

    @FindBy(id = "menu_admin_Job")
    var jobs: WebElement? = null
    @FindBy(id = "menu_admin_viewJobTitleList")
    var goJobTitle: WebElement? = null
    @FindBy(id = "btnAdd")
    var addJobButton: WebElement? = null
    @FindBy(id = "jobTitle_jobTitle")
    var jobTitle: WebElement? =null
    @FindBy(id = "jobTitle_jobDescription")
    var jobDescript: WebElement? = null
    @FindBy(id = "jobTitle_jobSpec")
    var uploadFile: WebElement? = null
    @FindBy(id = "jobTitle_note")
    var note: WebElement? = null
    @FindBy(id = "btnSave")
    var saveBtn: WebElement? = null

    // PATH DELETE JOBS

    @FindBy (xpath = "//*[@id='ohrmList_chkSelectRecord_4']")
    var checkBox: WebElement? = null
    @FindBy (id = "btnDelete")
    var deleteBtn: WebElement? = null
    @FindBy (id = "dialogDeleteBtn")
    var btnConfirm: WebElement? = null


     //ADD USER

    fun setJobs(){
        jobs?.click()
    }
    fun setGoJobTitle(){
        goJobTitle?.click()
    }
    fun setAddJobButton(){
        addJobButton?.click()
    }
    fun setJobTitle(){
        jobTitle?.sendKeys("System Engineer")
    }
    fun setJobDescription(){
        jobDescript?.sendKeys("I worked as QA Automation Engineer")
    }
    fun setUploadFile() {
        uploadFile?.sendKeys(Constant.imageSpidy)
    }
    fun setNote(){
        note?.sendKeys("Manual Tests, Automated Tests, Smoke test ")
    }
    fun setSaveBtn(){
        saveBtn?.click()
    }

    //DELETE JOBS

    fun setCheckBox(){
        checkBox?.click()
    }
    fun setDeleteBtn(){
        deleteBtn?.click()
    }
    fun setBtnConfirm(){
        btnConfirm?.click()
    }


}