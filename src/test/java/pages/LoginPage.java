package pages;

import framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

}
