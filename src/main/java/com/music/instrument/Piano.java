package com.music.instrument;

import org.apache.log4j.Logger;

public final class Piano extends KeyboardInstrument {
    private static final Logger LOGGER = Logger.getLogger(KeyboardInstrument.class);

    private String colour;
    public Piano() {
    }

    public Piano(String colour) {
        this.colour = colour;
    }

    public Piano(String manufacturer, int price, String colour) {
        super(manufacturer, price);
        this.colour = colour;
    }

    public void setColour (String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public void play() {
        LOGGER.info("Piano plays");
    }

    @Override
    public void printFields() {
        super.printFields();
        LOGGER.info("Colour: " + colour);
    }

    @Override
    public String toString() {
        return "Piano{" +
                "TYPE='" + TYPE + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
