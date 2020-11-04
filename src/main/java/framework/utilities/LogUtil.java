package framework.utilities;

//import framework.config.Settings;

import framework.config.Settings;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LogUtil {

// file format for log file

    ZonedDateTime date = ZonedDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyyHHMMSS");
    String fileNameFormat = date.format(formatter);


    private BufferedWriter bufferedWriter = null;


    //Crate Log file


    public void CreateLogFile()  {
        try {
            File dir = new File(Settings.LogPath);
            if (!dir.exists())
                dir.mkdir();

            File logFile = new File(dir + "/" + fileNameFormat +".log");

            FileWriter fileWriter = new FileWriter(logFile.getAbsoluteFile());
            bufferedWriter = new BufferedWriter(fileWriter);


        } catch (Exception e) {
            // e.getStackTrace();
        }


    }

    // Write message witin log file
    public void Write(String message)
    {

        try
        {
            bufferedWriter.write(message);
            bufferedWriter.close();
        }
        catch (Exception e){

        }
    }
}




