package com.music.event;

import com.music.instrument.*;
import com.music.utils.JsonExec;
import org.apache.log4j.Logger;

import java.util.*;

public class Orchestra {

    private static final Logger LOGGER = Logger.getLogger(Orchestra.class);


    List<WindInstrument> jazzMelody;
    List<KeyboardInstrument> band;
    Set<Instrument> uniqueStorage;

    public int size = 12;

    public Orchestra(){
        jazzMelody = new ArrayList<WindInstrument>();
        band = new LinkedList<KeyboardInstrument>();
        uniqueStorage = new HashSet<Instrument>();
    }

    public Orchestra(KeyboardInstrument keyboardInstrument, Instrument instrument){
        jazzMelody = new ArrayList<WindInstrument>();
        band = new LinkedList<KeyboardInstrument>();
        size ++;
    }

    public Set<Instrument> getUniqueStorage() {
        return uniqueStorage;
    }

    public List<WindInstrument> getJazzMelody() {
        return jazzMelody;
    }

    public void addWindInstrument(WindInstrument instrument) {
        LOGGER.info("Add Instrument");
        jazzMelody.add(instrument);
    }

    public void addKeyboardInstrument(KeyboardInstrument keyboardInstrument) {
//        LOGGER.info("Add Keyboard Instrument");
        band.add(keyboardInstrument);
    }

    public void addUniqueInstrument(Instrument instrument) {
        LOGGER.info("addUniqueInstrument");
        uniqueStorage.add(instrument);
    }

    public void deleteWindInstrument(WindInstrument instrument) {
        jazzMelody.remove(instrument);
    }

    public void deleteWindInstrument(int num) {
        jazzMelody.remove(num);
    }

    public void deleteKeyboardInstrument(KeyboardInstrument keyboardInstrument) {
        band.remove(keyboardInstrument);
    }



    public void printInfo() {


        LOGGER.info("=======THE BAND=======");

        for (Object keyboardInstrument : band) {
            LOGGER.info(keyboardInstrument.toString());
        }

    }


}


