package com.example.findnumber.config;

import com.example.findnumber.beans.Competitor;
import com.example.findnumber.utility.CompetitorUtil;
import com.example.findnumber.utility.FileUtil;
import java.io.IOException;

public class Initialization {

    public static Config config = null;

    public static void configInitializer() {

        try {
            
            Object obj = FileUtil.rideObjectFromFile(ApplicationProperties.FILENAME);
            if (obj != null) {
                config = (Config) obj;
            } else {
                Competitor c = CompetitorUtil.registerCompetitor();
                config = new Config(c);
            }
        } catch (IOException | ClassNotFoundException e) {
            //e.printStackTrace();
        }
    }

    public static void refreshConfig() throws IOException {
        FileUtil.writeObjectToFile(config, ApplicationProperties.FILENAME);
    }
}
