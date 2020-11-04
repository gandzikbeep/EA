package framework.config;

import framework.base.BrowserType;
import framework.config.ConfigReader;


import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {


    public static void PopulateSettings() throws IOException {

        ConfigReader reader = new ConfigReader();
        reader.ReadProperty();

    }


    private void ReadProperty() throws IOException {

        Properties properties = new Properties();

        properties.load(new FileInputStream("GlobalConfig.properties"));

        Settings.AUTConnectionString = properties.getProperty("AUTConnectionString");

        Settings.BrowserType = BrowserType.valueOf(properties.getProperty("BrowserType"));
        Settings.ExcelSheetPath = properties.getProperty("ExcelSheetPath");

        Settings.LogPath = properties.getProperty("LogPath");


    }


}
