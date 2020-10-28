package features.seleniumTest;

import framework.base.Base;
import framework.base.DriverContext;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

import static framework.base.Base.CurrentPage;

public class LoginTest extends Base {


    @Before
    public void Initialize() {
        // open browser
        System.setProperty("webdriver.chrome.driver", "C:\\PLIKI\\DRIVERS\\chromedriver.exe");
        DriverContext.Driver = new ChromeDriver();
        DriverContext.Driver.navigate().to("http://automationpractice.com/");

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