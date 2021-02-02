package com.music.instrument;


import org.apache.log4j.Logger;

public abstract class StringedInstrument implements Instrument{
    private static final Logger LOGGER = Logger.getLogger(StringedInstrument.class);
    private String manufacturer;
    private int price;
    public final String TYPE = "stringed_instrument";

    public StringedInstrument() {

    }

    public StringedInstrument(String manufacturer, int price){
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
        LOGGER.info("Stringed Instrument plays");
    }

    @Override
    public void printFields() {
        LOGGER.info("Manufactuter: " + manufacturer);
        LOGGER.info("Price: " + price);
    }
}
