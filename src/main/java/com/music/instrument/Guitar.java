package com.music.instrument;

import org.apache.log4j.Logger;

public final class Guitar extends StringedInstrument {
    private static final Logger LOGGER = Logger.getLogger(Guitar.class);

    private String guitarType;
    public Guitar() {

    }

    public Guitar(String guitarType) {
        this.guitarType = guitarType;
    }

    public Guitar(String manufacturer, int price, String guitarType) {
        super(manufacturer, price);
        this.guitarType = guitarType;
    }

    public void setGuitarType(String guitarType) {
        this.guitarType = guitarType;
    }

    public String getGuitarType() {
        return guitarType;
    }

    public void printGuitarType() {
        LOGGER.info("Guitar type: " + guitarType);
    }

    @Override
    public void play() {
        LOGGER.info("Guitar plays");
    }

    @Override
    public void printFields() {
        super.printFields();
        LOGGER.info("Guitar type: " + guitarType);
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "guitarType='" + guitarType + '\'' +
                ", TYPE='" + TYPE + '\'' +
                '}';
    }
}
