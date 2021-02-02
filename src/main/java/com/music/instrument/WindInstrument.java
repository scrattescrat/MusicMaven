package com.music.instrument;

import org.apache.log4j.Logger;

public abstract class WindInstrument implements Instrument{
    private static final Logger LOGGER = Logger.getLogger(WindInstrument.class);

    private String manufacturer;
    private int price;
    public final String TYPE = "wind_instrument";

    public WindInstrument() {

    }

    public WindInstrument(String manufacturer, int price){
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
        LOGGER.info("Wind Instrument plays");
    }

    @Override
    public void printFields() {
        LOGGER.info("Manufacturer: " + manufacturer);
        LOGGER.info("Price: " + price);
    }
}
