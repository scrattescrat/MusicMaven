package com.music.instrument;

import org.apache.log4j.Logger;

public final class Flute extends WindInstrument {

    private static final Logger LOGGER = Logger.getLogger(Flute.class);
    public Flute() {

    }

    public Flute(String manufacturer, int price){
        super(manufacturer, price);
    }

    @Override
    public void play() {
        LOGGER.info("Flute plays");
    }

    @Override
    public String toString() {
        return "Flute{" +
                "TYPE='" + TYPE + '\'' +
                '}';
    }
}
