package com.music.instrument;

import org.apache.log4j.Logger;

public abstract class KeyboardInstrument implements Instrument{
    private static final Logger LOGGER = Logger.getLogger(KeyboardInstrument.class);
    private String manufacturer;
    private int price;
    public final String TYPE = "keyboard_instrument";

    public KeyboardInstrument() {
    }

    public KeyboardInstrument(String manufacturer, int price){
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public final void printManufacturer(){
        LOGGER.info("===Manufacturer===");
        LOGGER.info("        " + manufacturer);
    }

    @Override
    public void play() {
        LOGGER.info("Keyboard Instrument plays");
    }

    @Override
    public void printFields() {
        LOGGER.info("Manufacturer: " + manufacturer);
        LOGGER.info("Price: " + price);
    }


}

