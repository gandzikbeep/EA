package features.seleniumTest;

import framework.base.BrowserType;
import framework.base.DriverContext;
import framework.base.FrameworkInitialize;
import org.junit.Before;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;


public class LoginTest extends FrameworkInitialize {


    @Before
    public void Initialize() {
        InitializeBrowser(BrowserType.Chrome);
        DriverContext.Browser.GoToUrl("http://automationpractice.com/");
    }


    @Test
    public void Login() throws InterruptedException {

        CurrentPage = GetInstance(HomePage.class);
        CurrentPage = CurrentPage.As(HomePage.class).ClickOnSignInBtn();

        Thread.sleep(2000);
        CurrentPage.As(LoginPage.class).Login("anna@test.pl", "111111");

    }
}


//    https://demosite.executeautomation.com/Login.html