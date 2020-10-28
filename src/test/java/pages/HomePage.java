package pages;

import framework.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage() {

    }

    @FindBy(xpath = "*//a[@title='Log in to your customer account']")
    public WebElement btnSignIn;

    public LoginPage ClickOnSignInBtn(){
        btnSignIn.click();
        return GetInstance(LoginPage.class);
    }

}
