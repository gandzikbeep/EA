package pages;

import framework.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

    public LoginPage() {

    }

    @FindBy(xpath = "//*[@id='email']")
    public WebElement txtUserName;

    @FindBy(id = "passwd")
    public WebElement txtPassword;

    @FindBy(id = "SubmitLogin")
    public WebElement btnLogin;

    public BasePage Login(String userName, String password){

        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
        btnLogin.click();
        return GetInstance(HomePage.class);
    }

//
//    @FindBy(how = How.NAME, using = "UserName")
//    public WebElement txtUserName;
//
//    @FindBy(how = How.NAME, using = "Password")
//    public WebElement txtPassword;
//
//    @FindBy(how = How.NAME, using = "Login")
//    public WebElement btnLogin;
//
//
//    public void Login(String userName, String password){
//
//        txtUserName.sendKeys(userName);
//        txtPassword.sendKeys(password);
//        btnLogin.submit();
//    }




}
