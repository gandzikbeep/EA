package framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FrameworkInitialize extends Base {

    public void InitializeBrowser(BrowserType browserType) {

        WebDriver driver = null;

        switch (browserType) {
            case Chrome: {
                // open browser
                System.setProperty("webdriver.chrome.driver", "C:\\PLIKI\\DRIVERS\\chromedriver.exe");
                driver = new ChromeDriver();

//                DriverContext.setDriver(driver);
//                DriverContext.Driver = new ChromeDriver();
//                DriverContext.Driver.navigate().to("http://automationpractice.com/");

                break;
            }
            case Firefox: {
                System.setProperty("webdriver.ecko.driver", "C:\\PLIKI\\DRIVERS\\gecko.exe");
                driver = new FirefoxDriver();

//                DriverContext.setDriver(driver);
//                DriverContext.Driver.navigate().to("http://automationpractice.com/");

                break;
            }
            case IE: {
                System.setProperty("webdriver.ie.driver", "C:\\PLIKI\\DRIVERS\\ServerIEDriverServer.exe");
                driver = new InternetExplorerDriver();
//                DriverContext.setDriver(driver);
                //DriverContext.Driver.navigate().to("http://automationpractice.com/");

                break;
            }

        }
        DriverContext.setDriver(driver);

        DriverContext.Browser = new Browser(driver);

    }


}
