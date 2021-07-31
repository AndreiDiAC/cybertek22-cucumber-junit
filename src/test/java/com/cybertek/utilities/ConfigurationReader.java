package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //#1 - Create properties object
    private static Properties properties = new Properties();

    static {

        try {
            //#2 - Load the file into FileInputStream    //bringing the config.prop file into the java memory
            FileInputStream file = new FileInputStream("configuration.properties");

            //#3 - load properties object with the file (configuration.properties)
            properties.load(file);  //loads the file into the properties object

            //close the file
            file.close();


        } catch (IOException e) {
            System.out.println("File not found in Configuration properties");
        }
    }

    //USE THE ABOVE CREATED LOGIN TO CREATE A RE-USING STATIC METHOD
    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }

}
