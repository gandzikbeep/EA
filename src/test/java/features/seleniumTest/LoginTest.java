package features.seleniumTest;

import framework.config.Settings;
import framework.utilities.ExcelUtil;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;



public class LoginTest extends TestInitialize {



    @Test
    public void Login() throws InterruptedException {
        Settings.Logs.Write("Login method");

        CurrentPage = GetInstance(HomePage.class);
        CurrentPage = CurrentPage.As(HomePage.class).ClickOnSignInBtn();

        Thread.sleep(2000);

        CurrentPage.As(LoginPage.class)
                .Login(ExcelUtil.ReadCell("UserName", 1), ExcelUtil.ReadCell("Password", 1));

    }
}


//    https://demosite.executeautomation.com/Login.html