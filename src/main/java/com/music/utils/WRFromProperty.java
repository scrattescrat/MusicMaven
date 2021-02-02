package com.music.utils;

import java.io.*;
import java.util.Properties;

public class WRFromProperty {



//    static ClassLoader classLoader = this.getClass().getClassLoader();
    Class clazz = WRFromProperty.class;


    public void writeProperty (String path, String key, String value) {
        Properties properties = new Properties();

        try{
            FileOutputStream fileStream = new FileOutputStream(path, true);
            properties.setProperty(key, value);
            properties.store(fileStream, "");
            fileStream.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public String getProperty(String path, String key) {
        Properties properties = new Properties();
        try{
//            FileInputStream fileStream = new FileInputStream("/"+path);
            InputStream fileStream = clazz.getResourceAsStream("/"+path);
            properties.load(fileStream);
            fileStream.close();

            return properties.getProperty(key);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
