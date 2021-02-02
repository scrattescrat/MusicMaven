package com.music.menu;

import com.music.utils.WRFromProperty;
import org.apache.log4j.Logger;

public class Ticket {
    private static final Logger LOGGER = Logger.getLogger(Ticket.class);

    public static void getTicket() {
        LOGGER.info("Get ticket");
        LOGGER.info("------------------");
        WRFromProperty wrFromProperty = new WRFromProperty();
        String getProperty1 = wrFromProperty.getProperty("info.properties", "date");
        String getProperty2 = wrFromProperty.getProperty("info.properties", "time");
        String getProperty3 = wrFromProperty.getProperty("info.properties", "status");
//        System.out.println(getProperty1);
//        System.out.println(getProperty2);
//        System.out.println(getProperty3);
        LOGGER.info(getProperty1);
        LOGGER.info(getProperty2);
        LOGGER.info(getProperty3);


    }

    public static void returnTicket(){
        LOGGER.info("Return Ticket");
        WRFromProperty wrFromProperty = new WRFromProperty();
        wrFromProperty.writeProperty("info.properties", "status", "returned");

    }



}

