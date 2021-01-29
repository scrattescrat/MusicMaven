package com.music.menu;

import com.music.utils.WRFromProperty;

public class Ticket {
    public static void getTicket() {
        WRFromProperty wrFromProperty = new WRFromProperty();
        String getProperty1 = wrFromProperty.getProperty("info.properties", "date");
        String getProperty2 = wrFromProperty.getProperty("info.properties", "time");
        String getProperty3 = wrFromProperty.getProperty("info.properties", "status");
        System.out.println(getProperty1);
        System.out.println(getProperty2);
        System.out.println(getProperty3);


    }

    public static void returnTicket(){
        WRFromProperty wrFromProperty = new WRFromProperty();
        wrFromProperty.writeProperty("info.properties", "status", "returned");
    }



}

