package com.music.instrument;

import org.apache.log4j.Logger;

public final class Synthesizer extends KeyboardInstrument {
    private static final Logger LOGGER = Logger.getLogger(Synthesizer.class);
    private boolean electronic;
    public Synthesizer() {
    }

    public Synthesizer(boolean electronic) {
        this.electronic = electronic;
    }

    public Synthesizer(String manufacturer, int price, boolean electronic) {
        super(manufacturer, price);
        this.electronic = electronic;
    }

    public void setElectronic(boolean electronic) {
        this.electronic = electronic;
    }


    public boolean getElectronic() {
        return electronic;
    }

     @Override
    public void play() {
         LOGGER.info("Synthesizer plays");
    }

    @Override
    public void printFields() {
        super.printFields();
        LOGGER.info("Electronic: " + electronic);
    }

    @Override
    public String toString() {
        return "Synthesizer{" +
                "TYPE='" + TYPE + '\'' +
                ", electronic=" + electronic +
                '}';
    }
}
