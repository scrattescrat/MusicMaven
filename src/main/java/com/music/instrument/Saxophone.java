package com.music.instrument;

import org.apache.log4j.Logger;

public final class Saxophone extends WindInstrument {
    private static final Logger LOGGER = Logger.getLogger(Saxophone.class);

    public Saxophone() {

    }

    public Saxophone(String manufacturer, int price){
        super(manufacturer, price);
    }

    @Override
    public void play() {
        LOGGER.info("Saxophone plays");
    }

    @Override
    public String toString() {
        return "Saxophone{" +
                "TYPE='" + TYPE + '\'' +
                '}';
    }
}
