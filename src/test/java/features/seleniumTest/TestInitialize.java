package features.seleniumTest;

import framework.base.BrowserType;
import framework.base.DriverContext;
import framework.base.FrameworkInitialize;
import framework.config.ConfigReader;
import framework.config.Settings;
import framework.utilities.ExcelUtil;
import framework.utilities.LogUtil;
import org.junit.Before;

import java.io.IOException;

public class TestInitialize extends FrameworkInitialize {


    @Before
    public void Initialize() throws IOException {

//        String url = "http://automationpractice.com/index.php";
        ConfigReader.PopulateSettings();

        LogUtil logUtil = new LogUtil();
        logUtil.CreateLogFile();
        logUtil.Write("Framework Initialize");

        InitializeBrowser(Settings.BrowserType);
        DriverContext.Browser.GoToUrl(Settings.AUTConnectionString);

        try {

            ExcelUtil util = new ExcelUtil(Settings.ExcelSheetPath);
        } catch (Exception e) {

        }
    }


}
