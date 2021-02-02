package com.music.instrument;

import org.apache.log4j.Logger;

public final class Violin extends StringedInstrument {
    private static final Logger LOGGER = Logger.getLogger(Violin.class);

    public Violin() {

    }

    public Violin(String manufacturer, int price){
        super(manufacturer, price);
    }

    @Override
    public void play() {
        LOGGER.info("Violin plays");
    }

    @Override
    public String toString() {
        return "Violin{" +
                "TYPE='" + TYPE + '\'' +
                '}';
    }
}
